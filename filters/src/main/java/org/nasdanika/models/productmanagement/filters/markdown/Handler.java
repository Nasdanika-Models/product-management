package org.nasdanika.models.productmanagement.filters.markdown;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation for methods to which reflective build calls are dispatched. 
 * Methods must have 4 parameters - source, target, buildState and progress monitor. 
 * Method matching is done by argument instanceof checks. 
 * If multiple methods match, the method with the highest priority is chosen. If there are multiple methods with the same priority,
 * the more specific method is chosen, i.e. the one with more specific argument types.
 * If specificity cannot be established, the method with the longest condition is chosen.
 * @author Pavel
 *
 */
@Retention(RUNTIME)
@Target({METHOD})
public @interface Handler {
	
	/**
	 * If not blank, the value shall be a <a href="https://docs.spring.io/spring-framework/reference/core/expressions.html">Spring boolean expression</a>
	 * which is evaluated in the context of the source with target variable. 
	 * Methods with longer conditions are matched before methods with shorter (including empty) conditions.
	 * @return
	 */
	String value() default "";
	
	/**
	 * Matching priority. Defaults to 0. Higher priorities are matched before lower priorities.
	 * @return
	 */
	int priority() default 0;
		
}
