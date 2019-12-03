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

external interface TypeText {
    var primary: String
    var secondary: String
    var disabled: String
    var hint: String
}

external interface TypeTextPartial {
    var primary: String?
        get() = definedExternally
        set(value) = definedExternally
    var secondary: String?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: String?
        get() = definedExternally
        set(value) = definedExternally
    var hint: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TypeAction {
    var active: String
    var hover: String
    var hoverOpacity: Number
    var selected: String
    var disabled: String
    var disabledBackground: String
}

external interface TypeActionPartial {
    var active: String?
        get() = definedExternally
        set(value) = definedExternally
    var hover: String?
        get() = definedExternally
        set(value) = definedExternally
    var hoverOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var selected: String?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: String?
        get() = definedExternally
        set(value) = definedExternally
    var disabledBackground: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TypeBackground {
    var default: String
    var paper: String
}

external interface TypeBackgroundPartial {
    var default: String?
        get() = definedExternally
        set(value) = definedExternally
    var paper: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SimplePaletteColorOptions {
    var light: String?
        get() = definedExternally
        set(value) = definedExternally
    var main: String
    var dark: String?
        get() = definedExternally
        set(value) = definedExternally
    var contrastText: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PaletteColor {
    var light: String
    var main: String
    var dark: String
    var contrastText: String
}

external interface TypeObject {
    var text: TypeText
    var action: TypeAction
    var divider: TypeDivider
    var background: TypeBackground
}

external var light: TypeObject

external var dark: TypeObject

external interface `T$0` {
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: Number? = definedExternally, lightShade: Number? = definedExternally, darkShade: Number? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: Number? = definedExternally, lightShade: Number? = definedExternally, darkShade: String? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: Number? = definedExternally, lightShade: String? = definedExternally, darkShade: Number? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: Number? = definedExternally, lightShade: String? = definedExternally, darkShade: String? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: String? = definedExternally, lightShade: Number? = definedExternally, darkShade: Number? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: String? = definedExternally, lightShade: Number? = definedExternally, darkShade: String? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: String? = definedExternally, lightShade: String? = definedExternally, darkShade: Number? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial, mainShade: String? = definedExternally, lightShade: String? = definedExternally, darkShade: String? = definedExternally): PaletteColor
    @nativeInvoke
    operator fun invoke(color: SimplePaletteColorOptions): PaletteColor
    @nativeInvoke
    operator fun invoke(color: ColorPartial): PaletteColor
}

external interface Palette {
    var common: CommonColors
    var type: PaletteType
    var contrastThreshold: Number
    var tonalOffset: Number
    var primary: PaletteColor
    var secondary: PaletteColor
    var error: PaletteColor
    var grey: Color
    var text: TypeText
    var divider: TypeDivider
    var action: TypeAction
    var background: TypeBackground
    var getContrastText: (background: String) -> String
    var augmentColor: `T$0`
}

external interface PaletteOptions {
    var primary: dynamic /* SimplePaletteColorOptions | ColorPartial */
        get() = definedExternally
        set(value) = definedExternally
    var secondary: dynamic /* SimplePaletteColorOptions | ColorPartial */
        get() = definedExternally
        set(value) = definedExternally
    var error: dynamic /* SimplePaletteColorOptions | ColorPartial */
        get() = definedExternally
        set(value) = definedExternally
    var type: PaletteType?
        get() = definedExternally
        set(value) = definedExternally
    var tonalOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var contrastThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var common: Any?
        get() = definedExternally
        set(value) = definedExternally
    var grey: ColorPartial?
        get() = definedExternally
        set(value) = definedExternally
    var text: TypeTextPartial?
        get() = definedExternally
        set(value) = definedExternally
    var divider: String?
        get() = definedExternally
        set(value) = definedExternally
    var action: TypeActionPartial?
        get() = definedExternally
        set(value) = definedExternally
    var background: TypeBackgroundPartial?
        get() = definedExternally
        set(value) = definedExternally
    var getContrastText: ((background: String) -> String)?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun createPalette(palette: PaletteOptions): Palette