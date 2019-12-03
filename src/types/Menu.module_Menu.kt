@file:JsModule("Menu")
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

external interface MenuProps : Omit {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableAutoFocusItem: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var MenuListProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var PaperProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var PopoverClasses: Any?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: dynamic /* Any | 'auto' */
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'menu' | 'selectedMenu' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Menu: dynamic /* ComponentClass<MenuProps, ComponentState> | FunctionComponent<MenuProps> */