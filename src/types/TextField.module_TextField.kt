@file:JsModule("TextField")
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

external interface BaseTextFieldProps : Omit {
    var autoComplete: String?
        get() = definedExternally
        set(value) = definedExternally
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* 'primary' | 'secondary' */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var defaultValue: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var FormHelperTextProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var fullWidth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var helperText: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var InputLabelProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var margin: dynamic /* 'none' | 'dense' | 'normal' */
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
    var required: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rows: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var rowsMax: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var select: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var SelectProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StandardTextFieldProps : BaseTextFieldProps {
    var onBlur: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onFocus: Any?
        get() = definedExternally
        set(value) = definedExternally
    var variant: String /* 'standard' */
    var InputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FilledTextFieldProps : BaseTextFieldProps {
    var onBlur: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onFocus: Any?
        get() = definedExternally
        set(value) = definedExternally
    var variant: String /* 'filled' */
    var InputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OutlinedTextFieldProps : BaseTextFieldProps {
    var onBlur: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onFocus: Any?
        get() = definedExternally
        set(value) = definedExternally
    var variant: String /* 'outlined' */
    var InputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var TextField: dynamic /* ComponentClass<dynamic /* StandardTextFieldProps | FilledTextFieldProps | OutlinedTextFieldProps */, ComponentState> | FunctionComponent<dynamic /* StandardTextFieldProps | FilledTextFieldProps | OutlinedTextFieldProps */> */