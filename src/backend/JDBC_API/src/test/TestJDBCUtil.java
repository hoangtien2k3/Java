package src.backend.JDBC_API.src.test;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBCUtil {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(""); // thiết lập user
        ds.setPassword(""); // mật khẩu
        ds.setServerName(""); // servername
        ds.setPortNumber(1433); // port tcp/ip

        ds.setDatabaseName(""); // DB name


        try (Connection con = ds.getConnection()) {
            System.out.println("Connection Successfull!!!");
            System.out.println(con.getMetaData());

        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
