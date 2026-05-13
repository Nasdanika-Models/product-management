import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.productmanagement.capability.ProductManagementEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.productmanagement {
	
	exports org.nasdanika.models.productmanagement;
	exports org.nasdanika.models.productmanagement.impl;
	exports org.nasdanika.models.productmanagement.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	requires transitive org.nasdanika.ncore;
	
	provides CapabilityFactory with 
		ProductManagementEPackageResourceSetCapabilityFactory;
	
}