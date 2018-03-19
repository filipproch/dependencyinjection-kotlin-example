package cz.filipproch.dependencyinjectionkotlin.di

import cz.filipproch.dependencyinjectionkotlin.model.diModelModule
import cz.filipproch.dependencyinjectionkotlin.ui.main.diUiModule
import org.koin.dsl.module.Module

val diModules = listOf<Module>(
    diUiModule,
    diModelModule
)