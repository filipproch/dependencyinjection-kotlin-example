package cz.filipproch.dependencyinjectionkotlin.ui

import com.github.salomonbrys.kodein.Kodein
import cz.filipproch.dependencyinjectionkotlin.ui.main.diUiMainModule
import cz.filipproch.dependencyinjectionkotlin.ui.old.diUiOldModule

val diUiModule = Kodein.Module {

    import(diUiMainModule)

    import(diUiOldModule)

}