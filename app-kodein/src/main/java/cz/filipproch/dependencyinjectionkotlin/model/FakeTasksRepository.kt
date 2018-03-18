package cz.filipproch.dependencyinjectionkotlin.model

class FakeTasksRepository : TasksRepository {

    private val tasks: MutableList<Task> = mutableListOf()

    override fun createNewTask(message: String) {
        synchronized(tasks) {
            tasks.add(
                Task(
                    message = message
                )
            )
        }
    }

    override fun getTasks(): List<Task> {
        return tasks
    }

}