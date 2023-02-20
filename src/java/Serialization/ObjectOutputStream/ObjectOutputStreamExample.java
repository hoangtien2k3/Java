/*
    => Lớp ObjectOutputStream trong java được sử dụng để ghi các kiểu dữ liệu nguyên thuỷ
       và Các đối tượng Java vào một OutputStream.

       + Chỉ có các đối tượng implements giao tiếp java.io.Serializable mới có thể được ghi vào stream.


   syntax:
            public class ObjectOutputStream
                extends OutputStream implements ObjectOutput, ObjectStreamConstants

* */

package src.java.Serialization.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample extends Exception{
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Serialization\\ObjectOutputStream\\TestObjectOutputStream.txt"));
            // create student
            Student student = new Student(1, "Hoàng Anh Tiến", "Thanh Hóa", 19);
            // write student
            oos.writeObject(student);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
