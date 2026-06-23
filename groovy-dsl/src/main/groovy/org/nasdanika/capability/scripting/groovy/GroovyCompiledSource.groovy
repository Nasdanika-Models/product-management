package org.nasdanika.capability.scripting.groovy

import javax.script.CompiledScript
import javax.script.ScriptException
import javax.script.SimpleBindings

import org.nasdanika.capability.scripting.CompiledSource

/**
 * {@link CompiledSource} backed by a JSR-223 {@link CompiledScript}. Compile-once / eval-many:
 * a fresh {@link SimpleBindings} is created from the supplied map on every {@link #eval(Map)} call,
 * so no per-evaluation state is shared.
 */
class GroovyCompiledSource implements CompiledSource {

    private final CompiledScript compiledScript

    GroovyCompiledSource(CompiledScript compiledScript) {
        this.compiledScript = compiledScript
    }

    @Override
    Object eval(Map<String, Object> bindings) {
        try {
            return compiledScript.eval(new SimpleBindings(bindings))
        } catch (ScriptException e) {
            throw new RuntimeException("Failed to evaluate compiled Groovy source: " + e.getMessage(), e)
        }
    }

}
