@file:JsModule("StylesProvider")
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

external interface StylesOptions {
    var disableGeneration: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generateClassName: GenerateId?
        get() = definedExternally
        set(value) = definedExternally
    var injectFirst: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var jss: Jss?
        get() = definedExternally
        set(value) = definedExternally
    var sheetsCache: Any?
        get() = definedExternally
        set(value) = definedExternally
    var sheetsManager: Any?
        get() = definedExternally
        set(value) = definedExternally
    var sheetsRegistry: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external var StylesContext: React.Context<StylesOptions>

external interface StylesProviderProps : StylesOptions {
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var StylesProvider: dynamic /* ComponentClass<StylesProviderProps, ComponentState> | FunctionComponent<StylesProviderProps> */