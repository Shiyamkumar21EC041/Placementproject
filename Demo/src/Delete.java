import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Demo4";
        String user = "root";
        String password = "R21ec041..";

        String query = "DELETE FROM provisions WHERE card_number = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "1234567890123456");
            pstmt.executeUpdate();
            System.out.println("Record deleted successfully");
        } catch (SQLException e) {
            System.out.println("Error deleting record: " + e.getMessage());
        }
    }
}