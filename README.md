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

## Intent is the bottleneck

When coding agents can implement almost anything quickly, writing the code stops being the hard part. The hard part - and the part that decides whether the output is worth anything - is **knowing what to build and why**: whose concern it serves, what evidence says the concern is real, and whether it matters more than the next thing. The scarce, decisive artifact is no longer the implementation; it is a precise, shared, machine-readable statement of *intent*.

That is what this metamodel is. Read end to end, the type chain is an intent pipeline:

> **persona → concern → capability → capability provider**

- **Elicitation.** A *persona* is the consumer whose intent is being surfaced; a *concern* - a goal to reach, a need to satisfy, a pain point to resolve - is that intent made explicit. The model does not perform elicitation, but it gives elicitation a target shape: it defines what is worth capturing and forces the questions - *whose concern? how do we know it is real? how urgent?* - to be answered rather than assumed.
- **Reification.** Personas, concerns, capabilities, and providers are typed objects in a federated graph, not prose in a deck. Intent becomes a queryable, version-controlled, citable artifact - the move that turns "we should support X" into something a tool, a teammate, or an agent can act on.
- **Prioritization.** Because capabilities are *pulled* by concerns and carry evidence, dependencies, authority, and maturity, "what should we do next?" becomes a query over structure rather than a contest of narratives. The model ranks by what addresses real concerns with real evidence, not by who argued hardest.

For agents this is decisive on both ends. As **input**, a typed intent graph tells an agent precisely what to build and the concern it must satisfy - closing the gap that otherwise makes "just write the code" produce confident, wrong output. As a **reasoning substrate**, the same graph lets the agent ask whether a thing is worth building at all, and answer with citations. Cheap implementation makes intent elicitation the constraint; this model is where elicited intent is reified and prioritized so that humans and agents draw from one source.

## What you can do today

- **Use the metamodel as a reasoning substrate.** Hand the [documentation site](https://product-management.models.nasdanika.org/) to your preferred GenAI assistant and ask it to help you reason about a product, platform, or modernization scenario in the model's vocabulary.
- **Author your own consuming model.** Fork the [template repository](https://github.com/Nasdanika-Templates/product-management), edit YAML, push, get a published documentation site for free.
- **Federate with others.** Reference other teams' published models the same way code references its dependencies - Maven coordinates, version-controlled, citable.

See the [documentation site](https://product-management.models.nasdanika.org/) for the full design, use cases, agentic execution roadmap (NSML, Waypoint, OpGraph), and worked examples.

## License

EPL-2.0
