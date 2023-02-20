/*
*   Lớp DataOutputStream trong java cho phép một ứng dụng ghi các kiểu dữ liệu Java nguyên thủy
    đến output stream một cách độc lập với máy.

    Ứng dụng Java thường sử dụng DataOutputStream để ghi dữ liệu mà sau này có thể được đọc bởi
    một DataInputStream.


*   syntax:
*               public class DataOutputStream extends FilterOutputStream implements DataOutput

* */


package src.java.InputOutput.OutputStream.FilterOutputStream.DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = null;
        DataOutputStream data = null;

        try {
            file = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\FilterOutputStream\\DataOutputStream\\TESTOUT111.txt");
            data = new DataOutputStream(file);
            data.writeInt(65);
            data.flush();
            System.out.println("Succcess...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            data.close();
        }
    }
}
