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

external interface `T$0`<C> {
    var component: C
}

external interface OverridableComponent<M : OverridableTypeMap> {
    @nativeInvoke
    operator fun <C : dynamic> invoke(props: `T$0`<C> /* `T$0`<C> & OverrideProps<M, C> */): JSX.Element
    @nativeInvoke
    operator fun invoke(props: BaseProps<M> /* BaseProps<M> & Omit<React.ComponentPropsWithRef<Any>, Any> */): JSX.Element
}

external interface CommonProps<M : OverridableTypeMap> : StyledComponentProps<Any> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var style: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OverridableTypeMap {
    var props: Any
    var defaultComponent: dynamic /* Any | ComponentClass<P, ComponentState> | FunctionComponent<P> */
        get() = definedExternally
        set(value) = definedExternally
    var classKey: String
}

typealias Simplify<T> = Any

typealias SimplifiedPropsOf<C> = Simplify<React.ComponentProps<C>>