import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Demo4";
        String user = "root";
        String password = "R21ec041..";

        String query = "CREATE TABLE provisions (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "card_number VARCHAR(20)," +
                "provision_status VARCHAR(10)" +
                ")";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            stmt.execute(query);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
}