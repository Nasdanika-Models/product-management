package org.nasdanika.models.productmanagement.filters.markdown;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.EvaluationException;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Builder {
	
	private Object[] builderTargets;

	public Builder(Object... builderTargets) {
		this.builderTargets = builderTargets;
	}
		
	private static int compareMethods(Method aMethod, Method bMethod) {
		Handler aHandler = aMethod.getAnnotation(Handler.class); 
		Handler bHandler = bMethod.getAnnotation(Handler.class);
		
		int ap = aHandler.priority();
		int bp = bHandler.priority();
		
		if (ap != bp) {
			return bp - ap;
		}		
		
		Class<?> aSource = aMethod.getParameters()[0].getType();
		Class<?> bSource = bMethod.getParameters()[0].getType();
		if (!Objects.equals(aSource, bSource)) {
			if (aSource.isAssignableFrom(bSource)) {
				// b is more specific
				return 1;
			}
			if (bSource.isAssignableFrom(aSource)) {
				// a is more specific
				return -1;
			}
		}
		
		Class<?> aTarget = aMethod.getParameters()[1].getType();
		Class<?> bTarget = bMethod.getParameters()[1].getType();
		if (!Objects.equals(aTarget, bTarget)) {
			if (aTarget.isAssignableFrom(bTarget)) {
				// b is more specific
				return 1;
			}
			if (bTarget.isAssignableFrom(aTarget)) {
				// a is more specific
				return -1;
			}
		}
		
		int condLength = bHandler.value().length() - aHandler.value().length();
		return condLength != 0 ? condLength : aMethod.getName().compareTo(bMethod.getName());
	}
		
	/**
	 * Parses and evaluates expression using <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions">Spring Expression Language</a> 
	 * @param obj
	 * @param expr 
	 * @return true if expression is blank or evaluates to true, false if the expression evaluates to false or throws EvaluationException.
	 */
	private boolean matchPredicate(Object source, Object target, String expr) {
		if (Util.isBlank(expr)) {
			return true;
		}
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression(expr);	
		EvaluationContext evaluationContext = new StandardEvaluationContext();
		evaluationContext.setVariable("target", target);
		try {
			return exp.getValue(evaluationContext, source, Boolean.class);
		} catch (EvaluationException e) {
			return false;
		}
	}
	
	
	public void build(Object source, Object target, ProgressMonitor progressMonitor) {
		for (Object builderTarget: builderTargets) {
			List<Method> handlers = Arrays.stream(builderTarget.getClass().getMethods())
				.filter(m -> !Modifier.isAbstract(m.getModifiers()))	
				.filter(m -> matchHandlerAnnotation(m.getAnnotation(Handler.class), source, target))
				.filter(m -> m.getParameterCount() == 5)
				.filter(m -> m.getParameters()[0].getType().isInstance(source))
				.filter(m -> m.getParameters()[1].getType().isInstance(target))
				.filter(m -> matchPredicate(source, target, m.getAnnotation(Handler.class).value()))
				.sorted((a, b) -> compareMethods(a, b))
				.toList();
			
			
			BiConsumer<Object, Object> subBuilder = (s, t) -> build(s, t, progressMonitor);
			Object buildState = new HashMap<>();
			for (Method handler: handlers) {
				try {
					buildState = handler.invoke(
							builderTarget, 
							source, 
							target, 
							buildState, 
							subBuilder,
							progressMonitor);					
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					throw new NasdanikaException("Error invoking handler: " + e, e);
				}
			}
		}
	}

	protected boolean matchHandlerAnnotation(Handler handlerAnnotation, Object source, Object target) {
		if (handlerAnnotation == null) {
			return false;
		}
		Class<?>[] sTypes = handlerAnnotation.sourceTypes();
		if (sTypes.length > 0) {
			boolean sMatch = false;
			for (Class<?> sType: sTypes) {
				if (sType.isInstance(source)) {
					sMatch = true;
					break;
				}
			}
			if (!sMatch) {
				return false;
			}
		}
		
		Class<?>[] tTypes = handlerAnnotation.targetTypes();
		if (tTypes.length > 0) {
			boolean tMatch = false;
			for (Class<?> tType: tTypes) {
				if (tType.isInstance(target)) {
					tMatch = true;
					break;
				}
			}
			if (!tMatch) {
				return false;
			}
		}
		return true;
	}
	

}
