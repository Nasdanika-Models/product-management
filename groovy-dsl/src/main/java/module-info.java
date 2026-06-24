module org.nasdanika.models.productmanagement.dsl.groovy {

	exports org.nasdanika.models.productmanagement.dsl.groovy;
	opens org.nasdanika.models.productmanagement.dsl.groovy;

	// transitive: the exported builders are Groovy classes whose public API exposes
	// groovy.lang.Closure / GroovyObject, so consumers (e.g. the handlers module) need Groovy too.
	requires transitive org.apache.groovy;
	requires transitive org.nasdanika.models.productmanagement;

}