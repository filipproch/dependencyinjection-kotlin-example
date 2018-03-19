package cz.filipproch.dependencyinjectionkotlin.ui.main

import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

val diUiModule : Module = applicationContext {

    factory {
        MainPresenter(
            random = get(),
            repository = get()
        )
    }

}