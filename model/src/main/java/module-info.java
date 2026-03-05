import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.productmanagement.util.ProductManagementEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.productmanagement {
	
	exports org.nasdanika.models.productmanagement;
	exports org.nasdanika.models.productmanagement.impl;
	exports org.nasdanika.models.productmanagement.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with ProductManagementEPackageResourceSetCapabilityFactory;
	
}