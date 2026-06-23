// Product Management model authored as a Groovy DSL (nasdanika.pm.groovy).
// product / capability / concern / addresses are bound by the .pm transform handler;
// none of them are declared here - see groovy-kotlin-dsl-design.md sections 5.2 and 5.4.
//
// Note: 'addresses' is a containment reference, so each capability addresses its own concern.
product {
    id 'business-banking'
    name 'Business Banking Platform'
    documentation 'Sample product model authored in Groovy'

    capability {
        id 'automated-kyc'
        name 'Automated KYC'
        lifecycle 'AVAILABLE'

        // Tier 1 cross-reference: capture the concern in a variable and pass it directly.
        def latency = concern {
            id 'kyc-latency'
            name 'KYC onboarding latency'
            documentation 'Time from application to first usable account'
        }
        addresses latency
    }

    capability {
        id 'fraud-detection'
        name 'Fraud Detection'
        lifecycle 'IN_PROGRESS'

        concern {
            id 'fraud-risk'
            name 'Fraud risk'
        }
        // Tier 2 cross-reference: by id, resolved after the whole script has been evaluated.
        addresses 'fraud-risk'
    }
}
