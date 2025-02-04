import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class Task {

    private ProcessReadness processDone; // Статус задачи 
    private String taskName; // Навание задачи
    private String description; // Описание задачи

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(String name) {
        this.taskName = name;
        this.processDone = ProcessReadness.NEW;
        this.description = "Описание";
    }

    //Конструктор сразу с описанием
    public Task(String name,String description) {
        this.taskName = name;
        this.processDone = ProcessReadness.NEW;
        this.description = description;
    }

}
enum ProcessReadness{ // Прогресс готовности в задаче
    NEW, // Новая
    IN_PROGRESS, // В процессе выполнения
    DONE // Готова
}