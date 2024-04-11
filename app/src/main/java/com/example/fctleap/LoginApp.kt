package com.example.fctleap

import android.app.Application
import com.airbnb.lottie.BuildConfig
import timber.log.Timber
import timber.log.Timber.DebugTree

class LoginApp : Application() {
    override fun onCreate() {
        super.onCreate()
        //Herramienta para ver mejores logs
        if(BuildConfig.DEBUG){
            Timber.plant((DebugTree()))
        }
    }
}