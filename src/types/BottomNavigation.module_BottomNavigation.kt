@file:JsModule("BottomNavigation")
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

external interface BottomNavigationProps : Omit {
    var component: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLDivElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLDivElement>> */
        get() = definedExternally
        set(value) = definedExternally
    val onChange: ((event: React.ChangeEvent<Any>, value: Any) -> Unit)?
        get() = definedExternally
    var showLabels: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun BottomNavigation(props: BottomNavigationProps): JSX.Element