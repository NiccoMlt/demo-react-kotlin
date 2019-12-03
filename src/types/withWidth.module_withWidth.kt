@file:JsModule("withWidth")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface WithWidthOptions {
    var withTheme: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noSSR: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var initialWidth: Breakpoint?
        get() = definedExternally
        set(value) = definedExternally
    var resizeInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WithWidth {
    var width: Breakpoint
}

external interface WithWidthProps : Partial<WithWidth> {
    var innerRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external fun isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean? = definedExternally): Boolean

external fun isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean? = definedExternally): Boolean

@JsName("default")
external fun withWidth(options: WithWidthOptions? = definedExternally): PropInjector<WithWidth, WithWidthProps>