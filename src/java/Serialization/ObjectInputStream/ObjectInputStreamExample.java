/*
    => Lớp ObjectInputStream trong java được sử dụng để đọc các đối tượng và dữ liệu nguyên thủy
       mà được ghi bằng việc sử dụng lớp ObjectOutputStream.

    syntax:
               public class ObjectInputStream
                    extends InputStream implements ObjectInput, ObjectStreamConstants

* */

package src.java.Serialization.ObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Serialization\\ObjectInputStream\\TextObjectInputStream.txt"));
            // read student
            Student_1 student = (Student_1) ois.readObject();
            // show student
            System.out.println(student.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
