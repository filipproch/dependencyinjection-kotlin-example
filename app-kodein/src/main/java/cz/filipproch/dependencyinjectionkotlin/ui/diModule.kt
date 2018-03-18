package cz.filipproch.dependencyinjectionkotlin.ui

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import cz.filipproch.dependencyinjectionkotlin.ui.main.MainPresenter

val diUI = Kodein.Module {

    bind<MainPresenter>() with provider {
        MainPresenter(
            random = instance(),
            repository = instance()
        )
    }

}