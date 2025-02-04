import java.util.HashMap;
public class TaskManager {
    HashMap<Integer, Task> taskList = new HashMap<>(); // Таблица для хранения задач
    HashMap<Integer, Epic>  epicList = new HashMap<>(); // Таблица для хранения эпиков
    HashMap<Integer, SubTask>  subTaskList = new HashMap<>(); // Таблица для хранения эпиков


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

    public void addSubTask(Integer _indexEpic,SubTask subTask){
        epicList.get(_indexEpic).addSubTask(index,subTask);
        epicList.get(_indexEpic).UpdateEpicStatus();
        index++;
    }


    // Удаление
    public void RemoveTask(Integer _index){
        taskList.remove(_index);
    }

    public void RemoveEpic(Integer _index){
        epicList.remove(_index);
    }

    public void RemoveSubTask(Integer _indexEpic,Integer _indexSubTask){
        epicList.get(_indexEpic).RemoveSubTask(_indexSubTask);
        epicList.get(_indexEpic).UpdateEpicStatus();
    }

    public HashMap<Integer, Task> getTaskList() {
        return taskList;
    }

    public HashMap<Integer, Epic> getEpicList() {
        return epicList;
    }
}
