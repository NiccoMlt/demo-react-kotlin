@file:JsModule("useMediaQuery")
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

external interface MuiMediaQueryListEvent {
    var matches: Boolean
}

external interface MuiMediaQueryList {
    var matches: Boolean
    var addListener: (listener: MuiMediaQueryListListener) -> Unit
    var removeListener: (listener: MuiMediaQueryListListener) -> Unit
}

external interface `T$0` {
    var matches: Boolean
}

external interface Options {
    var defaultMatches: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noSsr: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ssrMatchMedia: ((query: String) -> `T$0`)?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun <Theme> useMediaQuery(query: String, options: Options? = definedExternally): Boolean

@JsName("default")
external fun <Theme> useMediaQuery(query: (theme: Theme) -> String, options: Options? = definedExternally): Boolean