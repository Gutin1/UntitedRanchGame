package dev.gutin.main

import com.lehaine.littlekt.createLittleKtApp

fun main(args: Array<String>) {
    // TODO load configuration
    // TODO loading screen scene
    // TODO enter into title screen

    val app = createLittleKtApp {
        width = 960
        height = 540
        vSync = true
        title = "Untitled Game"
    }

    app.start { BlainsGame(it) }
}