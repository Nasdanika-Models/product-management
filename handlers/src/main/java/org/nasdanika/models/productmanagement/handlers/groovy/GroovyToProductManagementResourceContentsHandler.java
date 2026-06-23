package org.nasdanika.models.productmanagement.handlers.groovy;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.capability.scripting.CompiledSource;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.dsl.groovy.ProductManagementGroovyDsl;

/**
 * Transform handler for the {@code .pm} qualifier over a {@code .groovy} source. It resolves the
 * upstream source handler to obtain a {@link CompiledSource}, builds and installs the Product
 * Management Groovy DSL helpers per call, evaluates the compiled script, resolves deferred
 * id-based references, then normalizes the result to {@code EObject[]}. Mirrors
 * {@code MarkdownToProductManagementResourceContentsHandler}.
 */
public class GroovyToProductManagementResourceContentsHandler implements ResourceContentsHandler<EObject[]> {

	private ResourceContentsHandler<CompiledSource> sourceHandler;

	private Resource resource;

	public GroovyToProductManagementResourceContentsHandler(Resource resource, ResourceContentsHandler<CompiledSource> sourceHandler) {
		this.resource = resource;
		this.sourceHandler = sourceHandler;
	}

	@Override
	public EObject[] load(InputStream inputStream, Map<?, ?> options) throws IOException {
		CompiledSource compiledSource = sourceHandler.load(inputStream, options);

		ProductManagementGroovyDsl dsl = new ProductManagementGroovyDsl(ProductmanagementFactory.eINSTANCE, resource);
		Map<String, Object> bindings = new HashMap<>();
		dsl.installInto(bindings);

		Object result = compiledSource.eval(bindings);
		dsl.resolveDeferred();

		return normalize(result, dsl);
	}

	/**
	 * Normalizes the script result into resource contents. A returned {@code EObject}, array or
	 * iterable of {@code EObject}s is flattened; if the script returned nothing usable, the elements
	 * built through the DSL entry points (e.g. {@code product { }}) are used instead.
	 */
	private EObject[] normalize(Object result, ProductManagementGroovyDsl dsl) {
		List<EObject> contents = new ArrayList<>();
		collect(result, contents);
		if (contents.isEmpty()) {
			contents.addAll(dsl.getRoots());
		}
		return contents.toArray(EObject[]::new);
	}

	private void collect(Object value, List<EObject> contents) {
		if (value instanceof EObject eObject) {
			contents.add(eObject);
		} else if (value instanceof Object[] array) {
			for (Object element : array) {
				collect(element, contents);
			}
		} else if (value instanceof Iterable<?> iterable) {
			for (Object element : iterable) {
				collect(element, contents);
			}
		}
	}

	@Override
	public Order getOrder() {
		return sourceHandler.getOrder().add(0);
	}

}
