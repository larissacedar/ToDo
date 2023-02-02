package DAO;

import Model.ToDo;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {
    Connection conn;

    public ToDoRepository() {
        conn = ConnectionUtil.getConnection();
    }

    public List<ToDo> getAllTasks() {
        List<ToDo> allTasks = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * From ToDo");
            while(rs.next()){
                ToDo loadedTask = new ToDo(rs.getString("task"), rs.getString("dueDate"),
                        rs.getString("status"));
                allTasks.add(loadedTask);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allTasks;
    }

    public List<ToDo> getCompletedTasks() {
        return null;
    }
    public List<ToDo>getTasksByDate(int date){
        return null;
    }
    public void addTask(){
    }

}

//    List<Model.ToDo> tasks;
//
//    /*constructor*/
//    public ToDoRepository(){
//        tasks = new ArrayList<>();
//    }
//    /*method*/
//    public void addTask(String task, int dueDate, String status){
//        Model.ToDo t = new Model.ToDo(task, dueDate, status);
//        tasks.add(t);
//    }
//    public List<Model.ToDo> getTasks(){
//        return tasks;
//    }
//
//}
