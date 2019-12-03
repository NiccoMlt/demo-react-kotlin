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

external interface Spacing {
    @nativeInvoke
    operator fun invoke(): Number
    @nativeInvoke
    operator fun invoke(value1: SpacingArgument): Number
    @nativeInvoke
    operator fun invoke(value1: SpacingArgument, value2: SpacingArgument): String
    @nativeInvoke
    operator fun invoke(value1: SpacingArgument, value2: SpacingArgument, value3: SpacingArgument): String
    @nativeInvoke
    operator fun invoke(value1: SpacingArgument, value2: SpacingArgument, value3: SpacingArgument, value4: SpacingArgument): String
}

@JsName("default")
external fun createSpacing(spacing: Number): Spacing

@JsName("default")
external fun createSpacing(spacing: (factor: Number) -> dynamic): Spacing