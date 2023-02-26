/*
*   => Lớp DataInputStream trong java cho phép một ứng dụng đọc dữ liệu nguyên thủy từ luồng đầu vào
    một cách độc lập với máy.

    => Ứng dụng Java thường sử dụng DataOutputStream để ghi dữ liệu mà sau này có thể được đọc bởi một
    DataInputStream.
*
*
*   syntax:
*           public class DataInputStream extends FilterInputStream implements DataInput
* */


package src.java.InputOutput.InputStream.FilterInputStream.DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream input = null;
        DataInputStream dis = null;
        try {
            input = new FileInputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\InputStream\\FilterInputStream\\DataInputStream\\TESTOUT.txt");
            dis = new DataInputStream(input);
            int count = input.available(); // lấy ra ước tính số lượng bytes
            byte[] arr = new byte[count];
            dis.read(arr); // nó sẽ đọc dữ liệu từ file và truyền vào mảng byte[]
            for (byte bt : arr) {
                char k = (char) bt;
                System.out.print(k + "-");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            dis.close();
        }
    }
}
