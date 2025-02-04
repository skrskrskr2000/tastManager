import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Epic extends Task{
    private HashMap<Integer, SubTask> subTaskList = new HashMap<>(); // Таблица для хранения подзадач

    public Epic(String name) {
        super(name);
    }

    public Epic(String name,String description) {
        super(name,description);
    }

    public void addSubTask(Integer index ,SubTask subTask){
        subTaskList.put(index,subTask);
    }

    public void RemoveSubTask(Integer index){
        subTaskList.remove(index);
    }

    public void UpdateEpicStatus(){

        boolean _new = false;
        boolean _progress = false;
        boolean _done = false;

        // Проверка если пустой
        if (subTaskList.isEmpty()) {
          setProcessDone(ProcessReadness.NEW);
          return;
        }

        for (Integer key  : subTaskList.keySet()){
            switch (subTaskList.get(key).getProcessDone()) {
                case NEW: {
                    _new = true;
                    break;
                }
                case DONE: {
                    _done = true;
                    break;
                }
                case IN_PROGRESS: {
                    _progress = true;
                    break;
                }

            }
        }

        if (_new) {
            this.setProcessDone(ProcessReadness.NEW);
            return;
        } else if (_progress) {
            this.setProcessDone(ProcessReadness.IN_PROGRESS);
            return;
        }else {
            this.setProcessDone(ProcessReadness.DONE);
            return;
        }


    }

    public HashMap<Integer, SubTask> getSubTaskList() {
        return subTaskList;
    }
}
