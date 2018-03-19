package cz.filipproch.dependencyinjectionkotlin.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import cz.filipproch.dependencyinjectionkotlin.R
import cz.filipproch.dependencyinjectionkotlin.model.Task
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(), MainView {

    private val presenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setupUI()
    }

    override fun onStart() {
        super.onStart()
        presenter.attach(this)
    }

    override fun onStop() {
        presenter.detach()
        super.onStop()
    }

    private fun setupUI() {
        vRecycler?.run {
            layoutManager = LinearLayoutManager(context)
            adapter = TasksAdapter()
        }
    }

    override fun setTasks(list: List<Task>) {
        vRecycler?.let {
            (it.adapter as TasksAdapter).tasks = list
        }
    }

}
