@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package react.materialui
import org.w3c.dom.events.Event
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Button/Button")
external val ButtonImport: dynamic

external interface ButtonProps : RProps {
    var color: String? get() = definedExternally; set(value) = definedExternally
    var component: String? get() = definedExternally; set(value) = definedExternally
    var disabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var disableFocusRipple: Boolean? get() = definedExternally; set(value) = definedExternally
    var disableRipple: Boolean? get() = definedExternally; set(value) = definedExternally
    var fullWidth: Boolean? get() = definedExternally; set(value) = definedExternally
    var href: String? get() = definedExternally; set(value) = definedExternally
    var mini: Boolean? get() = definedExternally; set(value) = definedExternally
    var size: dynamic /* String /* "small" */ | String /* "medium" */ | String /* "large" */ */ get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var variant: dynamic /* String /* "raised" */ | String /* "fab" */ | String /* "flat" */ | String /* "outlined" */ */ get() = definedExternally; set(value) = definedExternally
    var onClick : (Event) -> Unit
}


var Button: RClass<ButtonProps> = ButtonImport.default
