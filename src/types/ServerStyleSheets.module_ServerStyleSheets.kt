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

external open class ServerStyleSheets(options: Any? = definedExternally) {
    open fun collect(children: ReactElement, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: String, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: Number, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: Any, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: ReactNodeArray, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: ReactPortal, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: Boolean, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: Nothing?, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    open fun collect(children: Nothing?, options: Any? = definedExternally): React.ReactElement<StylesProviderProps>
    override fun toString(): String
    open fun getStyleElement(props: Any? = definedExternally): React.ReactElement
}