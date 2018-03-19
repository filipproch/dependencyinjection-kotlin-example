package cz.filipproch.dependencyinjectionkotlin.ui.main

import cz.filipproch.dependencyinjectionkotlin.model.Task

interface MainView {

    fun setTasks(list: List<Task>)

}