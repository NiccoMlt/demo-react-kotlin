package app

import react.*
import react.dom.*
import logo.*
import react.materialui.Button
import ticker.*

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
            Button {
                attrs {
                    variant="contained"
                    color="primary"
                }
                +"Cool button"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
