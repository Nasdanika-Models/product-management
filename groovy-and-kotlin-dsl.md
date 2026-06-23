I want to add Groovy and Kotlin DSL's as "authoring surfaces".
I want to use Java Scripting for both - might be less powerfult, but simpler.
Specifically, I want to use Groovy DSL for the product management model (https://product-management.models.nasdanika.org/) for Nasdanika and at work for Business Banking.
I will use the filename pipeline, possibly slightly modified - personas.pm.groovy will:

* Load the script source into the scripting engine, set up resource variable with resourceSet accessible from it. It will also set up source location from URI. It may also set the capability loader variable. Then it will pass the engine to the next stage handled by .pm 
* The .pm resource loader will take the scripting engine, set up variables specific to the product management model - the factory. Then it will evaluate the script and pass the result to the next stage.
* With this appraoch I'll need a terminal stage which will report validation errors to the resource, if any, and convert the result into a collection of EObjects - wrap a single object using List.of, return a collection and throw an exception if neither an Eobject nor a collection.


I'll need to modify the ResourceContentsFilter to take generic parameters <T,V> T -> V on load and V -> T on save.
Implementations will either have to have .canHandleLoad(Object) .canHandleSave(Object) methods or have Class<T> getInputType() and Class<V> getOutputType() methods.
I'm leaning towards the first - more flexible in my opinion.
Ties are resolved using the order value as it is done now.

I feel that this move deserves a LinkedIn article which builds on the "Language Shapes Thinking" article by saying that "I'm thinking in Java" (maybe reference the book and even its author using @, if he is on LinkedIn). 
Then I'm going to say that for me it was easier to create Groovy and Kotlin resource factories than to start thinking in YAML. 
Also mentiong that Xcore vs Kotlin discussion is now moot - Ecore can be modeled using Kotlin DSL.
Here I may weave-in the Legacy modernization angle - in some cases keep the language, replace the runtime - Oracle licensing terms change -> OpenJDK, not migration off Java.

* Provide your assessment of the approach
* Outline prior art using Groovy and Kotlin for Ecore modeling
* Generate a design document which covers:
    * Use of groovy as a DSL for Ecore and the product management model.
        * Support of nested objects similar to JSON/YAML
        * Cross-referencing, say, a concern defined in one file references a capability which addresses it in another.
        * IDE friendliness (VS Code) - syntax highlighting, code completion. How to - @DelegatesTo?
    * How to use Kotlin as a scripting engine. Does it come with loads of dependecies?
    * Any other scripting engines worth supporting?
    * I wanto to have validation support for Ecore modeling using Groovy in Groovy and maybe SpEL if it is not too hard. I think it should be possible by using annotations with Groovy/SpEL code. Save to ecore, generate Java classes - in Eclipse or using CLI.




