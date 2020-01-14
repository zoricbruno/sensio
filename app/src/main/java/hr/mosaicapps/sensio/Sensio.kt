package hr.mosaicapps.sensio

import android.app.Application
import android.content.Context

class Sensio : Application() {

    companion object {
        lateinit var context: Context
            private set

    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}