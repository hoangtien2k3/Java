/*
*   => Lớp ByteArrayOutputStream trong java được sử dụng để ghi dữ liệu chung vào nhiều file.
*   Trong luồng này, dữ liệu được ghi vào mảng byte có thể được ghi vào nhiều stream sau đó.
*
*   + ByteArrayOutputStream giữ một bản sao của dữ liệu và chuyển tiếp nó đến nhiều stream.
    + Bộ đệm của ByteArrayOutputStream tự động tăng theo kích thước dữ liệu.


*   syntax:
*           public class ByteArrayOutputStream extends OutputStream

* */


package src.java.InputOutput.OutputStream.ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = null;
        FileOutputStream fout2 = null;
        ByteArrayOutputStream bout = null;

        try {
            fout1 = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\ByteArrayOutputStream\\f1.txt");
            fout2 = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\ByteArrayOutputStream\\f2.txt");
            bout = new ByteArrayOutputStream();

            String data = "Hoàng Anh Tiến";
            bout.write(data.getBytes());
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.flush();

            System.out.println("Đã ghi dữ liệu vào 2 file (f1 và f2).");
        } catch (IOException ex) {
            ex.printStackTrace();

        } finally {
            fout1.close();
            fout2.close();
            bout.close();
        }

    }
}