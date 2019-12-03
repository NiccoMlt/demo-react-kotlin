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

typealias EndHandler = (node: HTMLElement, done: () -> Unit) -> Unit

typealias EnterHandler = (node: HTMLElement, isAppearing: Boolean) -> Unit

typealias ExitHandler = (node: HTMLElement) -> Unit

external var UNMOUNTED: Any

external var EXITED: Any

external var ENTERING: Any

external var ENTERED: Any

external var EXITING: Any

external interface TransitionActions {
    var appear: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enter: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var exit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    var appear: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var exit: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TransitionProps : TransitionActions {
    var `in`: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mountOnEnter: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var unmountOnExit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: dynamic /* Number | `T$0` */
        get() = definedExternally
        set(value) = definedExternally
    var addEndListener: EndHandler?
        get() = definedExternally
        set(value) = definedExternally
    var onEnter: EnterHandler?
        get() = definedExternally
        set(value) = definedExternally
    var onEntering: EnterHandler?
        get() = definedExternally
        set(value) = definedExternally
    var onEntered: EnterHandler?
        get() = definedExternally
        set(value) = definedExternally
    var onExit: ExitHandler?
        get() = definedExternally
        set(value) = definedExternally
    var onExiting: ExitHandler?
        get() = definedExternally
        set(value) = definedExternally
    var onExited: ExitHandler?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactNode | (status: dynamic /* Any */) -> ReactNode */
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(prop: String): Any?
    @nativeSetter
    operator fun set(prop: String, value: Any)
}

external open class Transition : Component<TransitionProps>