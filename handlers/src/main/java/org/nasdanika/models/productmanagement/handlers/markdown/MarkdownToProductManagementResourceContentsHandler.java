package org.nasdanika.models.productmanagement.handlers.markdown;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.common.LoggerProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.models.markdown.Document;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.HeadingLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarkdownToProductManagementResourceContentsHandler implements ResourceContentsHandler<EObject[]> {

	private static final Logger LOGGER = LoggerFactory.getLogger(MarkdownToProductManagementResourceContentsHandler.class);
	
	private ResourceContentsHandler<Document> documentHandler;
	
	private Resource resource;	
	
	public MarkdownToProductManagementResourceContentsHandler(Resource resource, ResourceContentsHandler<Document> docuentHandler) {
		this.resource = resource;
		this.documentHandler = docuentHandler;
	}
	
	@Override
	public EObject[] load(InputStream inputStream, Map<?, ?> options) throws IOException {
		return map(resource, documentHandler.load(inputStream, options));
	}
		
	private EObject[] map(Resource resource, Document document) {		
		return document.getChildren()
			.stream()
			.map(e -> {
				if (e instanceof Heading heading && heading.getLevel() == HeadingLevel.H1) {
					return mapHeading(resource, document.getContent(), heading);
				}
				// TODO - add an error or a warning to the resource that only H1 headings are supported
				return e;
			})
			.toArray(EObject[]::new);
	}

	private EObject mapHeading(Resource resource, String markdown, Heading heading) {
		Transformer<Object,EObject> markdownTransformer = new Transformer<>(new MarkdownToProductManagementFactory(resource, markdown));				
		try (ProgressMonitor progressMonitor = new LoggerProgressMonitor(LOGGER)) {
			return markdownTransformer.transform(List.of(heading), false, progressMonitor).get(heading);
		}		
	}

	@Override
	public Order getOrder() {
		return documentHandler.getOrder().add(0);
	}

}

