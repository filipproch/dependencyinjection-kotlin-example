package cz.filipproch.dependencyinjectionkotlin.ui.main

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider

val diUiMainModule = Kodein.Module {

    bind<MainPresenter>() with provider {
        MainPresenter(
            random = instance(),
            repository = instance()
        )
    }

}