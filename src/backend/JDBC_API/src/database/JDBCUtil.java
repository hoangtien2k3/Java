package src.backend.JDBC_API.src.database;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class JDBCUtil {

    // Mở kết nối Java và MySQL
    public static Connection getConnection() {
        Connection con = null;
        try {
            // đăng ký MySQL
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            // các thông số:
            String url = "jdbc:mySQL://localhost:3306/hoangtien2k3";
            String username = "root";
            String password = "12042003";
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    // Đóng kết nối Java và MySQL
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    public static void printInfo(Connection con) {
        try {
            if (con != null) {
                System.out.println(con.getMetaData().toString());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
