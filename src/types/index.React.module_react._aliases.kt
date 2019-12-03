@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package React

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

typealias ReactType<P> = dynamic

typealias ComponentState = Any

typealias SFCElement<P> = FunctionComponentElement<P>

typealias CElement<P, T> = ComponentElement<P, T>

typealias ClassicElement<P> = CElement<P, ClassicComponent<P, ComponentState>>

typealias Factory<P> = (props: Attributes /* Attributes & P */, children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */) -> ReactElement<P>

typealias SFCFactory<P> = FunctionComponentFactory<P>

typealias FunctionComponentFactory<P> = (props: Attributes /* Attributes & P */, children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */) -> FunctionComponentElement<P>

typealias ComponentFactory<P, T> = (props: ClassAttributes<T> /* ClassAttributes<T> & P */, children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */) -> CElement<P, T>

typealias CFactory<P, T> = ComponentFactory<P, T>

typealias ClassicFactory<P> = CFactory<P, ClassicComponent<P, ComponentState>>

typealias DOMFactory<P, T> = (props: ClassAttributes<T> /* ClassAttributes<T> & P */, children: dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */) -> DOMElement<P, T>

typealias ReactNodeArray = Array<dynamic /* ReactElement | String | Number | Any | ReactNodeArray | ReactPortal | Boolean | Nothing? | Nothing? */>

typealias ContextType<C> = Any

typealias Provider<T> = ProviderExoticComponent<ProviderProps<T>>

typealias Consumer<T> = ExoticComponent<ConsumerProps<T>>

typealias ProfilerOnRenderCallback = (id: String, phase: dynamic /* "mount" | "update" */, actualDuration: Number, baseDuration: Number, startTime: Number, commitTime: Number, interactions: Set<SchedulerInteraction>) -> Unit

typealias SFC<P> = FunctionComponent<P>

typealias StatelessComponent<P> = FunctionComponent<P>

typealias FC<P> = FunctionComponent<P>

typealias GetDerivedStateFromProps<P, S> = (nextProps: Readonly<P>, prevState: S) -> Partial<S>?

typealias GetDerivedStateFromError<P, S> = (error: Any) -> Partial<S>?

typealias PropsWithoutRef<P> = Any

typealias PropsWithRef<P> = Any

typealias ComponentProps<T> = Any

typealias ComponentPropsWithRef<T> = Any

typealias ComponentPropsWithoutRef<T> = PropsWithoutRef<ComponentProps<T>>

typealias Dispatch<A> = (value: A) -> Unit

typealias Reducer<S, A> = (prevState: S, action: A) -> S

typealias ReducerState<R> = Any

typealias ReducerAction<R> = Any

typealias DependencyList = Array<Any>

typealias EffectCallback = () -> dynamic

typealias EventHandler<E> = Any

typealias ReactEventHandler<T> = EventHandler<SyntheticEvent<T, Event>>

typealias ClipboardEventHandler<T> = EventHandler<ClipboardEvent<T>>

typealias CompositionEventHandler<T> = EventHandler<CompositionEvent<T>>

typealias DragEventHandler<T> = EventHandler<DragEvent<T>>

typealias FocusEventHandler<T> = EventHandler<FocusEvent<T>>

typealias FormEventHandler<T> = EventHandler<FormEvent<T>>

typealias ChangeEventHandler<T> = EventHandler<ChangeEvent<T>>

typealias KeyboardEventHandler<T> = EventHandler<KeyboardEvent<T>>

typealias MouseEventHandler<T> = EventHandler<MouseEvent<T, NativeMouseEvent>>

typealias TouchEventHandler<T> = EventHandler<TouchEvent<T>>

typealias PointerEventHandler<T> = EventHandler<PointerEvent<T>>

typealias UIEventHandler<T> = EventHandler<UIEvent<T>>

typealias WheelEventHandler<T> = EventHandler<WheelEvent<T>>

typealias AnimationEventHandler<T> = EventHandler<AnimationEvent<T>>

typealias TransitionEventHandler<T> = EventHandler<TransitionEvent<T>>

typealias Validator<T> = PropTypes.Validator<T>

typealias Requireable<T> = PropTypes.Requireable<T>

typealias ValidationMap<T> = PropTypes.ValidationMap<T>

typealias WeakValidationMap<T> = Any