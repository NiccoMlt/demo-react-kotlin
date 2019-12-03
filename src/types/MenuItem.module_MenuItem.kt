@file:JsModule("MenuItem")
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

external interface `T$0` {
    var button: String /* false */
}

external interface `T$1` {
    var button: String /* true */
}

@JsName("default")
external var MenuItem: OverridableComponent<Omit<ListItemTypeMap<`T$0`, Any>, String /* 'classKey' */> /* Omit<ListItemTypeMap<`T$0`, Any>, String /* 'classKey' */> & `T$2` */> /* OverridableComponent<MenuItemTypeMap<`T$0`, Any>> & ExtendButtonBase<MenuItemTypeMap<`T$1`, Any>> */