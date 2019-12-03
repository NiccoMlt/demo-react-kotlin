@file:JsModule("Hidden")
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

external interface HiddenProps {
    var implementation: dynamic /* 'js' | 'css' */
        get() = definedExternally
        set(value) = definedExternally
    var initialWidth: Breakpoint?
        get() = definedExternally
        set(value) = definedExternally
    var lgDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lgUp: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mdDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mdUp: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var only: dynamic /* Breakpoint | Array<Breakpoint> */
        get() = definedExternally
        set(value) = definedExternally
    var smDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var smUp: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xlDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xlUp: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xsDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xsUp: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Hidden: dynamic /* ComponentClass<HiddenProps, ComponentState> | FunctionComponent<HiddenProps> */