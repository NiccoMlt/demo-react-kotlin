@file:JsModule("Portal")
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

external interface PortalProps {
    var children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var container: dynamic /* Component<Any, Any> | Element | () -> dynamic | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var disablePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onRendered: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external fun Portal(props: PortalProps): JSX.Element