@file:JsModule("SwipeableDrawer")
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

external interface SwipeableDrawerProps : Omit<DrawerProps, dynamic /* 'onClose' | 'open' */> {
    var disableBackdropTransition: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableDiscovery: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableSwipeToOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hysteresis: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minFlingVelocity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: React.ReactEventHandler<Any>
    var onOpen: React.ReactEventHandler<Any>
    var open: Boolean
    var SwipeAreaProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var swipeAreaWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var SwipeableDrawer: dynamic /* ComponentClass<SwipeableDrawerProps, ComponentState> | FunctionComponent<SwipeableDrawerProps> */