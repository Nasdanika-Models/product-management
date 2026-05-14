
A pragmatic, just-enough Xcore metamodel for product management as code. Elements are federated text-based artifacts authored in version control, published as Maven artifacts, and consumed across teams.

The model serves three intersecting views of the same elements:

- **Polity-allocation view** — who has authority to bind decisions about resource allocation toward addressing persona concerns.
- **Exchange view** — concerns are asks; capabilities are bids. Work packages are bids on concerns.
- **Decision-binding view** — the model formalizes the incremental binding of decisions with provenance and authority.

```drawio-resource
../product-management.drawio
```

## What this is, in its own terms

This metamodel is itself a product. The page you are reading is the first slice of its own product management model - applied recursively.

### Personas

- **Senior leader driving innovation and AI adoption.** Accountable for portfolio-level outcomes: reducing duplication, increasing adoption of shared platforms, and turning AI investment into measurable productivity. Sees the developer-productivity space where hundreds of developers have built thousands of overlapping tools and is trying to distinguish genuine coverage from noise.
- **Internal innovator.** An individual contributor or small team driving a new idea inside a larger organization. Has no formal mandate to define personas or concerns, and no authority to bind anyone else's roadmap. Authors bespoke persona and concern definitions to frame the problem they're working on — definitions that others may not have seen, may not agree with, and may actively dispute.
- **Enterprise architect.** Maintains capability maps and motivation models, and is asked to defend them against organizational drift, vendor slippage, and political revision. Owns alignment between strategy and delivery.
- **Technical product manager.** Owns a product or platform whose consumers are themselves engineering teams. Needs to express persona–concern–capability traceability with the same rigor used for code.
- **Platform engineering lead.** Operates an internal platform whose roadmap depends on, and is depended upon by, many other teams. Needs durable evidence of who promised what to whom and when.
- **AI agent.** A first-class consumer. Reads the model to answer coverage, gap, impact, and counterfactual questions over a formal graph rather than over unstructured prose.

### Concerns these personas raise

#### Goals

- **See actual coverage, not claimed coverage.** Distinguish capabilities that genuinely address a persona's concerns from capabilities whose providers merely assert that they do. The model should make the gap between claim and evidence inspectable.
- **Surface duplication structurally.** When two or three teams independently build capabilities addressing the same concerns of the same personas, the overlap should be visible from the model rather than discovered by accident at a steering committee.
- **Make consolidation defensible.** Decisions to retire, merge, or anoint a single capability among several overlapping ones should be traceable to the concerns, evidence, and authorities involved - not reducible to executive preference.
- **Make alignment auditable.** Every assertion about a persona, a concern, or a capability should be attributable to an authority with a defined scope and validity period.
- **Make every voice heard.** A dissenting team must be able to publish its own model that references the canonical assertions and adds its own. Authority is explicit, not implicit in who speaks loudest.
- **Make dependencies between capabilities first-class.** A capability that depends on another should say so as part of its contract, not bury the dependency in a wiki page.
- **Plan in shapes, not in dates.** A roadmap's structure (an approval gate triggers a 14-day review window; a release starts a 90-day stabilization period) should be expressible before any calendar dates are known, and should remain valid after they slip.
- **Bind plans to reality without rewriting them.** When the date of an approval, release, or commitment finally lands, every temporal that referenced it should resolve automatically. The plan is the same plan; only the calendar projection changes.
- **Publish a persona without asking permission.** An innovator must be able to define a persona, articulate its concerns, and put the definition on the record without first negotiating it through the organizational hierarchy. The definition exists; whether it is authoritative is a separate question answered by whoever chooses to reference it.
- **Be cited, agreed with, or disputed on the merits.** A bespoke persona should be discoverable and addressable so that others can extend it, reference it, or publish a competing definition. Silence and selective forgetting are not acceptable responses.

#### Needs

- **Portfolio-level reasoning over a federated graph.** Reasoning about duplication and adoption requires a view across many teams' models without forcing all teams onto a single central tool. The federation has to compose into a coherent portfolio view on demand.
- **Adoption visible as a first-class signal.** Whether a capability is actually used by the personas it claims to address is itself evidence, and should attach to the capability rather than live in a separate analytics tool nobody opens.
- **Coexist with disagreement.** Multiple incompatible definitions of "the junior developer persona" should be able to exist simultaneously, each attributable to its author, without one being administratively erased to make the catalog "consistent."
- **Survive personnel and tooling change.** Models authored today must remain readable and verifiable years later, by humans and by machines, without a vendor account
- **Compose across organizational boundaries.** A model from one team must be referenceable from another team's model with the same mechanics used for code dependencies.
- **Reusable templates.** A product launch template, a regulatory approval template, a vendor onboarding template should be authored once with relative temporals and instantiated repeatedly against different concrete anchor events.
- **Honest schedule arithmetic across federation.** When one team's commitment depends on another team's release, the dependent's temporal should be expressed relative to the dependency, not duplicated and silently drift out of sync.

#### Pain points

- **Internal-tool sprawl - hundreds of developers, thousands of tools.** In the developer-productivity space, parallel construction of overlapping internal tools produces more confusion than productivity. Each tool has its own champion, its own asserted persona, and its own claimed coverage; without a shared model, deduplication is impossible and consolidation is a political fight.
- **AI adoption stalls on missing structure.** AI assistance over product strategy works only as well as the structure it has to reason over. Free-form roadmaps, slide decks, and wikis do not give an agent enough to detect duplication, gaps, or drift. The absence of a formal model is itself the bottleneck.
- **Asymmetric blame.** When a high-status promise slips, downstream teams absorb the cost. Without a durable, dated record of who promised what, the political gradient runs only one way
- **The super-chicken problem.** A loud stakeholder claims "nobody needs that" and the concern disappears from the official narrative. Without per-assertion authorship, the claim is indistinguishable from consensus
- **Strategy drift.** Roadmap tools optimize for what was decided last week. The longer arc - which goals were committed to, which were silently abandoned - is lost
- **Date theater.** Calendar dates put into roadmap tools before the underlying events have happened create false precision. They are negotiated, revised, and quietly forgotten; the original intent ("two weeks after approval, whenever that is") is lost.
- **Cascading reschedule churn.** When a single upstream event slips, every downstream date in every dependent plan has to be edited by hand. The edits themselves become a source of error and political revision.
- **Templates that aren't.** Templates expressed in absolute dates aren't templates; they're examples that get copy-pasted and diverge. The relative structure that made them reusable is lost on first use.

### Capabilities this metamodel provides

- **Persona, Concern, Capability as first-class elements.** With explicit relationships: concerns address goals, needs, and pain points; capabilities address concerns; providers supply and require capabilities
- **Temporal validity.** Every named element is a [`Period`](references/eClassifiers/Period/index.html). Assertions, commitments, and provider relationships are valid for stated intervals.
- **Provenance and authority.** Every element carries identity and references to the authority that asserted it. Models published as signed Maven artifacts inherit the provenance of their publication.
- **Federation by construction.** Domains (`PersonaDomain`, `CapabilityDomain`, `CapabilityProviderDomain`, `ActorDomain`) and reference types (`PersonaReference`, `CapabilityReference`, `CapabilityProviderReference`) allow one model to cite another without copying it.
- **Capability dependency and composition.** Capabilities decompose into sub-capabilities and declare prerequisite, enhancing, or conflicting relationships at the contract level, distinct from implementation requirements on a specific provider.
- **Evidence.** Provided capabilities reference evidence, so a claim is grounded rather than asserted. For example, a demo or a case study for a software product. A certificate for a person skill..
- **Roles and assignments — generalized RACI.** Authority over a persona, concern, or capability is itself modeled, with periods and assigned actors. Roles are not fixed to a predefined set such as Responsible, Accountable, Consulted, Informed; a model defines whatever roles its domain needs (Owner, Reviewer, Approver, Sponsor, Steward, Auditor, Dissenter) and assigns actors to them for stated intervals. RACI and its variants are expressible as conventions within this mechanism rather than baked into it.
- **Relative temporals.** A [`Temporal`](references/eClassifiers/Temporal/index.html)  may be anchored to another Temporal (its base) and offset by a Duration, rather than carrying an absolute Instant. "Fourteen days after the security review approval" is a first-class expression, not a comment.
- **Bounded relative temporals.** A Temporal may declare lowerBounds and upperBounds against other temporals, expressing constraints like "no earlier than release, no later than end of fiscal year" without committing to dates.
- **Resolution against concrete events.** When a referenced anchor temporal acquires a concrete Instant - an approval is granted, a release ships - every relative temporal that depends on it resolves to a concrete Instant by composition. Resolution is a derivation, not an edit.
- **Template models with deferred binding.** A model authored entirely in relative temporals is a template. Instantiation against a concrete anchoring context produces a bound model without modifying the template itself, so the template can be reused across products, releases, and engagements.
- **Cross-model temporal references.** A relative temporal can reference an anchor defined in another federated model. A consuming team's commitments can be expressed relative to a platform team's published release temporal, and resolve when the platform team publishes the date.
- **Auditable resolution provenance.** The resolved Instant of a relative temporal carries the chain of anchors and offsets that produced it. When a date changes, the cause is structurally visible: which upstream event moved, by how much, and when.
- **Periods as relative ranges.** A Period whose start and end are relative temporals describes a validity interval whose calendar projection is determined by the events its endpoints reference - supporting roles, capability provision, and assignments that activate automatically when the anchoring events occur..

### Capability providers

- **Nasdanika.** Publishes this metamodel as Maven artifacts. Provides the CLI tooling, generated Web UI, and Xcore sources
- **Git hosting (any).** Provides version control, signed commits, and review. The metamodel does not depend on any particular forge.
- **Maven repositories (any).** Provide artifact distribution and consumer-side dependency resolution. The metamodel does not depend on Maven Central specifically.
- **AI assistants.** Provide reasoning, validation, gap detection, and authoring assistance over the formal graph.

## How to read this site

This site is generated from the metamodel itself.

- **Interactive diagram on this page** - core concepts, click on diagram elements to navigate to context diagrams.
- **Classifiers** — every class, interface, and type in the metamodel, with documentation, attributes, references, and inheritance.
- **Diagram** — the static UML rendering of the package.
- **Graphs** — interactive 2D and 3D views, including renderings that pull in dependencies and subpackages so the federation across reference models is visible.
- **Search** — full-text search across the generated site.

Sources live on [GitHub](https://github.com/Nasdanika-Models/product-management). Releases are published as Maven artifacts.

## How to build on this

A CLI command for documentation generation and a template repository are work in progress.