
A pragmatic, just-enough Xcore metamodel for product management as code. Elements are federated text-based artifacts authored in version control, published as Maven artifacts, and consumed across teams.

```drawio-resource
../product-management.drawio
```

[TOC levels=6]

## What this is, in its own terms

This metamodel is itself a product. The page you are reading is the first slice of its own product management model - applied recursively.

### Personas

- **Senior leader driving innovation and AI adoption.** Accountable for portfolio-level outcomes: reducing duplication, increasing adoption of shared platforms, and turning AI investment into measurable productivity. Sees the developer-productivity space where hundreds of developers have built thousands of overlapping tools and is trying to distinguish genuine coverage from noise.
- **Internal innovator.** An individual contributor or small team driving a new idea inside a larger organization. Has no formal mandate to define personas or concerns, and no authority to bind anyone else's roadmap. Authors bespoke persona and concern definitions to frame the problem they're working on - definitions that others may not have seen, may not agree with, and may actively dispute.
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
- **Roles and assignments - generalized RACI.** Authority over a persona, concern, or capability is itself modeled, with periods and assigned actors. Roles are not fixed to a predefined set such as Responsible, Accountable, Consulted, Informed; a model defines whatever roles its domain needs (Owner, Reviewer, Approver, Sponsor, Steward, Auditor, Dissenter) and assigns actors to them for stated intervals. RACI and its variants are expressible as conventions within this mechanism rather than baked into it.
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
- **Classifiers** - every class, interface, and type in the metamodel, with documentation, attributes, references, and inheritance.
- **Diagram** - the static UML rendering of the package.
- **Graphs** - interactive 2D and 3D views, including renderings that pull in dependencies and subpackages so the federation across reference models is visible.
- **Search** - full-text search across the generated site.

Sources live on [GitHub](https://github.com/Nasdanika-Models/product-management). Releases are published as Maven artifacts.

## Use cases

The metamodel is general; the situations where it pays off are specific. The scenarios below are the ones that motivated its design.

### Documenting a product or platform with persona–concern–capability traceability

A team owning a product or internal platform models its consumers as personas, articulates the goals, needs, and pain points of those personas as concerns, and declares the capabilities it provides as addressing specific concerns. The model lives in version control, is published to Maven, and is rendered as a generated documentation site.

The payoff is not the site. It is that every claim the product makes about its consumers is attributable, every capability is traceable to the concerns it addresses, and adoption decisions by other teams can be made against a model rather than against a sales pitch.

### Capability prioritization driven by evidence rather than volume

A product manager prioritizing capabilities for the next period reasons over the model directly: which concerns of which personas are unaddressed; which concerns are supported by evidence and which are not; which proposed capabilities have prerequisites that are already available and which do not.
Prioritization frameworks - RICE, WSJF, opportunity scoring, AHP, and others - are layered as evaluations on top of the structured graph rather than replacing it. 
The graph supplies the criteria hierarchy that frameworks like AHP require: personas as top-level criteria, each persona's concerns as sub-criteria, capabilities as alternatives. 
Pairwise comparison matrices, where used, attach to the container that owns the elements being compared - the product or persona that owns the concerns - matching the way authority is already expressed elsewhere in the model. 
The `mcda` reference model provides the extension; other methodologies can be modeled the same way without changing the core.

The payoff is that the prioritization is defensible. 
The trail from "we built X" back to "because persona Y had concern Z, supported by evidence W, asserted by authority V, weighted by judgment U" is queryable. 
Consistency of the underlying judgments is itself a checkable property of the model; conflicting judgments from different authorities are visible rather than averaged away.

### Educating consumers about a complex offering

A sophisticated platform with many capabilities is hard to explain in linear documentation.
Consumers don't know what to read because they don't know what they need. 
A capability assembly published to Maven becomes the substrate for a chat interface: consumers ask how to solve their problem, and the chat surfaces the relevant capabilities with provenance and version coordinates.

The payoff is the inversion: rather than explaining capabilities to consumers who may not need them, consumers ask about their problems and discover the capabilities that address them. 
The chat is grounded in the formal model, not in the open internet, so its answers are specific, citable, and verifiable.

### Federated authoring across teams and organizations

Multiple teams author their own models, publish them as Maven artifacts, and reference each other's published models the same way code dependencies are referenced. 
Domains merge by shared identity; anchors allow contributors to attach into named slots within a domain they don't own; references cite individual elements across artifacts.

The payoff is that no central tool, no central admin, and no central database is required for many teams to maintain a coherent shared view of personas, concerns, and capabilities. 
The federation is in the artifacts themselves. 
A consumer's view is whichever set of models they choose to import.

### Accountability for promises and dependencies

A platform team commits to providing a capability by a target time. 
A dependent team plans its own commitments relative to that capability, using temporal references that resolve when the upstream commitment lands. When the upstream commitment slips, the resolved temporals of all dependents change automatically - and the chain of cause is structurally visible in the model.

The payoff is that the asymmetric-blame pattern is interrupted. 
The original promise is a signed, dated, attributable assertion. 
Slippage is not deniable, dependents are not silently blamed for upstream movement, and audit is a query rather than a forensics exercise.

### Surfacing duplication across a portfolio

A senior leader responsible for portfolio outcomes loads the assemblies of many teams together.
Capabilities addressing the same concerns of the same personas - whether or not they share a name - appear adjacent in the merged graph. 
Lifecycle assertions show which are Available, which are In Development, which are Proposed, and whose authority asserts what.

The payoff is that duplication is visible structurally rather than discovered politically.
Consolidation decisions can reference the model: which capabilities have evidence, which have providers, which address concerns no other capability addresses. The model does not make the decision; it makes the decision defensible.

### Formalized innovation

An internal innovator articulates a persona and a set of concerns no existing capability addresses, proposes a capability, and elaborates it - declaring prerequisites, dependencies, evidence, and the authority asserting each. 
The capability moves through lifecycle states (Proposed → Elaborated → Approved → In Development → Available) as different authorities bind decisions to it.

The payoff is that elaboration is a durable, citable artifact at every stage. 
Withdrawn and Superseded capabilities remain searchable so future innovators can build on prior elaboration rather than restarting.
The innovation program produces artifacts in the same shape as the production capability set, eliminating the handoff loss.

### Coexistence of bespoke and authoritative definitions

An innovator publishes a persona definition for "junior developer" that does not match the platform team's official definition.
Both definitions are first-class. Each is attributable to its author. Consumers choose which to reference.
A senior leader can compare them, surface the disagreement, and decide whether to converge or maintain plural definitions.

The payoff is that disagreement is legible rather than suppressed. The super-chicken pattern - a loud stakeholder declaring "nobody needs that" - does not erase the dissenting definition. 
Every voice has a home; authority is explicit; the catalog reflects what the organization actually believes rather than what its loudest members claim it believes.

### Template models with relative temporals

A product launch playbook, a regulatory approval process, or a vendor onboarding sequence is authored once as a model with relative temporals: dates expressed as offsets from anchor events ("fourteen days after security review approval").
The template is instantiated against a concrete context - a specific product, a specific approval - and resolves to concrete dates as the anchor events occur.

The payoff is that templates are actually reusable.
The structural relationships between events survive across instantiations; only the calendar projection changes.
When anchor events slip, dependent dates resolve to new values without manual editing.

### AI agents reasoning over product strategy

An AI agent is given access to a capability assembly and asked to validate the model, propose missing concerns, identify capabilities that address no concerns, find personas with unaddressed goals, suggest consolidations of duplicated capabilities, or generate starter solutions composing multiple capabilities. 
The reasoning is over a formal graph with explicit relationships, not over unstructured prose.

The payoff is that AI assistance is grounded. Answers cite specific capabilities at specific versions. 
Generated artifacts respect declared prerequisites and conflicts. 
The same substrate that supports human reasoning supports machine reasoning, and the citations are the same.

### Auditable enterprise architecture

An architecture board needs to demonstrate that strategic capabilities have been allocated to providers, that commitments have authorities and dates, that dependencies are documented, and that retirements have rationales. 
The model is the audit artifact. 
Every assertion has provenance; every lifecycle transition has an asserting authority; every dependency is structural rather than narrative.

The payoff is that audit is a query rather than an interview. 
The model is the same model used for everyday decisions, not a separate artifact prepared for compliance - which means the audit reflects how the organization actually operates, not how it presented itself for the review.

## Design

The metamodel reflects a set of design choices that, together, distinguish it from roadmap tools, EA modeling tools, and idea-management systems. 
Each choice has consequences; this section makes them explicit.

### Federated by construction

The model is authored as text in version control and published as Maven artifacts.
Multiple authors, teams, and organizations publish their own models and reference each other's published models the same way code references its dependencies.
There is no central server, no shared database, no administrative tool that has the authority to edit anyone else's model.
A consumer's view is whichever set of artifacts they choose to load.

Federation is in the artifacts themselves rather than in a service.
This makes the model survive vendor change, organizational reorganization, and tooling churn: a Maven artifact published today remains loadable in a decade by any consumer who has it.

### Identity by URI, rendering by path

Every model element has a global identity expressed as a URI.
Containment - the path from the model root to the element - is a way of rendering identity, not a definition of it.
Two elements with the same URI are the same element regardless of where they appear in any artifact.
References, links, and external citations are always by URI; paths are computed for display.

This separation lets the same element be authored in one place, cited from many, and rendered in whichever location best fits the consumer's view.
It also makes permalinks stable across reorganizations: when an element moves in the rendered tree, its URI does not change.

### Pull-up resolution

When the same element is encountered through multiple containment paths in a loaded view, its canonical home is the most-specific common ancestor of those paths.
A concern written inline inside one capability stays there.
The same concern, authored inline in five capabilities with the same URI, is promoted to the smallest enclosing scope that contains all five - typically the parent capability domain or product model.

The mechanism enables emergent structure: authors write concerns wherever they notice them, and the resolver promotes shared concerns automatically when sharing becomes evident.
Authors do not have to predict in advance which concerns will be shared.
The model becomes cleaner over time without anyone refactoring it, and cross-cutting concerns surface as a structural property of the federation rather than as the result of a manual audit.

Promotion respects authoring intent: elements merge only on identical URIs, never on textual similarity.
Apparent duplicates with different URIs remain separate and are surfaced as candidate equivalences for the author to confirm.
Where promotion would change behavior an author wishes to prevent, an explicit scope declaration keeps the element local.

### Three views of the same elements

The model serves three intersecting views, each useful to a different audience:

- **Polity-allocation view.** Who has authority to bind decisions about resource allocation toward addressing persona concerns.
- **Exchange view.** Concerns are asks; capabilities are bids; work packages are bids on concerns.
- **Decision-binding view.** The incremental binding of decisions over time, with provenance and authority attached to each binding.

The same model elements participate in all three views. No view requires its own separate model.

### Provenance and authority on every assertion

Every assertion in the model - that a persona has a concern, that a capability addresses a concern, that a provider commits to deliver, that a capability is Approved or Withdrawn - carries the authority making the assertion, the period during which the assertion holds, and references to supporting evidence. Signed Maven publication inherits the provenance of artifact signing.

The consequence is that disagreement is legible rather than suppressed.
Two authorities asserting different things about the same capability produce two parallel assertions, both attributable.
The model does not pick a winner; the consumer chooses which authorities to trust for which kinds of assertions.
The asymmetric-blame pattern - where a high-status promise slips and downstream teams absorb the cost - is interrupted because the original promise remains a dated, attributable, durable record.

### Roles as generalized RACI

Authority over a persona, concern, or capability is itself modeled.
Roles are not fixed to a predefined set such as Responsible, Accountable, Consulted, Informed; a model defines whatever roles its domain needs - Owner, Reviewer, Approver, Sponsor, Steward, Auditor, Dissenter - and assigns actors to them for stated intervals.
RACI and its variants are expressible as conventions within this mechanism rather than baked into it.

### Relative and absolute temporals

A temporal value may be absolute (a calendar instant) or relative to another temporal (an offset from an anchor event).
"Fourteen days after security review approval" is a first-class expression, not a comment.
When a relative temporal's anchor acquires a concrete instant - an approval is granted, a release ships - every relative temporal that depends on it resolves automatically.

Template models with deferred binding fall out of this directly: a product launch playbook, a regulatory approval sequence, or a vendor onboarding plan is authored once in relative temporals and instantiated against concrete contexts without modification. 
Cross-model relative temporals reach across federation boundaries, so a consuming team's commitments expressed relative to a platform team's published release resolve when the platform team publishes the date.

### Capability as a self-contained domain

A capability is not only an element addressing concerns; it is also a domain.
It may contain its own personas (Compliance Officer, FinOps Lead, Model Steward - personas surfaced by virtue of the capability existing),
its own concerns (intrinsic properties such as deterministic behavior under fixed inputs, or retention policies that exist by virtue of the capability being subject to them), and its own evidence supporting both.

A capability published as a Maven artifact is therefore self-contained: a consumer can load just that artifact and have a complete local picture of the capability without needing to load the entire enterprise model.
Other capabilities can reference its introduced personas and concerns, so the vocabulary one capability creates becomes reusable across the federation.

The distinction between addressed concerns and introduced concerns is important.
Capabilities are concern generators as well as concern addressers.
The capability that introduces a concern is often not the same as the capability that addresses it - a Cost Attribution capability may address concerns introduced by AI Assistance.
The model carries both relations as first-class structure.

### Capability composition and dependency

Capabilities decompose into sub-capabilities, expressing the part-of hierarchy familiar from TOGAF and ArchiMate capability maps.
Capabilities also declare contract-level dependencies on other capabilities - prerequisite, enhancing, or conflicting - distinct from the implementation-level requirements declared by specific providers.
A fraud-detection capability may declare a prerequisite on transaction-processing at the contract level;
a specific fraud-detection provider may further require a particular streaming infrastructure at the implementation level.
Contract dependencies travel with the capability; implementation requirements travel with the provider.

### Domain merging and anchors

Domains - for personas, concerns, capabilities, capability providers, actors - merge across artifacts by shared identity.
Two capability domain fragments with the same identity, published from different Maven artifacts, are understood as two contributions to the same logical domain.
Their contents union into a single merged view at load time.
The merge is computed, not stored; each fragment remains independently owned by its publishing artifact.

For finer-grained composition, domains may publish anchors - named slots within the domain that contributors can target without owning the domain itself.
The pattern mirrors Eclipse Help's link/anchor mechanism and P2's category IDs, applied to product strategy.

### Evidence and lifecycle as first-class structure

Concerns reference evidence with source, excerpt, and confidence, so a claim about a persona's need is grounded rather than asserted.
Capabilities pass through lifecycle states - Proposed, Elaborated, Approved, In Development, Available, Deprecated, Retired, Withdrawn, Superseded - and lifecycle is itself asserted with authority, period, and rationale.
Multiple authorities may assert different lifecycle states for the same capability; the disagreement is legible rather than suppressed.

The same model that documents production capabilities documents the ones still being elaborated.
Withdrawn and Superseded capabilities remain searchable, so prior elaboration is reusable rather than repeatedly rediscovered.
The handoff from idea to implementation is continuous: the elaboration is not thrown away and redone in a delivery tool.

### AI as a first-class consumer

The structure of the model is what makes AI reasoning over product strategy useful.
An AI agent traverses a typed graph with explicit relationships rather than ranking passages of free-form prose.
Answers cite specific elements at specific versions; generated artifacts respect declared prerequisites and conflicts; validation checks coverage, gaps, duplication, and lifecycle consistency over the full federation.
The same substrate that supports human reasoning supports machine reasoning, with the same citations.

The chat-over-capabilities pattern is the user-visible expression of this: a consumer asks how to solve their problem and the agent surfaces capabilities from the loaded assembly, with provenance and version coordinates.
The agent is grounded in the federated capability set, not in the open internet, and is honest about what is missing from the set as well as what is present.

The typed-graph structure also addresses the scale concern that arises with large federated models.
An agent does not need to load the entire model to reason over it.
The graph supports deterministic traversal - capabilities addressing a particular persona's concerns, prerequisites of a proposed capability, the lifecycle history of a domain - so retrieval is precise rather than approximate.
For finer scoping, the [Nasdanika Semantic Mapping Language](https://github.com/Nasdanika-Models/nasdanika-semantic-mapping-language) (NSML) transforms regions of the model into [semantic context models](https://medium.com/nasdanika/why-we-need-a-semantic-context-model-ae231d8004e3) - focused, agent-shaped views derived from the larger federation through declarative rules.
NSML is to Ecore what XSLT is to XML; semantic context models are one of its primary applications in the product-management context.
The agent operates on a context tailored to its task rather than on the whole federation.

NSML itself is an Elaborated capability in the Nasdanika roadmap: designed in detail, not yet built.
It is published as a lot on a street in a new neighborhood - the architecture is staked out, and construction begins when the first consumer signs a contract for it. 
This is the pull lifecycle the metamodel supports: capabilities can be visible, elaborated, and citable before they exist as code, so demand and supply meet on the same artifact.

## How to build on this

A CLI command for documentation generation and a template repository are work in progress.

A consuming model declares this metamodel as a dependency, instantiates personas, concerns, and capabilities for its own domain, and publishes its model as its own Maven artifact. 
Other teams reference that model the same way this metamodel references `ncore` and `architecture`. 
The result is a graph of models with explicit ownership at every node - a substrate on which AI agents can reason, on which audits can run, and on which dissent can be expressed without being erased.

The first such consuming model is being built next. Its first persona is the enterprise architect. Its first concern is this page.

### Try the metamodel without installing anything

Even before any consuming model exists locally, the metamodel is useful as a reasoning substrate.
An AI assistant - Claude, ChatGPT, or any other - given the metamodel's vocabulary and a real problem can use the structure to organize an answer that a free-form prompt would not produce.
The reasoning is sketched rather than grounded against a live graph, but the shape is already valuable.

A worked example is legacy modernization - a problem many organizations have in some form, and one the metamodel is unusually well-shaped for.
The [Legacy Modernization practice](https://docs.nasdanika.org/practices/legacy-modernization/index.html) describes the broader approach.
The prompt below asks an AI assistant to apply the metamodel to a legacy-modernization scenario you describe in your own words.

#### Sample prompt

> I am working on a legacy modernization effort. I want you to help me reason about it using the Nasdanika product management metamodel (https://product-management.models.nasdanika.org/).
>
> The metamodel treats product strategy as a graph of:
> - **Personas** with **concerns** — goals, needs, and pain points
> - **Capabilities** that address concerns, with prerequisites and dependencies
> - **Capability providers** that supply capabilities, with stated periods of validity
> - **Evidence** grounding each concern, with source and confidence
> - **Lifecycle states** for capabilities — Proposed, Elaborated, Approved, In Development, Available, Deprecated, Retired, Withdrawn, Superseded
> - **Authority** on every assertion — who said this, when, for what period
>
> Here is my situation: *[describe your legacy system, the personas it serves and the personas the modernization affects, what the system currently does, what is deprecated or retiring, what the target architecture looks like, system size in some units like deployable units, source files, lines of code, bytes, modernization timelines and resources - skillsets, familiarity with the system, ... and any specific concerns that are surfacing]*.
>
> Please help me by:
> 1. Identifying the personas involved and the goals, needs, and pain points each one has.
> 2. Listing the capabilities provided by the legacy system and the proposed capabilities in the target architecture, with their prerequisites and dependencies.
> 3. Mapping which target capabilities address which personas' concerns, and which concerns are not yet addressed.
> 4. Flagging legacy capabilities that should be Deprecated or Superseded, and what the successor relationships are.
> 5. Identifying assertions that need evidence - places where the modernization plan relies on claims that should be grounded before commitment.
> 6. Surfacing concerns that may exist only because of the modernization itself (transition risk, training cost, dual-running expense) and which capabilities address them.
>
> Where you have insufficient information, ask me clarifying questions before guessing. Cite the metamodel concepts you are using as you go.

The output is a sketch, not a finished model. 
It is useful for structuring a conversation with stakeholders, for identifying what evidence is missing, and for finding the gaps and overlaps in the modernization plan. 
When you are ready to make the result durable - version-controlled, federated, citable, AI-readable as a live graph rather than a transcript - the metamodel and its tooling are what you commit it to.

### When you are ready to commit

The path from sketch to durable model:

1. **Capture the sketch in version control.** A Markdown file is enough to start. Identify which elements would become personas, concerns, capabilities, and providers if the sketch were expressed in the metamodel.
2. **Author the elements as a small consuming model.** The metamodel is published to Maven; the consuming model declares it as a dependency. Sources can be YAML or JSON. In the future - Xtext-based DSL and Draw.io diagrams [mapped](https://docs.nasdanika.org/core/mapping/index.html) to the product management model.
3. **Publish your model as its own Maven artifact.** Once published, other teams can reference your personas, concerns, and capabilities the same way you reference the metamodel itself. Provenance and authority travel with the artifact.
4. **Federate with adjacent models.** Reference platform-team capability models, organizational persona models, and your own previous consuming models. The merged view is computed from the artifacts you load.

Each step is small enough to complete in a sitting. The investment compounds because every artifact is reusable by every consumer who imports it.

If you try this with a real situation, I'd be interested to see the sketch — anonymized is fine. It helps shape the next iteration of the metamodel.