@file:JsModule("@material-ui/core")
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

external interface SwitchBaseProps : Omit {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var checked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var checkedIcon: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var defaultChecked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableRipple: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: React.InputHTMLAttributes<HTMLInputElement>?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((event: React.ChangeEvent<HTMLInputElement>, checked: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var readOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var required: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tabIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var SwitchBase: dynamic /* ComponentClass<SwitchBaseProps, ComponentState> | FunctionComponent<SwitchBaseProps> */