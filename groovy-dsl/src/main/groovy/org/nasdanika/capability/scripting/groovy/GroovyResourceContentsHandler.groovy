package org.nasdanika.capability.scripting.groovy

import java.nio.charset.StandardCharsets

import javax.script.Compilable
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptException

import org.nasdanika.capability.emf.ResourceContentsHandler
import org.nasdanika.capability.scripting.CompiledSource

/**
 * Source-format handler for the rightmost {@code .groovy} qualifier. Reads Groovy source and
 * <i>compiles</i> it to a {@link CompiledSource}; it does not evaluate &mdash; evaluation is a
 * downstream ({@code .pm}) or runtime concern. Bindings are supplied per {@code eval}, so the
 * compiled form is reusable and carries no per-call state. See groovy-kotlin-dsl-design.md &sect;4.
 */
class GroovyResourceContentsHandler implements ResourceContentsHandler<CompiledSource> {

    private final ResourceContentsHandler.Requirement requirement

    GroovyResourceContentsHandler(ResourceContentsHandler.Requirement requirement) {
        this.requirement = requirement
    }

    @Override
    ResourceContentsHandler.Order getOrder() {
        // A bare source handler keyed off a single "groovy" qualifier is the least specific.
        return ResourceContentsHandler.Order.of(0)
    }

    @Override
    CompiledSource load(InputStream inputStream, Map<?, ?> options) throws IOException {
        String source = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8)

        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("groovy")
        if (engine == null) {
            throw new IOException("No JSR-223 Groovy engine on the classpath (add org.apache.groovy:groovy-jsr223)")
        }
        if (!(engine instanceof Compilable)) {
            throw new IOException("Groovy JSR-223 engine is not Compilable")
        }
        try {
            // compiled, NOT evaluated; syntax errors surface here, at load time
            return new GroovyCompiledSource(((Compilable) engine).compile(source))
        } catch (ScriptException e) {
            throw new IOException("Failed to compile " + requirement.getResource().getURI() + ": " + e.getMessage(), e)
        }
    }

    // save(...) inherits the default UnsupportedOperationException: generating .groovy source from a
    // model is out of scope (load-only surface).

}
