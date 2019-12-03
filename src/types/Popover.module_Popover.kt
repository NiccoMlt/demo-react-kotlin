@file:JsModule("Popover")
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

external interface PopoverOrigin {
    var vertical: dynamic /* 'top' | 'center' | 'bottom' | Number */
        get() = definedExternally
        set(value) = definedExternally
    var horizontal: dynamic /* 'left' | 'center' | 'right' | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external interface PopoverPosition {
    var top: Number
    var left: Number
}

external interface PopoverProps : Omit {
    var action: dynamic /* Any | RefObject<PopoverActions> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var anchorEl: dynamic /* Nothing? | Element | (element: Element) -> Element */
        get() = definedExternally
        set(value) = definedExternally
    var anchorOrigin: PopoverOrigin?
        get() = definedExternally
        set(value) = definedExternally
    var anchorPosition: PopoverPosition?
        get() = definedExternally
        set(value) = definedExternally
    var anchorReference: dynamic /* 'anchorEl' | 'anchorPosition' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var elevation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var getContentAnchorEl: ((element: Element) -> Element)?
        get() = definedExternally
        set(value) = definedExternally
    var marginThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var modal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var PaperProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var role: String?
        get() = definedExternally
        set(value) = definedExternally
    var transformOrigin: PopoverOrigin?
        get() = definedExternally
        set(value) = definedExternally
    var TransitionComponent: dynamic /* ComponentClass<TransitionProps, ComponentState> | FunctionComponent<TransitionProps> */
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: dynamic /* Any | 'auto' */
        get() = definedExternally
        set(value) = definedExternally
    var TransitionProps: TransitionProps?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PopoverActions {
    fun updatePosition()
}

@JsName("default")
external var Popover: dynamic /* ComponentClass<PopoverProps, ComponentState> | FunctionComponent<PopoverProps> */