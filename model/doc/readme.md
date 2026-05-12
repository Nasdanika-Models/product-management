# Product Management Metamodel

A pragmatic, just-enough Xcore metamodel for product management as code.
Elements are federated text-based artifacts authored in version control,
published as Maven artifacts, and consumed across teams.

The model serves three intersecting views of the same elements:

- **Polity-allocation view** — who has authority to bind decisions about resource allocation toward addressing persona concerns.
- **Exchange view** — concerns are asks; capabilities are bids. Work packages are bids on concerns.
- **Decision-binding view** — the model formalizes the incremental binding of decisions with provenance and authority.

## Reference models

This metamodel composes with and references:

| Model | nsURI |
|---|---|
| ncore | `ecore://nasdanika.org/core/ncore` |
| architecture | `ecore://nasdanika.org/models/architecture` |
| capability | `ecore://nasdanika.org/models/capability` |
| mcda | `ecore://nasdanika.org/models/mcda` |
| enterprise | `ecore://nasdanika.org/models/enterprise` |
| party | `ecore://nasdanika.org/models/party` |

## Diagram

```drawio-resource
../product-management.drawio
```