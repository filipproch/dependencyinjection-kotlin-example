package cz.filipproch.dependencyinjectionkotlin.ui.old;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.salomonbrys.kodein.Kodein;
import com.github.salomonbrys.kodein.KodeinAware;

import static com.github.salomonbrys.kodein.TypesKt.TT;

public class OldActivity extends AppCompatActivity implements OldView {

    private OldPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeDependencies();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attach(this);
    }

    @Override
    protected void onStop() {
        presenter.detach();
        super.onStop();
    }

    @Override
    public void setTasksCount(int count) {
        // TODO
    }

    /*
     * KODEIN specific
     */

    private void initializeDependencies() {
        this.presenter = kodeinInstance().Instance(
                TT(OldPresenter.class),
                null
        );
    }

    private Kodein kodeinInstance() {
        return ((KodeinAware) getApplication()).getKodein();
    }

}
