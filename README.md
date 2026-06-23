# Nasdanika Product Management Model

A pragmatic, just-enough Xcore metamodel for product management as code. 
Elements are federated text-based artifacts authored in version control, published as Maven artifacts, and consumed across teams.

* **Documentation site:** https://product-management.models.nasdanika.org/
* **Template repository to start your own model:** https://github.com/Nasdanika-Templates/product-management

## Executive summary

Most product strategy work goes into *push*: positioning statements, feature briefs, vendor pitches, competitive landscape decks, talking points prepared for the next steering committee. 
Every capability owner pushes a narrative; every consumer absorbs whichever narrative reached them first or was packaged most insistently.
Decisions get made on rhetoric, and the rhetoric is optimized for the room rather than for the consumer.

This metamodel flips the direction. Personas - the consumers - articulate concerns: goals to reach, needs to satisfy, pain points to resolve. 
Capabilities are *pulled* by those concerns. The question *"what addresses this concern of this persona, with what evidence, under whose authority, at what maturity?"* has a queryable
answer over the federated graph.

Four consequences follow that are hard to obtain in the push mode:

- **Decisions cite the model rather than the loudest voice.** Evaluating a proposal becomes a query over personas, concerns, evidence, dependencies, and authority. The arena moves from rhetoric to structure.
- **Internal and external offerings are evaluated on equal terms.** A vendor product, an internal platform, and an early-stage internal proposal enter the model in the same shape. The political asymmetry that otherwise favors the vendor narrative is removed from the input stage.
- **Communication is calibrated to the audience by construction.** A senior leader, an architect, and a delivery lead each see the view of the same capability that fits their level of abstraction, derived from one model.
- **AI assistance becomes useful where it previously stalled.** An agent reasoning over a typed federated graph can answer pull queries with citations, route follow-ups deterministically, and operate as a first-class consumer alongside humans.

## What you can do today

- **Use the metamodel as a reasoning substrate.** Hand the [documentation site](https://product-management.models.nasdanika.org/) to your preferred GenAI assistant and ask it to help you reason about a product, platform, or modernization scenario in the model's vocabulary.
- **Author your own consuming model.** Fork the [template repository](https://github.com/Nasdanika-Templates/product-management), edit YAML, push, get a published documentation site for free.
- **Federate with others.** Reference other teams' published models the same way code references its dependencies - Maven coordinates, version-controlled, citable.

See the [documentation site](https://product-management.models.nasdanika.org/) for the full design, use cases, agentic execution roadmap (NSML, Waypoint, OpGraph), and worked examples.

## License

EPL-2.0
