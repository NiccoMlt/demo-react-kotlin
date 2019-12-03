@file:JsModule("Popper")
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
    var `in`: Boolean
    var onEnter: () -> Any
    var onExited: () -> Any
}

external interface `T$1` {
    var placement: dynamic /* 'bottom-end' | 'bottom-start' | 'bottom' | 'left-end' | 'left-start' | 'left' | 'right-end' | 'right-start' | 'right' | 'top-end' | 'top-start' | 'top' */
        get() = definedExternally
        set(value) = definedExternally
    var TransitionProps: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PopperProps : React.HTMLAttributes<HTMLDivElement> {
    var anchorEl: dynamic /* Nothing? | ReferenceObject | () -> ReferenceObject */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? | (props: `T$1`) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var container: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disablePortal: Any?
        get() = definedExternally
        set(value) = definedExternally
    var keepMounted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var modifiers: Any?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean
    var placement: dynamic /* 'bottom-end' | 'bottom-start' | 'bottom' | 'left-end' | 'left-start' | 'left' | 'right-end' | 'right-start' | 'right' | 'top-end' | 'top-start' | 'top' */
        get() = definedExternally
        set(value) = definedExternally
    var popperOptions: Any?
        get() = definedExternally
        set(value) = definedExternally
    var popperRef: dynamic /* Any | RefObject<PopperJs> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var transition: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Popper: dynamic /* ComponentClass<PopperProps, ComponentState> | FunctionComponent<PopperProps> */