import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Demo4";
        String user = "root";
        String password = "R21ec041..";

        String query = "SELECT * FROM provisions";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Card Number: " + rs.getString("card_number"));
                System.out.println("Provision Status: " + rs.getString("provision_status"));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching records: " + e.getMessage());
        }
    }
}