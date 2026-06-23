package org.nasdanika.capability.scripting

/**
 * Carrier handed from a source-format handler (e.g. the rightmost {@code .groovy} qualifier)
 * to a downstream transform handler (e.g. {@code .pm}). The source is compiled once at load time
 * and evaluated many times with per-call bindings, so the compiled form carries no per-evaluation
 * state and concurrent evaluation is safe. See groovy-kotlin-dsl-design.md &sect;4.
 *
 * <p>This is the language-agnostic equivalent of a JSR-223 {@code CompiledScript}: a Groovy, Kotlin
 * or GraalJS source handler all return a {@code CompiledSource}, while transform handlers stay
 * engine-agnostic because they only ever see this type.</p>
 */
interface CompiledSource {

    /**
     * Evaluates the compiled source against a fresh set of bindings.
     * @param bindings variables (and bound entry-point closures for DSL surfaces) made available to the script.
     * @return the value of the script (last expression or explicit return).
     */
    Object eval(Map<String, Object> bindings)

}
