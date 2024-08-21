import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Demo4";
        String user = "root";
        String password = "R21ec041..";

        String query = "INSERT INTO provisions (card_number, provision_status) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "1234567890123456");
            pstmt.setString(2, "active");
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully");
        } catch (SQLException e) {
            System.out.println("Error inserting record: " + e.getMessage());
        }
    }
}