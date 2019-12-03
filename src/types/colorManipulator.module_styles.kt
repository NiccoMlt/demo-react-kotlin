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

external interface ColorObject {
    var type: dynamic /* 'rgb' | 'rgba' | 'hsl' | 'hsla' */
        get() = definedExternally
        set(value) = definedExternally
    var values: dynamic /* dynamic | dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external fun hexToRgb(hex: String): String

external fun rgbToHex(color: String): String

external fun hslToRgb(color: String): String

external fun decomposeColor(color: String): ColorObject

external fun recomposeColor(color: ColorObject): String

external fun getContrastRatio(foreground: String, background: String): Number

external fun getLuminance(color: String): Number

external fun emphasize(color: String, coefficient: Number? = definedExternally): String

external fun fade(color: String, value: Number): String

external fun darken(color: String, coefficient: Number? = definedExternally): String

external fun lighten(color: String, coefficient: Number? = definedExternally): String