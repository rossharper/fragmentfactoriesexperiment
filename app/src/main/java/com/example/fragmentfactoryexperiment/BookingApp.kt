package com.example.fragmentfactoryexperiment

import android.app.Application

class BookingApp : Application() {
    override fun onCreate() {
        super.onCreate()

        ServiceLocator.init()
        Cars.init(ServiceLocator.stats)
    }
}