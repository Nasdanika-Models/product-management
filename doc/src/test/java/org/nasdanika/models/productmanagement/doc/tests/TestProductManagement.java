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
import org.nasdanika.models.productmanagement.AddressedConcerns;
import org.nasdanika.models.productmanagement.BlockedGoals;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Lifecycle;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.SupportedGoals;
import org.nasdanika.models.productmanagement.ViolatedNeeds;


public class TestProductManagement {
	
	@Test
	public void testCreateProductManagementModel() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File productModelFile = new File("target/sample-product-model/product-model.yaml").getCanonicalFile();
		Resource productModelResource = resourceSet.createResource(URI.createFileURI(productModelFile.getAbsolutePath()));		
		
		ProductmanagementFactory factory = ProductmanagementFactory.eINSTANCE;
		ProductModel productModel = factory.createProductModel();
		productModel.setName("Sample product model");
		productModel.setDocumentation("Sample documentation");
		productModelResource.getContents().add(productModel);
		
		// Nested persona
		Persona persona = factory.createPersona();
		persona.setName("Sample persona");
		persona.setId("sample-persona");
		persona.setDocumentation("Sample persona documentation");
		productModel.getPersonas().add(persona);
		
		
		
		// Persona reference
		Persona externalPersona = factory.createPersona();
		externalPersona.setName("External persona");
		externalPersona.setId("external-persona");
		externalPersona.setDocumentation("External persona documentation");
		
		PersonaReference externalPersonaReference = factory.createPersonaReference();
		externalPersonaReference.setTarget(externalPersona);
		externalPersonaReference.setId("external-persona-ref");
		productModel.getPersonas().add(externalPersonaReference);
		
		File externalPersonaFile = new File("target/sample-product-model/external-persona.yaml").getCanonicalFile();
		Resource externalPersonaResource = resourceSet.createResource(URI.createFileURI(externalPersonaFile.getAbsolutePath()));		
		externalPersonaResource.getContents().add(externalPersona);

		// Goal: external persona wants to reduce time spent on manual reporting
		Goal goal = factory.createGoal();
		goal.setId("reduce-manual-reporting");
		goal.setName("Reduce time spent on manual reporting");
		externalPersona.getConcerns().add(goal);

		// Need: access to automated data aggregation tools - supports the goal
		Need need = factory.createNeed();
		need.setId("automated-data-aggregation");
		need.setName("Access to automated data aggregation tools");
		SupportedGoals supportedGoals = factory.createSupportedGoals();
		supportedGoals.getGoals().add(goal);
		need.getSupports().add(supportedGoals);
		externalPersona.getConcerns().add(need);

		// Pain point: data is siloed across incompatible systems - violates the need and blocks the goal
		PainPoint painPoint = factory.createPainPoint();
		painPoint.setId("siloed-data-systems");
		painPoint.setName("Data is siloed across incompatible systems");
		ViolatedNeeds violatedNeeds = factory.createViolatedNeeds();
		violatedNeeds.getNeeds().add(need);
		painPoint.getViolates().add(violatedNeeds);
		BlockedGoals blockedGoals = factory.createBlockedGoals();
		blockedGoals.getGoals().add(goal);
		painPoint.getBlocks().add(blockedGoals);
		externalPersona.getConcerns().add(painPoint);

		externalPersonaResource.save(null);

		// Capability: automated data aggregation - addresses the need
		Capability capability = factory.createCapability();
		capability.setId("automated-data-aggregation");
		capability.setName("Automated Data Aggregation");
		capability.setLifecycle(Lifecycle.IN_PROGRESS);
		AddressedConcerns addressedConcerns = factory.createAddressedConcerns();
		addressedConcerns.getConcerns().add(need);
		addressedConcerns.setDocumentation("Explains how it addresses the need");
		capability.getAddresses().add(addressedConcerns);
		
		CapabilityReference capabilityReferenece = factory.createCapabilityReference();
		capabilityReferenece.setTarget(capability);
		capabilityReferenece.setId("automated-data-aggregation-ref");
		productModel.getCapabilities().add(capabilityReferenece);		

		File capabilityFile = new File("target/sample-product-model/automated-data-aggregation.yaml").getCanonicalFile();
		Resource capabilityResource = resourceSet.createResource(URI.createFileURI(capabilityFile.getAbsolutePath()));
		capabilityResource.getContents().add(capability);
		capabilityResource.save(null);
		
		productModelResource.save(null);		
	}

}
