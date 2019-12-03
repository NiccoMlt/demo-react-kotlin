@file:JsModule("TablePagination")
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

external interface LabelDisplayedRowsArgs {
    var from: Number
    var to: Number
    var count: Number
    var page: Number
}

external interface `T$0` {
    var value: Number
    var label: String
}

external interface `T$1` {
    var ActionsComponent: dynamic /* Any | ComponentClass<TablePaginationActionsProps, ComponentState> | FunctionComponent<TablePaginationActionsProps> */
        get() = definedExternally
        set(value) = definedExternally
    var backIconButtonProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var count: Number
    var labelDisplayedRows: ((paginationInfo: LabelDisplayedRowsArgs) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var labelRowsPerPage: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var nextIconButtonProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChangePage: (event: React.MouseEvent<HTMLButtonElement>?, page: Number) -> Unit
    var onChangeRowsPerPage: React.ChangeEventHandler<dynamic /* HTMLTextAreaElement | HTMLInputElement */>?
        get() = definedExternally
        set(value) = definedExternally
    var page: Number
    var rowsPerPage: Number
    var rowsPerPageOptions: Array<dynamic /* Number | `T$0` */>?
        get() = definedExternally
        set(value) = definedExternally
    var SelectProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TablePaginationTypeMap<P, D : dynamic> {
    var props: P /* P & TablePaginationBaseProps & `T$1` */
    var defaultComponent: D
    var classKey: dynamic /* 'root' | 'toolbar' | 'spacer' | 'menuItem' | 'caption' | 'input' | 'selectRoot' | 'select' | 'selectIcon' | 'actions' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var TablePagination: OverridableComponent<TablePaginationTypeMap<Any, dynamic /* ComponentClass<TablePaginationBaseProps, ComponentState> | FunctionComponent<TablePaginationBaseProps> */>>