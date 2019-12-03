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

external interface `T$0` {
    var node: HTMLInputElement
    var value: Any
}

external interface `T$1` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any
}

external interface SelectInputProps {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoWidth: Boolean
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var IconComponent: dynamic /* Any | ComponentClass<P, ComponentState> | FunctionComponent<P> */
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((ref: dynamic /* HTMLSelectElement | `T$0` */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var MenuProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var multiple: Boolean
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var native: Boolean
    var onBlur: React.FocusEventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((event: React.ChangeEvent<`T$1`>, child: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((event: React.ChangeEvent<Any>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onFocus: React.FocusEventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onOpen: ((event: React.ChangeEvent<Any>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var readOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderValue: ((value: Any) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var SelectDisplayProps: React.HTMLAttributes<HTMLDivElement>?
        get() = definedExternally
        set(value) = definedExternally
    var tabIndex: Number?
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
external var SelectInput: dynamic /* ComponentClass<SelectInputProps, ComponentState> | FunctionComponent<SelectInputProps> */