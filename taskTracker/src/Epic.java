import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Epic extends Task{
    private HashMap<Integer, SubTask> subTaskList = new HashMap<>(); // Таблица для хранения подзадач

    public Epic(String name){
        super(name);
    }

    public void addSubTask(Integer index ,SubTask subTask){
        subTaskList.put(index,subTask);
    }

    public void RemoveSubTask(Integer index){
        subTaskList.remove(index);
    }

    public HashMap<Integer, SubTask> getSubTaskList() {
        return subTaskList;
    }
}
