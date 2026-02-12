package Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "system";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            System.out.println("MySQL DB connection successful!");

            // Create table
            stmt.execute("""
                CREATE TABLE IF NOT EXISTS employee (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(100) NOT NULL,
                    age INT
                )
            """);

            // Insert data
            stmt.executeUpdate(
                "INSERT INTO employee (name, age) VALUES ('Vikash', 21)"
            );

            // Fetch data
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Age: " + rs.getInt("age")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
