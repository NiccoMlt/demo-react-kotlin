@file:JsModule("Tab")
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
    var checked: Boolean
}

external interface `T$1` {
    var disableFocusRipple: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fullWidth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* String | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((event: React.ChangeEvent<`T$0`>, value: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onClick: React.EventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var textColor: dynamic /* String | 'secondary' | 'primary' | 'inherit' */
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var wrapped: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$2`<D> {
    var props: P /* P & `T$1` */
    var defaultComponent: D
    var classKey: dynamic /* 'root' | 'labelIcon' | 'textColorInherit' | 'textColorPrimary' | 'textColorSecondary' | 'selected' | 'disabled' | 'fullWidth' | 'wrapped' | 'wrapper' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Tab: ExtendButtonBase<TabTypeMap>