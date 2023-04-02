package src.backend.JDBC_API.src.test;

import src.backend.JDBC_API.src.database.JDBCUtil;

import java.sql.Connection;

public class TestJDBCUtil {
    public static void main(String[] args) {
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection);
    }
}
