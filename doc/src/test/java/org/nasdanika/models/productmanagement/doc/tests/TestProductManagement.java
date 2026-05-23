package org.nasdanika.models.productmanagement.doc.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

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
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Lifecycle;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;


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
		goal.setDocumentation("Explains the goal in more detail");
		externalPersona.getConcerns().add(goal);

		// Need: access to automated data aggregation tools - supports the goal
		Need need = factory.createNeed();
		need.setId("automated-data-aggregation");
		need.setName("Access to automated data aggregation tools");
		need.setDocumentation("Explains the need in more detail");
		ConcernReference supportedGoal = factory.createConcernReference();
		supportedGoal.setTarget(goal);
		supportedGoal.setDocumentation("Expolins how it supports the goal");
		need.getSupports().add(supportedGoal);
		externalPersona.getConcerns().add(need);

		// Pain point: data is siloed across incompatible systems - violates the need and blocks the goal
		PainPoint painPoint = factory.createPainPoint();
		painPoint.setId("siloed-data-systems");
		painPoint.setName("Data is siloed across incompatible systems");
		painPoint.setDocumentation("Explains the pain point in more detail");
		ConcernReference violatedNeed = factory.createConcernReference();
		violatedNeed.setTarget(need);
		painPoint.getViolates().add(violatedNeed);
		
		ConcernReference blockedGoal = factory.createConcernReference();
		blockedGoal.setTarget(goal);
		painPoint.getBlocks().add(blockedGoal);
		externalPersona.getConcerns().add(painPoint);

		externalPersonaResource.save(null);

		// Capability: automated data aggregation - addresses the need
		Capability capability = factory.createCapability();
		capability.setId("automated-data-aggregation");
		capability.setName("Automated Data Aggregation");
		capability.setDocumentation("Provides access to automated data aggregation tools");
		capability.setLifecycle(Lifecycle.IN_PROGRESS);
		ConcernReference addressedConcerns = factory.createConcernReference();
		addressedConcerns.setTarget(need);
		String capabilityDocRef = "automated-data-aggregation.md";
		addressedConcerns.setDocRef(capabilityDocRef);		
		capability.getAddresses().add(addressedConcerns);		
		
		assertEquals(1, capability.getAllAddresses().size());
						
		CapabilityReference capabilityReferenece = factory.createCapabilityReference();
		capabilityReferenece.setTarget(capability);
		capabilityReferenece.setId("automated-data-aggregation-ref");
		productModel.getCapabilities().add(capabilityReferenece);		

		File capabilityFile = new File("target/sample-product-model/automated-data-aggregation.yaml").getCanonicalFile();
		Resource capabilityResource = resourceSet.createResource(URI.createFileURI(capabilityFile.getAbsolutePath()));
		capabilityResource.getContents().add(capability);
		capabilityResource.save(null);
		
		Files.writeString(capabilityFile.getParentFile().toPath().resolve(Path.of(capabilityDocRef)), "Explains how it addresses the need");		
		
		productModelResource.save(null);		
	}

}
