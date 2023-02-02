package Model;

public class ToDo {

       public String task;

       public String dueDate;
       public String status;

    @Override
    public String toString() {
        return "ToDo{" +
                "task='" + task + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ToDo(String task, String dueDate, String status) {
        this.task = task;
        this.dueDate = dueDate;
        this.status = status;


    }
}

