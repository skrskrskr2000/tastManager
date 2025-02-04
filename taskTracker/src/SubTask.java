public class SubTask extends Task {
    private Integer epicId;
    private Epic epic;

    public Integer getEpicId() {
        return epicId;
    }

    @Override
    public void setProcessDone(ProcessReadness processDone) {
        super.setProcessDone(processDone);
        epic.UpdateEpicStatus();
    }

    public void setEpicId(Integer epicId) {
        this.epicId = epicId;
    }

    public SubTask(String name, Integer _epicId, Epic epic){
        super(name);
        this.epicId = _epicId;
        this.epic = epic;
    }

    public SubTask(String name,String descrription, Integer _epicId, Epic epic){
        super(name,descrription);
        this.epicId = _epicId;
        this.epic = epic;
    }
}
