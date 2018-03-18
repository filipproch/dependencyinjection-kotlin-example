package cz.filipproch.dependencyinjectionkotlin.ui.main

import cz.filipproch.dependencyinjectionkotlin.model.MESSAGES
import cz.filipproch.dependencyinjectionkotlin.model.TasksRepository
import java.util.*

class MainPresenter(
    private val random: Random,
    private val repository: TasksRepository
) {

    private var view: MainView? = null

    fun attach(view: MainView) {
        this.view = view
    }

    fun detach() {
        this.view = null
    }

    fun onAddTaskClicked() {
        repository.createNewTask(
            message = randomMessage()
        )
    }

    private fun randomMessage(): String {
        return MESSAGES[random.nextInt(MESSAGES.size)]
    }

}