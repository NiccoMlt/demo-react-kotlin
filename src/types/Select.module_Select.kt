@file:JsModule("Select")
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

external interface SelectProps : Omit, Pick<SelectInputProps, String /* 'onChange' */> {
    var autoWidth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var displayEmpty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var IconComponent: dynamic /* Any | ComponentClass<P, ComponentState> | FunctionComponent<P> */
        get() = definedExternally
        set(value) = definedExternally
    var input: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var labelId: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var MenuProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var multiple: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var native: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((event: React.ChangeEvent<Any>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOpen: ((event: React.ChangeEvent<Any>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderValue: ((value: Any) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var SelectDisplayProps: React.HTMLAttributes<HTMLDivElement>?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'standard' | 'outlined' | 'filled' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Select: dynamic /* ComponentClass<SelectProps, ComponentState> | FunctionComponent<SelectProps> */