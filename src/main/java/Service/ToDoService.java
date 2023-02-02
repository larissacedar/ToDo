package Service;

import DAO.ToDoRepository;
import Model.ToDo;

import java.util.List;

public class ToDoService {
    ToDoRepository pr;

    /*constructor*/
    public ToDoService() {
        pr = new ToDoRepository();
    }

    public List<ToDo> getAllTasks(){
       return pr.getAllTasks();
    }
    public List<ToDo> getCompletedTasks(){
       return pr.getCompletedTasks();
    }
    public List<ToDo> getTasksByDate(int date){
        return pr.getTasksByDate(date);
    }
    /*add a Task*/
    public void addTask(String task, String dueDate, String status){
        pr.addTask();
    }
}

//    public void addTask(String task, int dueDate, String status) {
//        repository.addTask(task, dueDate, status);
//    }
//    public List<Model.ToDo> getTasks(){
//        return repository.getTasks();
//    }
//}