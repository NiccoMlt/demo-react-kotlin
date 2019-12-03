@file:JsModule("withTheme")
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

external interface WithThemeCreatorOption<Theme> {
    var defaultTheme: Theme?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WithTheme<Theme> {
    var theme: Theme
    var innerRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface WithThemePartial<Theme> {
    var theme: Theme?
        get() = definedExternally
        set(value) = definedExternally
    var innerRef: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ThemedComponentProps : Partial<WithTheme<DefaultTheme>> {
    var ref: dynamic /* Any | RefObject<Any> | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external fun <Theme> withThemeCreator(option: WithThemeCreatorOption<Theme>? = definedExternally): PropInjector<WithTheme<Theme>, ThemedComponentProps>

@JsName("default")
external fun <Theme, C : dynamic> withTheme(component: C): dynamic /* ComponentClass<Omit<JSX.LibraryManagedAttributes<C, React.ComponentProps<C>>, Any>, ComponentState> | FunctionComponent<Omit<JSX.LibraryManagedAttributes<C, React.ComponentProps<C>>, Any>> */