@file:JsModule("CircularProgress")
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

external interface CircularProgressProps : Omit {
    var color: dynamic /* 'primary' | 'secondary' | 'inherit' */
        get() = definedExternally
        set(value) = definedExternally
    var disableShrink: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var thickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'determinate' | 'indeterminate' | 'static' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var CircularProgress: dynamic /* ComponentClass<CircularProgressProps, ComponentState> | FunctionComponent<CircularProgressProps> */