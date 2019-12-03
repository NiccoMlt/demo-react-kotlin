@file:JsModule("FormHelperText")
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

external interface FormHelperTextProps : Omit {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var filled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLParagraphElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLParagraphElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var margin: String /* 'dense' */
    var required: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'standard' | 'outlined' | 'filled' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var FormHelperText: dynamic /* ComponentClass<FormHelperTextProps, ComponentState> | FunctionComponent<FormHelperTextProps> */