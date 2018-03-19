package cz.filipproch.dependencyinjectionkotlin

import android.app.Application
import cz.filipproch.dependencyinjectionkotlin.di.diModules
import org.koin.android.ext.android.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, diModules)
    }

}