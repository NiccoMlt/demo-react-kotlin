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

typealias PropsFor<SomeStyleFunction> = Any

typealias StyleFunction<Props> = (props: Props) -> Any

typealias SimpleStyleFunction<PropKey> = StyleFunction<Any>

external var border: SimpleStyleFunction<String /* 'border' */>

external var borderTop: SimpleStyleFunction<String /* 'borderTop' */>

external var borderRight: SimpleStyleFunction<String /* 'borderRight' */>

external var borderBottom: SimpleStyleFunction<String /* 'borderBottom' */>

external var borderLeft: SimpleStyleFunction<String /* 'borderLeft' */>

external var borderColor: SimpleStyleFunction<String /* 'borderColor' */>

external var borderRadius: SimpleStyleFunction<String /* 'borderRadius' */>

external var borders: SimpleStyleFunction<dynamic /* 'border' | 'borderTop' | 'borderRight' | 'borderBottom' | 'borderLeft' | 'borderColor' | 'borderRadius' */>

typealias BordersProps = PropsFor<Any>

external fun <Props, Breakpoints : String> breakpoints(styleFunction: StyleFunction<Props>): StyleFunction<Any>

typealias ComposedArg<T> = Any

typealias ComposedStyleProps<T> = ComposedArg<T>

typealias ComposedStyleFunction<T> = StyleFunction<ComposedStyleProps<T>>

external fun <T : Array<StyleFunction<Any>>> compose(vararg args: T): ComposedStyleFunction<T>

external fun <Props> css(styleFunction: StyleFunction<Props>): StyleFunction<Props /* Props & `T$0` */>

external var display: SimpleStyleFunction<dynamic /* 'display' | 'displayPrint' | 'overflow' | 'textOverflow' | 'visibility' | 'whiteSpace' */>

typealias DisplayProps = PropsFor<Any>

external var flexbox: SimpleStyleFunction<dynamic /* 'flexBasis' | 'flexDirection' | 'flexWrap' | 'justifyContent' | 'alignItems' | 'alignContent' | 'order' | 'flex' | 'flexGrow' | 'flexShrink' | 'alignSelf' | 'justifyItems' | 'justifySelf' */>

typealias FlexboxProps = PropsFor<Any>

external var color: SimpleStyleFunction<String /* 'color' */>

external var bgcolor: SimpleStyleFunction<String /* 'bgcolor' */>

external var palette: SimpleStyleFunction<dynamic /* 'bgcolor' | 'color' */>

typealias PaletteProps = PropsFor<Any>

external var positions: SimpleStyleFunction<dynamic /* 'zIndex' | 'position' | 'top' | 'right' | 'bottom' | 'left' */>

typealias PositionsProps = PropsFor<Any>

external var shadows: SimpleStyleFunction<String /* 'boxShadow' */>

typealias ShadowsProps = PropsFor<Any>

external var width: SimpleStyleFunction<String /* 'width' */>

external var maxWidth: SimpleStyleFunction<String /* 'maxWidth' */>

external var minWidth: SimpleStyleFunction<String /* 'minWidth' */>

external var height: SimpleStyleFunction<String /* 'height' */>

external var maxHeight: SimpleStyleFunction<String /* 'maxHeight' */>

external var minHeight: SimpleStyleFunction<String /* 'minHeight' */>

external var sizeWidth: SimpleStyleFunction<String /* 'sizeWidth' */>

external var sizeHeight: SimpleStyleFunction<String /* 'sizeHeight' */>

external var sizing: SimpleStyleFunction<dynamic /* 'width' | 'maxWidth' | 'minWidth' | 'height' | 'maxHeight' | 'minHeight' | 'sizeWidth' | 'sizeHeight' */>

typealias SizingProps = PropsFor<Any>

external var spacing: SimpleStyleFunction<dynamic /* 'm' | 'mt' | 'mr' | 'mb' | 'ml' | 'mx' | 'my' | 'p' | 'pt' | 'pr' | 'pb' | 'pl' | 'px' | 'py' | 'margin' | 'marginTop' | 'marginRight' | 'marginBottom' | 'marginLeft' | 'marginX' | 'marginY' | 'padding' | 'paddingTop' | 'paddingRight' | 'paddingBottom' | 'paddingLeft' | 'paddingX' | 'paddingY' */>

typealias SpacingProps = PropsFor<Any>

external interface StyleOptions<PropKey, Theme : Any?> {
    var cssProperty: dynamic /* PropKey | Any | false */
        get() = definedExternally
        set(value) = definedExternally
    var prop: PropKey
    var themeKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var transform: ((cssValue: Any) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <PropKey : String, Theme : Any?> style(options: StyleOptions<PropKey, Theme>): StyleFunction<Any /* Any & `T$1`<Theme> */>

external var fontFamily: SimpleStyleFunction<String /* 'fontFamily' */>

external var fontSize: SimpleStyleFunction<String /* 'fontSize' */>

external var fontStyle: SimpleStyleFunction<String /* 'fontStyle' */>

external var fontWeight: SimpleStyleFunction<String /* 'fontWeight' */>

external var letterSpacing: SimpleStyleFunction<String /* 'letterSpacing' */>

external var lineHeight: SimpleStyleFunction<String /* 'lineHeight' */>

external var textAlign: SimpleStyleFunction<String /* 'textAlign' */>

external var typography: SimpleStyleFunction<dynamic /* 'fontFamily' | 'fontSize' | 'fontStyle' | 'fontWeight' | 'letterSpacing' | 'lineHeight' | 'textAlign' */>

typealias TypographyProps = PropsFor<Any>

typealias Omit<T, K> = Any