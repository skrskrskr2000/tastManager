import java.util.HashMap;
public class TaskManager {
    HashMap<Integer, Task> taskList = new HashMap<>(); // Таблица для хранения задач
    HashMap<Integer, Epic>  epicList = new HashMap<>(); // Таблица для хранения эпиков
    HashMap<Integer, SubTask> subTaskList = new HashMap<>(); // Таблица для хранения подзадач

    private Integer index = 0; // Индекс конкретной задачи/подзадачи


    public TaskManager TaskManager() {

        return this;
    }

    //Добавление
    public void addTask(Task task){
        taskList.put(index,task);
        index++;
    }
    public void addEpic(Epic epic){
        epicList.put(index,epic);
        index++;
    }

    public void addSubTask(SubTask subTask){
        subTaskList.put(index,subTask);
        index++;
    }

    // Удаление
    public void RemoveTask(Integer _index){
        taskList.remove(_index);
    }

    public void RemoveEpic(Integer _index){
        epicList.remove(_index);
    }

    public void RemoveSubTask(Integer _index){
        subTaskList.remove(_index);
    }


}
