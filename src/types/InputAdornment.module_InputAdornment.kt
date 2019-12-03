@file:JsModule("InputAdornment")
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

external interface InputAdornmentProps : Omit {
    var component: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLDivElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLDivElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var disablePointerEvents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableTypography: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* 'start' | 'end' */
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'standard' | 'outlined' | 'filled' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var InputAdornment: dynamic /* ComponentClass<InputAdornmentProps, ComponentState> | FunctionComponent<InputAdornmentProps> */