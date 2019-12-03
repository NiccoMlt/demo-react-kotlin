@file:JsModule("withStyles")
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

external interface BaseCSSProperties : CSS.Properties<dynamic /* Number | String */> {
    var `@font-face`: dynamic /* CSS.FontFace | Array<CSS.FontFace /* CSS.FontFace & `T$0` */> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CSSProperties : BaseCSSProperties {
    @nativeGetter
    operator fun get(k: String): dynamic /* Any | CSSProperties */
    @nativeSetter
    operator fun set(k: String, value: Any)
    @nativeSetter
    operator fun set(k: String, value: CSSProperties)
}

external interface CreateCSSProperties<Props : Any?> : BaseCreateCSSProperties<Props> {
    @nativeGetter
    operator fun get(k: String): dynamic /* Any | CreateCSSProperties<Props> */
    @nativeSetter
    operator fun set(k: String, value: Any)
    @nativeSetter
    operator fun set(k: String, value: CreateCSSProperties<Props>)
}

external interface WithStylesOptions<Theme> : JSS.StyleSheetFactoryOptions {
    var defaultTheme: Theme?
        get() = definedExternally
        set(value) = definedExternally
    var flip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var withTheme: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StyledComponentProps<ClassKey : String> {
    var classes: Any?
        get() = definedExternally
        set(value) = definedExternally
    var innerRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun <StylesType : dynamic, Options : WithStylesOptions<ThemeOfStyles<StylesType>>> withStyles(style: StylesType, options: Options? = definedExternally): PropInjector<Any /* Any & `T$1` & PropsOfStyles<StylesType> */, StyledComponentProps<ClassKeyOfStyles<StylesType>> /* StyledComponentProps<ClassKeyOfStyles<StylesType>> & PropsOfStyles<StylesType> */>