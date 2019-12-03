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

external interface FontStyle : Required<dynamic>

external interface FontStyleOptions : Partial<FontStyle> {
    var htmlFontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var allVariants: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TypographyStyleOptions : Partial<Required<Pick<CSSProperties, dynamic /* 'fontFamily' | 'fontSize' | 'fontWeight' | 'fontStyle' | 'color' */>> /* Required<Pick<CSSProperties, dynamic /* 'fontFamily' | 'fontSize' | 'fontWeight' | 'fontStyle' | 'color' */>> & Any */>

external interface TypographyUtils {
    var pxToRem: (px: Number) -> String
}

external interface Typography : Record<dynamic /* 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'subtitle1' | 'subtitle2' | 'body1' | 'body2' | 'caption' | 'button' | 'overline' */, Required<Pick<CSSProperties, dynamic /* 'fontFamily' | 'fontSize' | 'fontWeight' | 'fontStyle' | 'color' */>> /* Required<Pick<CSSProperties, dynamic /* 'fontFamily' | 'fontSize' | 'fontWeight' | 'fontStyle' | 'color' */>> & Any */>, FontStyle, TypographyUtils

external interface TypographyOptions : Partial<Record<dynamic /* 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'subtitle1' | 'subtitle2' | 'body1' | 'body2' | 'caption' | 'button' | 'overline' */, TypographyStyleOptions> /* Record<ThemeStyle, TypographyStyleOptions> & FontStyleOptions */>

@JsName("default")
external fun createTypography(palette: Palette, typography: TypographyOptions): Typography

@JsName("default")
external fun createTypography(palette: Palette, typography: (palette: Palette) -> TypographyOptions): Typography