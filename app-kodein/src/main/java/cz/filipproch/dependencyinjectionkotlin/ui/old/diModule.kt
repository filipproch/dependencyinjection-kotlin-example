package cz.filipproch.dependencyinjectionkotlin.ui.old

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider

val diUiOldModule = Kodein.Module {

    bind<OldPresenter>() with provider {
        OldPresenter(
            instance()
        )
    }

}