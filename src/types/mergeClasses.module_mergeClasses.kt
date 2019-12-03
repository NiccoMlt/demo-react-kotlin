@file:JsModule("mergeClasses")
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

external interface Classes {
    @nativeGetter
    operator fun get(k: String): String?
    @nativeSetter
    operator fun set(k: String, value: String)
}

external interface MergeClassesOption {
    var baseClasses: Classes
    var newClasses: Classes
    var Component: dynamic /* Any | ComponentClass<P, ComponentState> | FunctionComponent<P> */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun mergeClasses(options: MergeClassesOption? = definedExternally): Classes