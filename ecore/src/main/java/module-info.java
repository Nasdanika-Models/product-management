import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.productmanagement.ecore.ECoreGenProductManagementProcessorsCapabilityFactory;

module org.nasdanika.models.productmanagement.ecore {
		
	requires transitive org.nasdanika.models.productmanagement;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.productmanagement.ecore;
	opens org.nasdanika.models.productmanagement.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenProductManagementProcessorsCapabilityFactory; 		
	
}
