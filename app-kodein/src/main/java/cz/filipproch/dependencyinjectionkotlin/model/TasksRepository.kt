package cz.filipproch.dependencyinjectionkotlin.model

interface TasksRepository {

    fun createNewTask(message: String)

    fun getTasks(): List<Task>

}