import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static final String URL="jdbc:postgresql://localhost:5432/employee_db";
    private static final String USER="postgres";
    private static final String PASSWORD="1234";
    public static Connection getConnection() {
        try {
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Database Connected!");
            return con;
        } catch(SQLException e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
            return null;
        }
    }
}
