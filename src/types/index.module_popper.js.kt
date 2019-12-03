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

typealias Padding = Popper.Padding

typealias Position = dynamic

typealias Placement = dynamic

typealias Boundary = dynamic

typealias Behavior = dynamic

typealias ModifierFn = Popper.ModifierFn

typealias BaseModifier = Popper.BaseModifier

typealias Modifiers = Popper.Modifiers

typealias Offset = Popper.Offset

typealias Data = Popper.Data

typealias PopperOptions = Popper.PopperOptions

typealias ReferenceObject = Popper.ReferenceObject

external open class Popper {
    constructor(reference: Element, popper: Element, options: PopperOptions?)
    constructor(reference: ReferenceObject, popper: Element, options: PopperOptions?)
    open var options: PopperOptions
    open var popper: Element
    open var reference: dynamic /* Element | ReferenceObject */
    open fun destroy()
    open fun update()
    open fun scheduleUpdate()
    open fun enableEventListeners()
    open fun disableEventListeners()
    interface Attributes {
        var `x-out-of-boundaries`: dynamic /* '' | false */
        var `x-placement`: dynamic /* 'auto-start' | 'auto' | 'auto-end' | 'top-start' | 'top' | 'top-end' | 'right-start' | 'right' | 'right-end' | 'bottom-end' | 'bottom' | 'bottom-start' | 'left-end' | 'left' | 'left-start' */
    }
    interface Padding {
        var top: Number?
        var bottom: Number?
        var left: Number?
        var right: Number?
    }
    interface BaseModifier {
        var order: Number?
        var enabled: Boolean?
        var fn: ModifierFn?
    }
    interface Modifiers {
        var shift: BaseModifier?
        var offset: BaseModifier /* BaseModifier & `T$0` */
        var preventOverflow: BaseModifier /* BaseModifier & `T$1` */
        var keepTogether: BaseModifier?
        var arrow: BaseModifier /* BaseModifier & `T$2` */
        var flip: BaseModifier /* BaseModifier & `T$3` */
        var inner: BaseModifier?
        var hide: BaseModifier?
        var applyStyle: BaseModifier /* BaseModifier & `T$4` */
        var computeStyle: BaseModifier /* BaseModifier & `T$5` */
        @nativeGetter
        operator fun get(name: String): BaseModifier /* BaseModifier & Record<String, Any> */
        @nativeSetter
        operator fun set(name: String, value: BaseModifier /* BaseModifier & Record<String, Any> */)
    }
    interface Offset {
        var top: Number
        var left: Number
        var width: Number
        var height: Number
    }
    interface `T$6` {
        var top: Number
        var left: Number
    }
    interface `T$7` {
        var popper: Offset
        var reference: Offset
        var arrow: `T$6`
    }
    interface Data {
        var instance: Popper
        var placement: dynamic /* 'auto-start' | 'auto' | 'auto-end' | 'top-start' | 'top' | 'top-end' | 'right-start' | 'right' | 'right-end' | 'bottom-end' | 'bottom' | 'bottom-start' | 'left-end' | 'left' | 'left-start' */
        var originalPlacement: dynamic /* 'auto-start' | 'auto' | 'auto-end' | 'top-start' | 'top' | 'top-end' | 'right-start' | 'right' | 'right-end' | 'bottom-end' | 'bottom' | 'bottom-start' | 'left-end' | 'left' | 'left-start' */
        var flipped: Boolean
        var hide: Boolean
        var arrowElement: Element
        var styles: CSSStyleDeclaration
        var arrowStyles: CSSStyleDeclaration
        var attributes: Attributes
        var boundaries: Any
        var offsets: `T$7`
    }
    interface PopperOptions {
        var placement: dynamic /* 'auto-start' | 'auto' | 'auto-end' | 'top-start' | 'top' | 'top-end' | 'right-start' | 'right' | 'right-end' | 'bottom-end' | 'bottom' | 'bottom-start' | 'left-end' | 'left' | 'left-start' */
        var positionFixed: Boolean?
        var eventsEnabled: Boolean?
        var modifiers: Modifiers?
        var removeOnDestroy: Boolean?
        val onCreate: ((data: Data) -> Unit)?
        val onUpdate: ((data: Data) -> Unit)?
    }
    interface ReferenceObject {
        var clientHeight: Number
        var clientWidth: Number
        var referenceNode: Node?
        fun getBoundingClientRect(): ClientRect
    }

    companion object {
        var modifiers: Array<BaseModifier /* BaseModifier & `T$8` */>
        var placements: Array<Placement>
        var Defaults: PopperOptions
    }
}