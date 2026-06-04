package org.nasdanika.models.productmanagement.filters.markdown;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.markdown.Attribute;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.Node;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

public class MarkdownToProductManagementFactory {
	
	public static final String TYPE_ATTR = "type";
	
	private Resource resource;
	private String markdown;
	
	/**
	 * A request to populate an EObject from a Markdown Node. The source Node is provided to allow access to attributes and other information that may be needed to populate the EObject. The target EObject is provided to allow populating it with information from the source Node.
	 */
	public record EObjectRequest(Node source, EObject target) {
		
	}

	public MarkdownToProductManagementFactory(Resource resource, String markdown) {
		this.resource = resource;
		this.markdown = markdown;
	}
		
	@org.nasdanika.common.Transformer.Factory("level.value == 1")
	public EObject createTopLevelElement(
		Heading heading,
		boolean parallel,
		BiConsumer<Object, BiConsumer<Object,ProgressMonitor>> elementProvider, 
		Consumer<BiConsumer<Map<Object, EModelElement>,ProgressMonitor>> registryProvider,
		ProgressMonitor progressMonitor) {

		String typeName = ProductmanagementPackage.Literals.PRODUCT_MODEL.getName();
		for (Attribute attr: heading.getAttributes()) {
			switch (attr.getKey()) {
			case TYPE_ATTR:
				typeName = attr.getValue();
				break;
			}
		}
		
		EObject result = ProductmanagementFactory.eINSTANCE.create((EClass) ProductmanagementPackage.eINSTANCE.getEClassifier(typeName));

		BuilderTarget builderTarget = new BuilderTarget(resource, markdown, elementProvider, registryProvider);
		new Builder(builderTarget).build(heading, result, progressMonitor);		
		elementProvider.accept(new EObjectRequest(heading, result), null);
				
		return result;	
	}	
	
}
