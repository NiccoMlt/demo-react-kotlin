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

external interface ResponsiveFontSizesOptions {
    var breakpoints: Array<Breakpoint>?
        get() = definedExternally
        set(value) = definedExternally
    var disableAlign: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var factor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var variants: ThemeStyle?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun responsiveFontSizes(theme: Theme, options: ResponsiveFontSizesOptions? = definedExternally): Theme