/*
*   => BufferedWriter trong java được sử dụng để cung cấp bộ đệm cho các các thể hiện của lớp Writer.
*
*   Nó giúp hiệu suất nhanh. Nó thừa kế lớp Writer. Các ký tự đệm được sử dụng để cung cấp
*   việc ghi dữ liệu hiệu quả với các mảng đơn, các ký tự và chuỗi.
*
*   syntax:
*               public class BufferedWriter extends Writer
*
* */

package src.java.InputOutput.Writer.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\Writer\\BufferedWriter\\tttest.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success...");
    }

}