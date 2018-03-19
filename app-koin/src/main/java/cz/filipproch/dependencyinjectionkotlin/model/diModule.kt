package cz.filipproch.dependencyinjectionkotlin.model

import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import java.util.*

val diModelModule : Module = applicationContext {

    bean {
        FakeTasksRepository() as TasksRepository
    }

    bean {
        Random()
    }

}