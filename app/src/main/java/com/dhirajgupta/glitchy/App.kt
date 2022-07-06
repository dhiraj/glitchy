package com.dhirajgupta.glitchy

import android.app.Application
import timber.log.Timber

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.i("Timber debug tree planted")
        }
        else{
//            Timber.plant(CrashlyticsTree())
        }
    }
    companion object{
        lateinit var instance: Application
            private set
    }
}