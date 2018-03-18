package cz.filipproch.dependencyinjectionkotlin.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cz.filipproch.dependencyinjectionkotlin.R
import cz.filipproch.dependencyinjectionkotlin.model.Task
import kotlin.properties.Delegates

class TasksAdapter : RecyclerView.Adapter<TasksAdapter.VH>() {

    var tasks: List<Task> by Delegates.observable(
        initialValue = emptyList()
    ) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_todo_task, parent, false)
        )
    }

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        return holder.bind(
            item = tasks[position]
        )
    }

    class VH(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Task) {
            (itemView as TextView).text = item.message
        }
    }

}