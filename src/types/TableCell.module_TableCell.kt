@file:JsModule("TableCell")
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

external interface TableCellProps : Omit {
    var align: dynamic /* 'inherit' | 'left' | 'center' | 'right' | 'justify' */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<React.ThHTMLAttributes<HTMLTableHeaderCellElement> /* React.ThHTMLAttributes<HTMLTableHeaderCellElement> & React.TdHTMLAttributes<HTMLTableDataCellElement> */, ComponentState> | FunctionComponent<React.ThHTMLAttributes<HTMLTableHeaderCellElement> /* React.ThHTMLAttributes<HTMLTableHeaderCellElement> & React.TdHTMLAttributes<HTMLTableDataCellElement> */> */
        get() = definedExternally
        set(value) = definedExternally
    var padding: Padding?
        get() = definedExternally
        set(value) = definedExternally
    var size: Size?
        get() = definedExternally
        set(value) = definedExternally
    var sortDirection: dynamic /* 'asc' | 'desc' | false */
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'head' | 'body' | 'footer' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var TableCell: dynamic /* ComponentClass<TableCellProps, ComponentState> | FunctionComponent<TableCellProps> */