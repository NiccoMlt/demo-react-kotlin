@file:JsModule("Grid")
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

external interface GridTypeMap<P, D : dynamic> {
    var props: P /* P & Any & `T$0` */
    var defaultComponent: D
    var classKey: dynamic /* 'root' | 'container' | 'item' | 'direction-xs-column' | 'direction-xs-column-reverse' | 'direction-xs-row-reverse' | 'wrap-xs-nowrap' | 'wrap-xs-wrap-reverse' | 'align-items-xs-center' | 'align-items-xs-flex-start' | 'align-items-xs-flex-end' | 'align-items-xs-baseline' | 'align-content-xs-center' | 'align-content-xs-flex-start' | 'align-content-xs-flex-end' | 'align-content-xs-space-between' | 'align-content-xs-space-around' | 'justify-xs-center' | 'justify-xs-flex-end' | 'justify-xs-space-between' | 'justify-xs-space-around' | 'spacing-xs-1' | 'spacing-xs-2' | 'spacing-xs-3' | 'spacing-xs-4' | 'spacing-xs-5' | 'spacing-xs-6' | 'spacing-xs-7' | 'spacing-xs-8' | 'spacing-xs-9' | 'spacing-xs-10' | 'grid-xs-auto' | 'grid-xs-true' | 'grid-xs-1' | 'grid-xs-2' | 'grid-xs-3' | 'grid-xs-4' | 'grid-xs-5' | 'grid-xs-6' | 'grid-xs-7' | 'grid-xs-8' | 'grid-xs-9' | 'grid-xs-10' | 'grid-xs-11' | 'grid-xs-12' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Grid: OverridableComponent<GridTypeMap>