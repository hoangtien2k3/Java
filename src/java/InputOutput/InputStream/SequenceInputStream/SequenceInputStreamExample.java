/*
*   => Lớp SequenceInputStream trong java được sử dụng để đọc dữ liệu từ nhiều stream.
*   Nó đọc dữ liệu tuần tự (từng cái một).
*
*   syntax:
*           public class SequenceInputStream extends InputStream
*
* */


package src.java.InputOutput.InputStream.SequenceInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String args[]) throws Exception {
        FileInputStream input1 = null;
        FileInputStream input2 = null;
        FileOutputStream output = null;
        SequenceInputStream inst = null;

        try {
            input1 = new FileInputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\InputStream\\SequenceInputStream\\Testin.txt");
            input2 = new FileInputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\InputStream\\SequenceInputStream\\Testout.txt");
            output = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\InputStream\\SequenceInputStream\\Testoutput.txt");

            inst = new SequenceInputStream(input1, input2);
            int j;
            while ((j = inst.read()) != -1) {
                System.out.print((char) j);
                output.write(j);
            }

        } catch (IOException ex) {
            System.out.println("Can't reader");
            ex.getStackTrace();
        } finally {
            inst.close();
            input1.close();
            input2.close();
        }
    }
}