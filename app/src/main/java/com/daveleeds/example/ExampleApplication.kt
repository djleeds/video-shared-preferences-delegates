package com.daveleeds.example

import android.app.Application
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class ExampleApplication : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()
        startKoin { modules(koinAppModule(applicationContext)) }
    }
}
