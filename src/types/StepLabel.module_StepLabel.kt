@file:JsModule("StepLabel")
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

external interface StepLabelProps : Omit {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alternativeLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var completed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var error: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: StepButtonIcon?
        get() = definedExternally
        set(value) = definedExternally
    var last: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var optional: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var orientation: Orientation?
        get() = definedExternally
        set(value) = definedExternally
    var StepIconComponent: dynamic /* Any | ComponentClass<P, ComponentState> | FunctionComponent<P> */
        get() = definedExternally
        set(value) = definedExternally
    var StepIconProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var StepLabel: dynamic /* ComponentClass<StepLabelProps, ComponentState> | FunctionComponent<StepLabelProps> */