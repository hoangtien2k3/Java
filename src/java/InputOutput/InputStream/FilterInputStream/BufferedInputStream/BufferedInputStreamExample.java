/*
*   => Lớp BufferedInputStreamExample trong java được sử dụng để đọc thông tin từ stream (buffered stream).
*   Trong nội bộ của lớp này sử dụng cơ chế đệm để làm cho hiệu suất đọc nhanh hơn.
*
*   Những điểm quan trọng về BufferedInputStreamExample là:

        + Khi các byte từ stream được bỏ qua hoặc đọc, bộ đệm nội bộ sẽ tự động nạp
          lại từ input steam chứa, nhiều byte tại một thời điểm.
        + Khi một BufferedInputStreamExample được tạo ra, một mảng đệm nội bộ sẽ được tạo ra.

    syntax:
                public class BufferedInputStreamExample extends FilterInputStream

* */

package src.java.InputOutput.InputStream.FilterInputStream.BufferedInputStream;

import java.io.*;
public class BufferedInputStreamExample{
    public static void main(String args[]) throws IOException{
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        try{
            fin = new FileInputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\InputStream\\FilterInputStream\\BufferedInputStream\\testout11.txt");
            bin = new BufferedInputStream(fin);

            byte[] data = new byte[1024];
            int length = bin.read(data);
            String result = new String(data, 0, length);
            System.out.println(result);

        }catch(Exception e){
            System.out.println(e);
        } finally {
            bin.close();
            fin.close();
        }
    }
}
