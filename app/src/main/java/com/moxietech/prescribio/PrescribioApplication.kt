package com.moxietech.prescribio

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PrescribioApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}