@file:JsModule("Typography")
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

external interface TypographyProps : Omit {
    var align: dynamic /* 'inherit' | 'left' | 'center' | 'right' | 'justify' */
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* 'initial' | 'inherit' | 'primary' | 'secondary' | 'textPrimary' | 'textSecondary' | 'error' */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var display: dynamic /* 'initial' | 'block' | 'inline' */
        get() = definedExternally
        set(value) = definedExternally
    var gutterBottom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noWrap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var paragraph: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* ThemeStyle | 'srOnly' | 'inherit' */
        get() = definedExternally
        set(value) = definedExternally
    var variantMapping: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Typography: dynamic /* ComponentClass<TypographyProps, ComponentState> | FunctionComponent<TypographyProps> */