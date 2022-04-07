import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


    static String URL = "jdbc:mysql://localhost:3306/javaprojectdb";
    static String USER = "root";
    static Connection con = null;

    public static Connection getconnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, "");
            return con;
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: unable to load driver class!");
            return con;
        }

    }


    public boolean checkconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, "");
            return true;
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: unable to load driver class!");
            return false;
        }
    }
}

