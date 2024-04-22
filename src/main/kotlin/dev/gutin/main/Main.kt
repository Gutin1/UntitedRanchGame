package dev.gutin.main

import com.lehaine.littlekt.createLittleKtApp

fun main(args: Array<String>) {
    val app = createLittleKtApp {
        width = 960
        height = 540
        vSync = true
        title = "My First LittleKt App"
    }

    app.start { BlainsGame(it) }
}