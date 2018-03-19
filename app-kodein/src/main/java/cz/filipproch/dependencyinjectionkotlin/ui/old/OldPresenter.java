package cz.filipproch.dependencyinjectionkotlin.ui.old;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import cz.filipproch.dependencyinjectionkotlin.model.TasksRepository;

public class OldPresenter {

    @NotNull
    private final TasksRepository repository;
    @Nullable
    private OldView view;

    public OldPresenter(@NotNull TasksRepository repository) {
        this.repository = repository;
    }

    public void attach(OldView view) {
        this.view = view;

        updateCount();
    }

    public void detach() {
        this.view = null;
    }

    private void updateCount() {
        if (view == null) {
            return;
        }

        view.setTasksCount(
                repository.getTasks().size()
        );
    }

}
