package cz.filipproch.dependencyinjectionkotlin.model

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.provider
import com.github.salomonbrys.kodein.singleton
import java.util.*

val diModel = Kodein.Module {

    bind<TasksRepository>() with provider {
        FakeTasksRepository()
    }

    bind<Random>() with singleton { Random() }

}