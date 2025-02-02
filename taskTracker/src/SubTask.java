public class SubTask extends Task {
    private Integer epicId;

    public Integer getEpicId() {
        return epicId;
    }

    public void setEpicId(Integer epicId) {
        this.epicId = epicId;
    }

    public SubTask(String name, Integer _epicId){
        super(name);
        this.epicId = _epicId;
    }
}
