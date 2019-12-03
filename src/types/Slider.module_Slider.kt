@file:JsModule("Slider")
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

external interface Mark {
    var value: Number
    var label: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ValueLabelProps : React.HTMLAttributes<HTMLSpanElement> {
    var value: Number
    var open: Boolean
    var children: React.ReactElement
}

external interface SliderProps : Omit {
    var `aria-label`: String?
        get() = definedExternally
        set(value) = definedExternally
    var `aria-labelledby`: String?
        get() = definedExternally
        set(value) = definedExternally
    var `aria-valuetext`: String?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* 'primary' | 'secondary' */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLSpanElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLSpanElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var defaultValue: dynamic /* Number | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var getAriaLabel: ((index: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var getAriaValueText: ((value: Number, index: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var marks: dynamic /* Boolean | Array<Mark> */
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((event: React.ChangeEvent<Any>, value: dynamic /* Number | Array<Number> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onChangeCommitted: ((event: React.ChangeEvent<Any>, value: dynamic /* Number | Array<Number> */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var step: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ThumbComponent: dynamic /* Any | ComponentClass<React.HTMLAttributes<HTMLSpanElement>, ComponentState> | FunctionComponent<React.HTMLAttributes<HTMLSpanElement>> */
        get() = definedExternally
        set(value) = definedExternally
    var track: dynamic /* 'normal' | false | 'inverted' */
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Number | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
    var ValueLabelComponent: dynamic /* Any | ComponentClass<ValueLabelProps, ComponentState> | FunctionComponent<ValueLabelProps> */
        get() = definedExternally
        set(value) = definedExternally
    var valueLabelDisplay: dynamic /* 'on' | 'auto' | 'off' */
        get() = definedExternally
        set(value) = definedExternally
    var valueLabelFormat: dynamic /* String | (value: Number, index: Number) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

@JsName("default")
external var Slider: dynamic /* ComponentClass<SliderProps, ComponentState> | FunctionComponent<SliderProps> */