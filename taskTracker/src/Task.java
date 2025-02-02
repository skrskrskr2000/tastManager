import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class Task {

    private ProcessReadness processDone; // Статус задачи 
    private String taskName; // Навание задачи
    private String description; // Описание задачи

    public void setDescription(String description) {
        this.description = description;
    }

    public ProcessReadness getProcessDone() {
        return processDone;
    }

    public void setProcessDone(ProcessReadness processDone) {
        this.processDone = processDone;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Task(String name) {
        this.taskName = name;
        this.processDone = ProcessReadness.NEW;
        this.description = "Описание";
    }
}
enum ProcessReadness{ // Прогресс готовности в задаче
    NEW, // Новая
    IN_PROGRESS, // В процессе выполнения
    DONE // Готова
}