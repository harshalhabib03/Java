import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/conmysql";
    private static final String USER = "root"; // Change as needed
    private static final String PASSWORD = "root"; // Change as needed

    public static void main(String[] args) {    
        // Sample data
        String name = "John Doe";
        String email = "john.doe@example.com";      

        // Insert data into the database
        insertUser(name, email);
    }

    private static void insertUser(String name, String email) {
        // Establishing connection
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Prepare the SQL query
            String sql = "INSERT INTO data (name, email) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setString(2, email);

                // Execute the insert
                int rowsAffected = statement.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
