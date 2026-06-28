// Product Management model authored as a Groovy DSL (nasdanika.pm.groovy).
// product / capability / concern / addresses are bound by the .pm transform handler;
// none of them are declared here - see groovy-kotlin-dsl-design.md sections 5.2 and 5.4.
//
// Note: 'addresses' is a containment reference, so each capability addresses its own concern.
productModel {
    id 'business-banking'
    name 'Business Banking Platform'
    documentation 'Sample product model authored in Groovy'

    capabilities('Capability') {
        id 'automated-kyc'
        name 'Automated KYC'
        lifecycle 'AVAILABLE'

        // Tier 1 cross-reference: capture the concern in a variable and pass it directly.
        def latency = concerns('Concern') {
            id 'kyc-latency'
            name 'KYC onboarding latency'
            documentation 'Time from application to first usable account'
        }
		
		addresses latency
		
		addresses('Concern') {
            id 'kyc-accuracy'
            name 'KYC accuracy'
            documentation 'False positive and false negative rates'
        }
		
    }

    capabilities('Capability') {
        id 'fraud-detection'
        name 'Fraud Detection'
        lifecycle 'IN_PROGRESS'

        concerns('Concern') {
            id 'fraud-risk'
            name 'Fraud risk'
        }
        // Tier 2 cross-reference: by id, resolved after the whole script has been evaluated.
        addresses('Concern') {
			proxy 'https://mysite.com/fraud-risk#purum'
        }
    }
	
}
