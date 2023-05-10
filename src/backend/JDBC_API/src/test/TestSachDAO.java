package src.backend.JDBC_API.src.test;

import src.backend.JDBC_API.src.dao.SachDAO;
import src.backend.JDBC_API.src.model.Sach;

import java.util.ArrayList;

public class TestSachDAO {
    public static void main(String[] args) {

            // test insert giá trị
            for(int i = 0; i < 100; i++) {
                Sach sach = new Sach("LT" + i, "Lập Trình " + i, "20000", 2023);
                SachDAO.getInstance().insert(sach);
            }


        /*
            // test update giá trị
            Sach sach2 = new Sach("LTC", "Lập Trình C", "100000", 2023);
            SachDAO.getInstance().update(sach2);

        */


        /*
            // Test delete
            for(int i = 0; i < 90; i++) {
                Sach sach = new Sach("LT" + i, "Lập Trình " + i, "20000", 2023);
                SachDAO.getInstance().delete(sach);
            }
        */


        /*
            // lấy tất cả dữ liệu ra từ DB
            ArrayList<Sach> list = SachDAO.getInstance().selectAll();
            for(Sach sach : list) {
                System.out.println(sach.toString());
            }
        */


        ArrayList<Sach> list = SachDAO.getInstance().selectAll();
        for(Sach sach : list) {
            System.out.println(sach.toString());
        }

        System.out.println("________________________________________");
        // lấy ra dữ liệu từ id quyển sách
        Sach find = new Sach();
        find.setId("LTC");
        Sach sach2 = SachDAO.getInstance().selectById(find);
        System.out.println(sach2);



    }
}
