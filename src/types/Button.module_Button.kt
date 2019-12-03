@file:JsModule("Button")
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
    var color: dynamic /* 'inherit' | 'primary' | 'secondary' | 'default' */
        get() = definedExternally
        set(value) = definedExternally
    var disableFocusRipple: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var endIcon: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var fullWidth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var href: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* 'small' | 'medium' | 'large' */
        get() = definedExternally
        set(value) = definedExternally
    var startIcon: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var variant: dynamic /* 'text' | 'outlined' | 'contained' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1`<D> {
    var props: P /* P & `T$0` */
    var defaultComponent: D
    var classKey: dynamic /* 'root' | 'label' | 'text' | 'textPrimary' | 'textSecondary' | 'outlined' | 'outlinedPrimary' | 'outlinedSecondary' | 'contained' | 'containedPrimary' | 'containedSecondary' | 'focusVisible' | 'disabled' | 'colorInherit' | 'textSizeSmall' | 'textSizeLarge' | 'outlinedSizeSmall' | 'outlinedSizeLarge' | 'containedSizeSmall' | 'containedSizeLarge' | 'sizeSmall' | 'sizeLarge' | 'fullWidth' | 'startIcon' | 'endIcon' | 'iconSizeSmall' | 'iconSizeMedium' | 'iconSizeLarge' */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Button: ExtendButtonBase<ButtonTypeMap>