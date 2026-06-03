package org.nasdanika.models.productmanagement.filters.markdown;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.common.LoggerProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.HeadingLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarkdownToProductManagementResourceContentsFilter implements ResourceContentsFilter {
	
	private static final String PRODUCT_MANAGEMENT_QUALIFIER = "pm";

	private static final Logger LOGGER = LoggerFactory.getLogger(MarkdownToProductManagementResourceContentsFilter.class);	

	@Override
	public List<EObject> load(
			Resource resource, 
			List<EObject> contents, 
			String[] qualifiers, 
			int qualifierPosition,
			Map<?, ?> options) throws IOException {
		
		if (PRODUCT_MANAGEMENT_QUALIFIER.equals(qualifiers[qualifierPosition])) {
			return contents
				.stream()
				.flatMap(e -> e instanceof Document document ? map(resource, document).stream() : Stream.of(e))
				.toList();
		}
		return ResourceContentsFilter.super.load(resource, contents, qualifiers, qualifierPosition, options);
	}
	
	@Override
	public List<EObject> save(
			Resource resource, 
			List<EObject> contents, 
			String[] qualifiers, 
			int qualifierPosition,
			Map<?, ?> options) throws IOException {
		
		if (PRODUCT_MANAGEMENT_QUALIFIER.equals(qualifiers[qualifierPosition])) {
			throw new UnsupportedOperationException("Saving to Markdown format is not supported");
		}
		return ResourceContentsFilter.super.save(resource, contents, qualifiers, qualifierPosition, options);
	}
	
	private List<EObject> map(Resource resource, Document document) {		
		return document.getChildren()
			.stream()
			.map(e -> {
				if (e instanceof Heading heading && heading.getLevel() == HeadingLevel.H1) {
					return mapHeading(resource, document.getContent(), heading);
				}
				// TODO - add an error or a warning to the resource that only H1 headings are supported
				return e;
			})
			.toList();
	}

	private EObject mapHeading(Resource resource, String markdown, Heading heading) {
		Transformer<Object,EObject> markdownTransformer = new Transformer<>(new MarkdownToProductManagementFactory(resource, markdown));				
		try (ProgressMonitor progressMonitor = new LoggerProgressMonitor(LOGGER)) {
			return markdownTransformer.transform(List.of(heading), false, progressMonitor).get(heading);
		}		
	}

}