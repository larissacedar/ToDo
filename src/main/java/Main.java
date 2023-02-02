import Service.ToDoService;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = ConnectionUtil.getConnection();

        ToDoService ts = new ToDoService();

        System.out.println("Hello, Welcome to Model.ToDo List! \n Let's start, What's your name?");
        Scanner in = new Scanner(System.in);
            String name = in.nextLine();

        List<String> todolist = new ArrayList<>();
        boolean list = true;
        while (list) {
            System.out.println("Okay " + name + "\n 1-  View Tasks \n 2-Add to a list \n 3-View Completed Tasks" +
                    "\n 4-Quit");
            String userInput = in.nextLine();

            if (userInput.equals("1")) {
                System.out.println(ts.getAllTasks());

            } else if (userInput.equals("3")) {
                System.out.println(ts.getCompletedTasks());

            } else if (userInput.equals("2")) {
                System.out.println("task: ");
                    String task = in.nextLine();
                //todolist.add(task);
                System.out.println("dueDate: ");
                    String dueDate = in.nextLine();
                    //todolist.add(dueDate);
                System.out.println("Status: You can enter Completed, Future, Incomplete ");
                    String status = in.nextLine();
                //todolist.add(status);
                ts.addTask(task, dueDate, status);

            } else if (userInput.equals("4")) {
                list = false;
            }
        }
    }
}


