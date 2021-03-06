package cz.filipproch.dependencyinjectionkotlin.di

import com.github.salomonbrys.kodein.Kodein
import cz.filipproch.dependencyinjectionkotlin.model.diModel
import cz.filipproch.dependencyinjectionkotlin.ui.diUiModule

val appDiModule = Kodein.Module {

    import(diModel)
    import(diUiModule)

}