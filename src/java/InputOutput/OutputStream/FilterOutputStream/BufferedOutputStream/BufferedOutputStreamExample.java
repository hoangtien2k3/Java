/*
*   => Lớp BufferedOutputStreamExample trong java được sử dụng để đệm một output stream.
*   Trong nội bộ của lớp này sử dụng bộ đệm để lưu trữ dữ liệu.
*   Vì vậy, nó giúp hiệu suất ghi dữ liệu nhanh.
*
*
*
*   - Để thêm bộ đệm vào một đối tượng OutputStream, sử dụng lớp BufferedOutputStreamExample.
*     Cú pháp để thêm bộ đệm vào một OutputStream như sau:
*
*           OutputStream os = null;
            os = new BufferedOutputStream(new FileOutputStream("D:\\IO Package\\testout.txt"));
*
*   Khai báo của lớp BufferedOutputStream:
*   syntax:

*           public class BufferedOutputStream extends FilterOutputStream
*
*
*
* */

package src.java.InputOutput.OutputStream.FilterOutputStream.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;

        try {
            fout = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\FilterOutputStream\\BufferedOutputStream\\testout111.txt");
            bout = new BufferedOutputStream(fout);
            String s = "Welcome to java.";
            byte b[] = s.getBytes(); // getBytes() chuyển String về mảng Byte[]
            bout.write(b); // write để ghi
            bout.flush();
        } catch (IOException ex) {

            ex.printStackTrace();

        } finally {
            bout.close();
            fout.close();
        }

        System.out.println("success!");
    }
}
