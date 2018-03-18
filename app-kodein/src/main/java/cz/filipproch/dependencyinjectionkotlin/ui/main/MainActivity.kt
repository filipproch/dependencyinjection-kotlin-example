package cz.filipproch.dependencyinjectionkotlin.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.android.AppCompatActivityInjector
import com.github.salomonbrys.kodein.instance
import cz.filipproch.dependencyinjectionkotlin.R
import cz.filipproch.dependencyinjectionkotlin.model.Task
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AppCompatActivityInjector, MainView {

    override val injector: KodeinInjector = KodeinInjector()

    private val presenter: MainPresenter by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeInjector()

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

    override fun onDestroy() {
        destroyInjector()
        super.onDestroy()
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
