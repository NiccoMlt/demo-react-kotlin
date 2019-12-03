package app

import react.*
import react.dom.*
import logo.*
import ticker.*
import materialui.components.button.button
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonStyle
import materialui.components.button.enums.ButtonVariant

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
        div {
            button {
                attrs {
                    variant = ButtonVariant.contained
                    color = ButtonColor.primary
                }

                +"Primary button"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
