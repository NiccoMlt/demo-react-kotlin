@file:JsModule("MobileStepper")
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

external interface MobileStepperProps : Omit {
    var activeStep: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backButton: React.ReactElement
    var LinearProgressProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var nextButton: React.ReactElement
    var position: dynamic /* 'bottom' | 'top' | 'static' */
        get() = definedExternally
        set(value) = definedExternally
    var steps: Number
    var variant: dynamic /* 'text' | 'dots' | 'progress' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var MobileStepper: dynamic /* ComponentClass<MobileStepperProps, ComponentState> | FunctionComponent<MobileStepperProps> */