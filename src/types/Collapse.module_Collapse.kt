@file:JsModule("Collapse")
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

external interface CollapseProps : Omit {
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var collapsedHeight: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<TransitionProps, ComponentState> | FunctionComponent<TransitionProps> */
        get() = definedExternally
        set(value) = definedExternally
    var theme: Theme?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: dynamic /* Any | 'auto' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Collapse: dynamic /* ComponentClass<CollapseProps, ComponentState> | FunctionComponent<CollapseProps> */