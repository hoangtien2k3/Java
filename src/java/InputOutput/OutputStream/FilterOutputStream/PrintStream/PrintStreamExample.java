/*
*   Lớp PrintStream trong java cung cấp các phương thức để ghi dữ liệu vào một stream khác.
*   Lớp PrintStream tự động làm sạch dữ liệu vì vậy không cần gọi phương thức flush().
*   Hơn nữa, các phương thức của nó không ném ngoại lệ IOException.
*
*   syntax:
*               public class PrintStream extends FilterOutputStream implements Closeable. Appendable
*
* */

package src.java.InputOutput.OutputStream.FilterOutputStream.PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\FilterOutputStream\\PrintStream\\testPrintStream.txt ");
        PrintStream pout = new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success...");
    }
}