/*
*   => Lớp ObjectInputStream trong java được sử dụng để đọc các đối tượng và dữ liệu nguyên thủy
*   mà được ghi bằng việc sử dụng lớp ObjectOutputStream.
*
*   syntax:
            public class ObjectInputStream
                extends InputStream implements ObjectInput, ObjectStreamConstants
* */


package src.test.com.java.main.InputOutput.InputStream.ObjectInputStream;

import src.main.com.java.main.InputOutput.InputStream.ObjectInputStream.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\Code Java\\Java\\src.main.com.java.JavaCore\\Java_Input_Output\\InputStream\\ObjectInputStream\\TEXTOUT.txt"));
            // read student
            src.main.com.java.main.InputOutput.InputStream.ObjectInputStream.Student student = (Student) ois.readObject();
            /* show student */
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