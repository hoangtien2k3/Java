/*
*   => Lớp FileWriter trong java được sử dụng để ghi các dữ liệu theo định dạng ký tự vào một file.
*           + FileWriter ghi file dưới dạng luồng ký tự
*
*   + Không giống như lớp FileOutputStream, khi ghi dữ liệu bạn không cần phải chuyển đổi
*   chuỗi thành mảng byte vì nó cung cấp phương thức để viết chuỗi trực tiếp.
*
* syntax:
*           public class FileWriter extends OutputStreamWriter
*
* */

package src.java.InputOutput.Writer.FilerWriter;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\Writer\\FilerWriter\\FileText.txt");
            fw.write("Dữ liệu đã được ghi vào file text.txt rồi");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("đã ghi thành công, mở file text để xem ...");
    }
}
