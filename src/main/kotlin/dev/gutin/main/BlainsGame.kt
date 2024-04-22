package dev.gutin.main

import com.lehaine.littlekt.Context
import com.lehaine.littlekt.ContextListener
import com.lehaine.littlekt.graphics.gl.ClearBufferMask

class BlainsGame(context: Context) : ContextListener(context) {
    override suspend fun Context.start() {
        // this is where we can use the context to add render calls, dispose, calls, etc. All the logic should go here.
//        val texture = resourceVfs["texture.png"].readTexture() // reads a texture on the main thread from the resources
        onRender { dt -> // this adds a render updater that is called on every frame
            // render logic can go here
            gl.clear(ClearBufferMask.COLOR_BUFFER_BIT)
        }
    }
}