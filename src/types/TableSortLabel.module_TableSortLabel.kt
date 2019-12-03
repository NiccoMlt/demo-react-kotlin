@file:JsModule("TableSortLabel")
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

external interface `T$0` {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var direction: dynamic /* 'asc' | 'desc' */
        get() = definedExternally
        set(value) = definedExternally
    var hideSortIcon: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var IconComponent: dynamic /* ComponentClass<SvgIconProps, ComponentState> | FunctionComponent<SvgIconProps> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1`<D> {
    var props: P /* P & `T$0` */
    var defaultComponent: D
    var classKey: dynamic /* 'root' | 'active' | 'icon' | 'iconDirectionDesc' | 'iconDirectionAsc' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var TableSortLabel: ExtendButtonBase<TableSortLabelTypeMap>