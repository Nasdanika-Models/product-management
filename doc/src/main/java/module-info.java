import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.bw5.doc.Bw5NodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.bw5.doc {
		
	requires transitive org.nasdanika.models.bw5;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.bw5.doc;
	opens org.nasdanika.models.bw5.doc; // For loading resources

	provides CapabilityFactory with	Bw5NodeProcessorFactoryCapabilityFactory;
	
}
