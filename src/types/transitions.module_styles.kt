@file:JsModule("styles")
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

external interface Easing {
    var easeInOut: String
    var easeOut: String
    var easeIn: String
    var sharp: String
}

external interface EasingPartial {
    var easeInOut: String?
        get() = definedExternally
        set(value) = definedExternally
    var easeOut: String?
        get() = definedExternally
        set(value) = definedExternally
    var easeIn: String?
        get() = definedExternally
        set(value) = definedExternally
    var sharp: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var easing: Easing

external interface Duration {
    var shortest: Number
    var shorter: Number
    var short: Number
    var standard: Number
    var complex: Number
    var enteringScreen: Number
    var leavingScreen: Number
}

external interface DurationPartial {
    var shortest: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shorter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var short: Number?
        get() = definedExternally
        set(value) = definedExternally
    var standard: Number?
        get() = definedExternally
        set(value) = definedExternally
    var complex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enteringScreen: Number?
        get() = definedExternally
        set(value) = definedExternally
    var leavingScreen: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external var duration: Duration

external fun formatMs(milliseconds: Number): String

external interface `T$0` {
    var duration: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var easing: String?
        get() = definedExternally
        set(value) = definedExternally
    var delay: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Transitions {
    var easing: Easing
    var duration: Duration
    fun create(props: String, options: `T$0` = definedExternally): String
    fun create(props: Array<String>, options: `T$0` = definedExternally): String
    fun getAutoHeightDuration(height: Number): Number
}

external interface TransitionsOptions {
    var easing: EasingPartial?
        get() = definedExternally
        set(value) = definedExternally
    var duration: DurationPartial?
        get() = definedExternally
        set(value) = definedExternally
    var create: ((props: dynamic /* String | Array<String> */, options: `T$0`) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var getAutoHeightDuration: ((height: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var transitions: Transitions