package src.backend.JDBC_API.src.dao;

import src.backend.Advance.JDBC.JDBC;
import src.backend.JDBC_API.src.database.JDBCUtil;
import src.backend.JDBC_API.src.model.Sach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO implements DAOInterface<Sach> {
    public static SachDAO getInstance() {
        return new SachDAO();
    }

    @Override
    public int insert(Sach sach) {
        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement
            Statement st = con.createStatement();
            // thực thi câu lệnh sql
            String query = "INSERT INTO sach (id, tenSach, giaBan, namXuatBan)" +
                    "VALUES ('"+sach.getId()+"', '"+sach.getTenSach()+"', '"+sach.getGiaBan()+"', "+sach.getNamXuatBan()+")";

//            int ketQua = con.createStatement().executeUpdate(query);
            int ketQua = st.executeUpdate(query);
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!!!");
            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Sach sach) {
        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement
            Statement st = con.createStatement();
            // thực thi câu lệnh sql

            String query = "UPDATE sach SET tenSach = '"+sach.getTenSach()+"', giaBan = '"+sach.getGiaBan()+"', namXuatBan = "+sach.getNamXuatBan()+" WHERE id = '"+sach.getId()+"'";

//            int ketQua = con.createStatement().executeUpdate(query);
            int ketQua = st.executeUpdate(query);
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!!!");
            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Sach sach) {
        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement
            Statement st = con.createStatement();
            // thực thi câu lệnh sql

            String query = "DELETE FROM sach WHERE id = '"+sach.getId()+"'";

//            int ketQua = con.createStatement().executeUpdate(query);
            int ketQua = st.executeUpdate(query);
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!!!");
            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        ArrayList<Sach> ketQua = new ArrayList<>();

        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement
            Statement st = con.createStatement();

            // thực thi câu lệnh sql
            String query = "SELECT * FROM sach";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);

            // add sach vao ArrayList
            while(rs.next()) {
                String id = rs.getString("id");
                String tenSach = rs.getString("tenSach");
                String giaBan = rs.getString("giaBan");
                int namXuatBan = rs.getInt("namXuatBan");

                Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
                ketQua.add(sach);
            }


            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public Sach selectById(Sach sach) {
        Sach ketQua = null;

        try {
            // tạo kết nối đến MySql
            Connection con  = JDBCUtil.getConnection();
            // Tạo đối tượng statement
            Statement st = con.createStatement();

            // thực thi câu lệnh sql
            String query = "SELECT * FROM sach WHERE id = '"+sach.getId()+"'";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);

            // add sach vao ArrayList
            while(rs.next()) {
                String id = rs.getString("id");
                String tenSach = rs.getString("tenSach");
                String giaBan = rs.getString("giaBan");
                int namXuatBan = rs.getInt("namXuatBan");

                ketQua = new Sach(id, tenSach, giaBan, namXuatBan);
            }

            JDBCUtil.closeConnection(con); // đóng kết nối
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        return null;
    }
}
