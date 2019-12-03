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

external interface ReactElementLike {
    var type: dynamic /* String | (props: Any, context: Any? /* = null */) -> Any | Any */
        get() = definedExternally
        set(value) = definedExternally
    var props: Any
    var key: dynamic /* String | Number | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

typealias ReactNodeArray = Array<dynamic /* Any | ReactElementLike | ReactNodeArray | String | Number | Boolean | Nothing? | Nothing? */>

external var nominalTypeHack: Any

typealias IsOptional<T> = Any

typealias RequiredKeys<V> = Any

typealias OptionalKeys<V> = Exclude<Any, RequiredKeys<V>>

typealias InferPropsInner<V> = Any

external interface Validator<T> {
    @nativeInvoke
    operator fun invoke(props: Json, propName: String, componentName: String, location: String, propFullName: String): Error?
}

external interface Requireable<T> : Validator<T?> {
    var isRequired: Validator<NonNullable<T>>
}

typealias ValidationMap<T> = Any

typealias InferType<V> = Any

external var any: Requireable<Any>

external var array: Requireable<Array<Any>>

external var bool: Requireable<Boolean>

external var func: Requireable<(args: Any) -> Any>

external var number: Requireable<Number>

external var `object`: Requireable<Any?>

external var string: Requireable<String>

external var node: Requireable<dynamic /* Any | ReactElementLike | ReactNodeArray | String | Number | Boolean | Nothing? | Nothing? */>

external var element: Requireable<ReactElementLike>

external var symbol: Requireable<Any>

external var elementType: Requireable<dynamic /* String | (props: Any, context: Any? /* = null */) -> Any | Any */>

external fun <T> instanceOf(expectedClass: Any): Requireable<T>

external fun <T> oneOf(types: Array<T>): Requireable<T>

external fun <T : Validator<Any>> oneOfType(types: Array<T>): Requireable<NonNullable<InferType<T>>>

external fun <T> arrayOf(type: Validator<T>): Requireable<Array<T>>

external fun <T> objectOf(type: Validator<T>): Requireable<Any>

external fun <P : ValidationMap<Any>> shape(type: P): Requireable<InferPropsInner<Any> /* InferPropsInner<Any> & Any */>

external fun <P : ValidationMap<Any>> exact(type: P): Requireable<Required<InferPropsInner<Any> /* InferPropsInner<Any> & Any */>>

external fun checkPropTypes(typeSpecs: Any, values: Any, location: String, componentName: String, getStack: (() -> Any)? = definedExternally)

external fun resetWarningCache()