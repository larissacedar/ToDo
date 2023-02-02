package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    /*static connection */
    private static Connection conn;

    /* static method*/

    public static Connection getConnection(){
        if(conn == null){
            try{
                String url = "jdbc:sqlserver://localhost: 1433;TrustServerCertificate=True";
                String username = "sa";
                String password = "P@SSWORD123";

                conn = DriverManager.getConnection(url, username, password);
            }catch(SQLException e){
                /* The stack trace can be used to diagnose the cause of the
                exception and help determine the best way to fix the problem.*/
                e.printStackTrace();

            }
        }
        return conn;
    }
}
