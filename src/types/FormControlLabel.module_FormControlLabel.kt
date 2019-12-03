@file:JsModule("FormControlLabel")
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

external interface FormControlLabelProps : Omit {
    var checked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var control: React.ReactElement
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((event: React.ChangeEvent<Any>, checked: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var labelPlacement: dynamic /* 'end' | 'start' | 'top' | 'bottom' */
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var FormControlLabel: dynamic /* ComponentClass<FormControlLabelProps, ComponentState> | FunctionComponent<FormControlLabelProps> */