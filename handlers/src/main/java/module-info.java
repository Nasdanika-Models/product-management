import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.productmanagement.handlers.markdown.MarkdownToProductManagementResourceContentsHandlerCapabilityFactory;

module org.nasdanika.models.productmanagement.handlers {
	
	exports org.nasdanika.models.productmanagement.handlers.markdown;
	opens org.nasdanika.models.productmanagement.handlers.markdown to org.nasdanika.common; // For transformer and reflector	
	
	requires transitive org.nasdanika.models.productmanagement;
	requires transitive org.nasdanika.models.markdown;
	requires org.apache.commons.lang3;
	
	provides CapabilityFactory with 
		MarkdownToProductManagementResourceContentsHandlerCapabilityFactory;
	
}