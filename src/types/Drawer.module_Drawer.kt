@file:JsModule("Drawer")
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

external interface DrawerProps : Omit {
    var anchor: dynamic /* 'left' | 'top' | 'right' | 'bottom' */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var elevation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ModalProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var PaperProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var SlideProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var theme: Theme?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Any?
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'permanent' | 'persistent' | 'temporary' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Drawer: dynamic /* ComponentClass<DrawerProps, ComponentState> | FunctionComponent<DrawerProps> */