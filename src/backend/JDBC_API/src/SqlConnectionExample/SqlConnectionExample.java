package src.backend.JDBC_API.src.SqlConnectionExample;

import java.sql.*;

public class SqlConnectionExample {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver for SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Create a connection to the SQL Server database
            String url = "jdbc:sqlserver://localhost:1433;databaseName=HoangTien2k3";
            String user = "myusername";
            String password = "mypassword";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a statement to execute a SQL query
            Statement stmt = conn.createStatement();

            // Execute a SQL query and get the results in a ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM GIAOVIEN");

            // Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close the ResultSet, Statement, and Connection objects
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
