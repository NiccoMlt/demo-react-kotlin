@file:JsModule("Snackbar")
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

external interface SnackbarOrigin {
    var vertical: dynamic /* 'top' | 'bottom' */
        get() = definedExternally
        set(value) = definedExternally
    var horizontal: dynamic /* 'left' | 'center' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SnackbarProps : Omit {
    var action: Any?
        get() = definedExternally
        set(value) = definedExternally
    var anchorOrigin: SnackbarOrigin?
        get() = definedExternally
        set(value) = definedExternally
    var autoHideDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ClickAwayListenerProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ContentProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disableWindowBlurListener: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var message: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onClose: ((event: React.SyntheticEvent<Any>, reason: String) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: React.MouseEventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: React.MouseEventHandler<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean
    var resumeHideDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var TransitionComponent: dynamic /* ComponentClass<TransitionProps, ComponentState> | FunctionComponent<TransitionProps> */
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Any?
        get() = definedExternally
        set(value) = definedExternally
    var TransitionProps: TransitionProps?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Snackbar: dynamic /* ComponentClass<SnackbarProps, ComponentState> | FunctionComponent<SnackbarProps> */