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

external var keys: Array<dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' */>

external interface Breakpoints {
    var keys: Array<dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' */>
    var values: BreakpointValues
    var up: (key: dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' | Number */) -> String
    var down: (key: dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' | Number */) -> String
    var between: (start: dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' */, end: dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' */) -> String
    var only: (key: dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' */) -> String
    var width: (key: dynamic /* 'xs' | 'sm' | 'md' | 'lg' | 'xl' */) -> Number
}

external interface `T$0` {
    var unit: String
    var step: Number
}

@JsName("default")
external fun createBreakpoints(options: BreakpointsOptions): Breakpoints