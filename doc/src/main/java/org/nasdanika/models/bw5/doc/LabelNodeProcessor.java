package org.nasdanika.models.bw5.doc;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;

public class LabelNodeProcessor extends NodeNodeProcessor<org.nasdanika.models.bw5.Label> {

	public LabelNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		
	
//	@Override
//	protected String getTypeIcon() {
//		return RESOURCE_ICON;
//	}	
	
//	protected void createImportsSection(Action codeAction, ProgressMonitor progressMonitor) {
//		// TODO - as a table
//		if (documentationFactories != null && !documentationFactories.isEmpty()) {
//			Code target = getTarget();
//			String imports = target.getImports();
//			if (!Util.isBlank(imports)) {
//				Optional<DocumentationFactory> dfo = documentationFactories
//						.stream()
//						.filter(df -> df.canHandle(Content.MARKDOWN))
//						.findAny();
//					
//				if (dfo.isPresent()) {
//					Collection<EObject> documentation = dfo.get().createDocumentation(
//							target, 
//							"""
//							```yaml
//							%s
//							```
//							""".formatted(imports), 
//							Content.MARKDOWN, 
//							target.eResource() == null ? null : target.eResource().getURI(),
//							Collections.<String,String>emptyMap()::get,
//							progressMonitor);
//
//					if (!documentation.isEmpty()) {						
//						Action importsAction = getRoleActionByName(
//								codeAction.getSections(), 
//								"imports", 
//								"Imports", 
//								null);
//						
//						importsAction.getContent().addAll(documentation);
//					}					
//				}
//			}
//		}
//	}
	
	
}
