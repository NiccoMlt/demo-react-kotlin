@file:JsModule("Badge")
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

external interface BadgeOrigin {
    var vertical: dynamic /* 'top' | 'bottom' */
        get() = definedExternally
        set(value) = definedExternally
    var horizontal: dynamic /* 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BadgeProps : Omit {
    var anchorOrigin: BadgeOrigin?
        get() = definedExternally
        set(value) = definedExternally
    var overlap: dynamic /* 'rectangle' | 'circle' */
        get() = definedExternally
        set(value) = definedExternally
    var badgeContent: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* 'primary' | 'secondary' | 'default' | 'error' */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLDivElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLDivElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var invisible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showZero: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'standard' | 'dot' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun Badge(props: BadgeProps): JSX.Element?