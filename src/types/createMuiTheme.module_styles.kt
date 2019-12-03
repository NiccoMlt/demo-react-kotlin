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

external interface ThemeOptions {
    var shape: ShapeOptions?
        get() = definedExternally
        set(value) = definedExternally
    var breakpoints: BreakpointsOptions?
        get() = definedExternally
        set(value) = definedExternally
    var direction: dynamic /* 'ltr' | 'rtl' */
        get() = definedExternally
        set(value) = definedExternally
    var mixins: MixinsOptions?
        get() = definedExternally
        set(value) = definedExternally
    var overrides: Overrides?
        get() = definedExternally
        set(value) = definedExternally
    var palette: PaletteOptions?
        get() = definedExternally
        set(value) = definedExternally
    var props: ComponentsProps?
        get() = definedExternally
        set(value) = definedExternally
    var shadows: Shadows?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: SpacingOptions?
        get() = definedExternally
        set(value) = definedExternally
    var transitions: TransitionsOptions?
        get() = definedExternally
        set(value) = definedExternally
    var typography: dynamic /* TypographyOptions | (palette: Palette) -> TypographyOptions */
        get() = definedExternally
        set(value) = definedExternally
    var zIndex: ZIndexOptions?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Theme {
    var shape: Shape
    var breakpoints: Breakpoints
    var direction: dynamic /* 'ltr' | 'rtl' */
        get() = definedExternally
        set(value) = definedExternally
    var mixins: Mixins
    var overrides: Overrides?
        get() = definedExternally
        set(value) = definedExternally
    var palette: Palette
    var props: ComponentsProps?
        get() = definedExternally
        set(value) = definedExternally
    var shadows: Shadows
    var spacing: Spacing
    var transitions: Transitions
    var typography: Typography
    var zIndex: ZIndex
}

@JsName("default")
external fun createMuiTheme(options: ThemeOptions? = definedExternally, vararg args: Any?): Theme