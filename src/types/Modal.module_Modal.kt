@file:JsModule("Modal")
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

external interface ModalProps : Omit {
    var BackdropComponent: dynamic /* Any | ComponentClass<BackdropProps, ComponentState> | FunctionComponent<BackdropProps> */
        get() = definedExternally
        set(value) = definedExternally
    var BackdropProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var children: React.ReactElement
    var closeAfterTransition: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var container: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disableAutoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableBackdropClick: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableEnforceFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableEscapeKeyDown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disablePortal: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disableRestoreFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableScrollLock: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideBackdrop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepMounted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var manager: ModalManager?
        get() = definedExternally
        set(value) = definedExternally
    var onBackdropClick: React.ReactEventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onEscapeKeyDown: React.ReactEventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onRendered: Any?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean
}

@JsName("default")
external var Modal: dynamic /* ComponentClass<ModalProps, ComponentState> | FunctionComponent<ModalProps> */