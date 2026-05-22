package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Predicate;

import org.apache.commons.text.StringEscapeUtils;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Content;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.emf.AbstractDrawioFactory;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.models.bootstrap.Table;
import org.nasdanika.models.productmanagement.Icon;
import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.NamedElement;

/**
 * Base class for other processors with common functionality.
 * @param <T>
 */
public abstract class ModelElementNodeProcessor<T extends EObject> extends EObjectNodeProcessor<T> implements NodeProcessorMixIn<T> {
		
	protected Collection<DocumentationFactory> documentationFactories;
	
	protected ModelElementNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider);
		this.documentationFactories = documentationFactories;
	}		
	
	/**
	* Suppressing default behavior, explicit specification of how to build.
	*/	
	@Override
	protected void addReferenceChildren(
		EReference eReference, 
		Collection<Label> labels, 
		Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
		ProgressMonitor progressMonitor) {
	}
	
	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Action action = (Action) super.createAction(progressMonitor);
		
		Table propertiesTable = createPropertiesTable(progressMonitor);
		if (propertiesTable != null) {
			action.getContent().add(0, propertiesTable);
		}
		
		if (documentationFactories != null && !documentationFactories.isEmpty()) {
			T target = getTarget();
			if (target instanceof ModelElement modelElement) {
				String doc = modelElement.getDocumentation();
				if (!Util.isBlank(doc)) {
					Optional<DocumentationFactory> dfo = documentationFactories
							.stream()
							.filter(df -> df.canHandle(Content.MARKDOWN))
							.findAny();
						
					if (dfo.isPresent()) {
						Collection<EObject> documentation = dfo.get().createDocumentation(
								target, 
								doc, 
								Content.MARKDOWN, 
								target.eResource() == null ? null : target.eResource().getURI(),
								Collections.<String,String>emptyMap()::get,
								progressMonitor);
	
						action.getContent().addAll(documentation);
					}
				}
			}
		}		
						
		return action;
	}
	
	/**
	 * Override to customize name, e.g. replace blank name with some generated name
	 * @param namedElement
	 * @return
	 */
	protected String getName(NamedElement namedElement) {
		return namedElement.getName();
	}	
		
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		if (source instanceof NamedElement namedElement && Util.isBlank(label.getText())) {
			label.setText(StringEscapeUtils.escapeHtml4(getName(namedElement)));
		}
		if (source == getTarget()) {
			if (Util.isBlank(label.getIcon())) {
				label.setIcon(getIcon());
			}
		}		
		if (Util.isBlank(label.getTooltip()) && source instanceof ModelElement modelElement) {
			String doc = modelElement.getDocumentation();
			if (!Util.isBlank(doc)) {
				String firstPlainTextSentence = MarkdownHelper.INSTANCE.firstPlainTextSentence(doc);
				label.setTooltip(firstPlainTextSentence);				
			} 
		}		
	}

	public String getIcon() {		
		for (Map.Entry<String, String> representation: getRepresentations().entrySet()) {
			if (AbstractDrawioFactory.IMAGE_REPRESENTATION.equals(representation.getKey())) {
				String imageRepr = representation.getValue();
				return getImageRepresentationIcon(imageRepr);				
			}
		}
		
		return getTypeIcon();
	}	
	
	public String getTypeIcon() {
		return Icon.getIcon(getTarget());
	}
	
	/**
	 * Returns an action matched by location, creates if necessary..
	 * @param parent
	 * @return
	 */
	public Action getRoleActionByLocation(
			Collection<? super Action> roleActions, 
			String location, 
			String text,
			String icon) {
		
		Action ret = getRoleAction(
				roleActions, 
				e -> e instanceof Action && location.equals(((Action) e).getLocation()), 
				text, 
				icon);
		
		ret.setLocation(location);
		return ret;
	}	
	
	/**
	 * Returns an action matched by name (for sections), creates if necessary..
	 * @param parent
	 * @return
	 */
	public Action getRoleActionByName(
			Collection<? super Action> roleActions, 
			String name, 
			String text,
			String icon) {
		
		Action ret = getRoleAction(
				roleActions, 
				e -> e instanceof Action && name.equals(((Action) e).getName()), 
				text, 
				icon);
		
		ret.setName(name);
		return ret;
	}	
		
	/**
	 * Returns an action matched by predicate, creates if necessary..
	 * @param parent
	 * @return
	 */
	public Action getRoleAction(
			Collection<? super Action> roleActions, 
			Predicate<Object> predicate, 
			String text,
			String icon) {
		
		return roleActions
			.stream()
			.filter(predicate)
			.findFirst()
			.map(Action.class::cast)
			.orElseGet(() -> {
				Action ret = AppFactory.eINSTANCE.createAction();
				ret.setText(text);
				ret.setIcon(icon);
				roleActions.add(ret);
				return ret;
			});
	}	

	/**
	 * Builds columns for {@link ENamedElement}
	 * @param tableBuilder
	 * @param progressMonitor
	 */
	public void buildNamedElementColumns(DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> tableBuilder, ProgressMonitor progressMonitor) {
		tableBuilder
			.addStringColumnBuilder("name", true, false, "Name", endpoint -> targetNameLink(endpoint.getKey(), endpoint.getValue(), progressMonitor)) 
			.addStringColumnBuilder("description", true, false, "Description", endpoint -> description(endpoint.getKey(), endpoint.getValue(), progressMonitor));
	}
	
	public String targetNameLink(EReferenceConnection connection, WidgetFactory widgetFactory, ProgressMonitor progressMonitor) {
		String linkStr = widgetFactory.createLinkString(progressMonitor);
		return Util.isBlank(linkStr) ? ((NamedElement) connection.getTarget().get()).getName() : linkStr;
	}
	
	public String description(EReferenceConnection connection, WidgetFactory widgetFactory, ProgressMonitor progressMonitor) {
		Object label = widgetFactory.createLabel(progressMonitor);
		return label instanceof Label ? ((Label) label).getTooltip() : null;
	}
	
	@Override
	public ModelElementNodeProcessor<T> self() {
		return this;
	}
		
}
