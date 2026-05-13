package org.nasdanika.models.productmanagement.doc.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;


public class TestProductManagement {
	
	@Test
	public void testCreateProductManagementModel() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File processFile = new File("target/sample-product-model/product-model.yml").getCanonicalFile();
		Resource productModelResource = resourceSet.createResource(URI.createFileURI(processFile.getAbsolutePath()));		
		
		ProductmanagementFactory factory = new ProductmanagementFactory.eINSTANCE;
		
		
		
		
	}

}
