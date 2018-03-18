package cz.filipproch.dependencyinjectionkotlin

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import cz.filipproch.dependencyinjectionkotlin.di.appDiModule

class MyApp : Application(), KodeinAware {

    override val kodein: Kodein = Kodein {
        import(appDiModule)
    }

}