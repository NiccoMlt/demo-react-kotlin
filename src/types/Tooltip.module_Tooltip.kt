@file:JsModule("Tooltip")
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

external interface TooltipProps : Omit {
    var arrow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var children: React.ReactElement
    var disableFocusListener: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableHoverListener: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableTouchListener: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enterDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enterTouchDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var interactive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leaveDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var leaveTouchDelay: Number?
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
    var placement: dynamic /* 'bottom-end' | 'bottom-start' | 'bottom' | 'left-end' | 'left-start' | 'left' | 'right-end' | 'right-start' | 'right' | 'top-end' | 'top-start' | 'top' */
        get() = definedExternally
        set(value) = definedExternally
    var PopperProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var TransitionComponent: dynamic /* ComponentClass<TransitionProps, ComponentState> | FunctionComponent<TransitionProps> */
        get() = definedExternally
        set(value) = definedExternally
    var TransitionProps: TransitionProps?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Tooltip: dynamic /* ComponentClass<TooltipProps, ComponentState> | FunctionComponent<TooltipProps> */