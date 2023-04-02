package src.backend.JDBC_API.src.database;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection con = null;

        try {
            DriverManager.registerDriver(new SQLServerDriver());

            // các thông số:
            String url = "jdbc:sqlserver://localhost:1433;databaseName=HoangTien2k3;user=myusername;password=mypassword";
            String username = "root";
            String password = "";

            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }




        return con;
    }

    public static void closeConnection(Connection con) {

    }

}
