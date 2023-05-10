package src.backend.JDBC_API.src.dao;

import src.backend.JDBC_API.src.database.JDBCUtil;
import src.backend.JDBC_API.src.model.Sach;
import src.backend.JDBC_API.src.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO implements DAOInterface<User> {
    public static UserDAO getInstance() {
        return new UserDAO();
    }

    @Override
    public int insert(User user) {
        int ketQua = 0;
        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement
            Statement st = con.createStatement();

            // thực thi câu lệnh sql
            String query = "INSERT INTO user (username, password, hovaten)" +
                    "VALUES ('"+user.getUsername()+"', '"+user.getPassword()+"', '"+user.getHovaten()+"'";

            ketQua = st.executeUpdate(query); // thưc hiện câu lệnh SQL
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!!!");
            JDBCUtil.closeConnection(con); // đóng kết nối với MySql

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(User user) {
        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();

            // thực thi câu lệnh sql
            String query = "UPDATE user SET password = ?, hovaten = ? WHERE username = ?";

            // Tạo đối tượng statement
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getPassword());
            pst.setString(2, user.getHovaten());
            pst.setString(3, user.getUsername());

            int ketQua = pst.executeUpdate();
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!!!");

            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }


    @Override
    public int delete(User user) {
        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement

            // thực thi câu lệnh sql
            String query = "DELETE FROM user WHERE username = ?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getUsername());


            int ketQua = pst.executeUpdate();
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!!!");

            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<User> selectAll() {
        ArrayList<User> ketQua = new ArrayList<>();

        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();

            // thực thi câu lệnh sql
            String query = "SELECT * FROM user";

            // Tạo đối tượng statement
            PreparedStatement st = con.prepareStatement(query);

            System.out.println(query);
            ResultSet rs = st.executeQuery();

            // add sach vao ArrayList
            while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hovaten = rs.getString("hovaten");

                User user1 = new User(username, password, hovaten);
                ketQua.add(user1);
            }

            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public User selectById(User user) {
        User ketQua = null;

        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();

            // thực thi câu lệnh sql
            String query = "SELECT * FROM user WHERE username = ?";

            // Tạo đối tượng statement
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, user.getUsername());

            System.out.println(query);
            ResultSet rs = st.executeQuery();

            // add sach vao ArrayList
            while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String hovaten = rs.getString("hovaten");

                ketQua = new User(username, password, hovaten);
            }

            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        return null;
    }
}
