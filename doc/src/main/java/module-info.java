import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.productmanagement.doc.ProductManagementNodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.productmanagement.doc {
		
	requires transitive org.nasdanika.models.productmanagement;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.productmanagement.doc;
	opens org.nasdanika.models.productmanagement.doc; // For loading resources

	provides CapabilityFactory with	ProductManagementNodeProcessorFactoryCapabilityFactory;
	
}
