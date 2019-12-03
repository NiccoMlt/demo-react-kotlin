@file:JsModule("InputBase")
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
    var margin: dynamic /* 'dense' | 'none' | 'normal' */
        get() = definedExternally
        set(value) = definedExternally
    var required: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startAdornment: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface InputBaseProps : Omit {
    var autoComplete: String?
        get() = definedExternally
        set(value) = definedExternally
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* 'primary' | 'secondary' */
        get() = definedExternally
        set(value) = definedExternally
    var defaultValue: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var endAdornment: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fullWidth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var inputComponent: dynamic /* Any | ComponentClass<InputBaseComponentProps, ComponentState> | FunctionComponent<InputBaseComponentProps> */
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: InputBaseComponentProps?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var margin: dynamic /* 'dense' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var multiline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var readOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var required: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderPrefix: ((state: `T$0`) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var rows: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var rowsMax: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var startAdornment: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: React.ChangeEventHandler<dynamic /* HTMLTextAreaElement | HTMLInputElement */>?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyDown: React.KeyboardEventHandler<dynamic /* HTMLTextAreaElement | HTMLInputElement */>?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyUp: React.KeyboardEventHandler<dynamic /* HTMLTextAreaElement | HTMLInputElement */>?
        get() = definedExternally
        set(value) = definedExternally
    var onBlur: React.FocusEventHandler<dynamic /* HTMLInputElement | HTMLTextAreaElement */>?
        get() = definedExternally
        set(value) = definedExternally
    var onFocus: React.FocusEventHandler<dynamic /* HTMLInputElement | HTMLTextAreaElement */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InputBaseComponentProps : React.HTMLAttributes<dynamic /* HTMLInputElement | HTMLTextAreaElement */> {
    @nativeGetter
    operator fun get(arbitrary: String): Any?
    @nativeSetter
    operator fun set(arbitrary: String, value: Any)
}

@JsName("default")
external var InputBase: dynamic /* ComponentClass<InputBaseProps, ComponentState> | FunctionComponent<InputBaseProps> */