@file:JsModule("ListItemText")
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

external interface ListItemTextProps : Omit {
    var disableTypography: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inset: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var primary: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var primaryTypographyProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var secondary: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var secondaryTypographyProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var ListItemText: dynamic /* ComponentClass<ListItemTextProps, ComponentState> | FunctionComponent<ListItemTextProps> */