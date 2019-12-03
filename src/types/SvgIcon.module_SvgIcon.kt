@file:JsModule("SvgIcon")
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

external interface SvgIconProps : Omit {
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* 'inherit' | 'primary' | 'secondary' | 'action' | 'disabled' | 'error' */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<React.SVGProps<SVGSVGElement>, ComponentState> | FunctionComponent<React.SVGProps<SVGSVGElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: dynamic /* 'inherit' | 'default' | 'small' | 'large' */
        get() = definedExternally
        set(value) = definedExternally
    var htmlColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var shapeRendering: String?
        get() = definedExternally
        set(value) = definedExternally
    var titleAccess: String?
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: String?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun SvgIcon(props: SvgIconProps): JSX.Element