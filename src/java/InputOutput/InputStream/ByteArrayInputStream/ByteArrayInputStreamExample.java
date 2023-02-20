/*
*   => ByteArrayInputStream bao gồm hai từ: ByteArray và InputStream.
*   Tên của nó cho thấy, nó có thể được sử dụng để đọc mảng byte như là input stream.
*
*   Lớp ByteArrayInputStream trong java chứa một bộ đệm bên trong được sử dụng để đọc mảng byte dưới dạng luồng.
*
*   syntax:
*           public class ByteArrayInputStream extends InputStream
*
* */


package src.java.InputOutput.InputStream.ByteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bis = null;

        try {
            byte[] buf = { 35, 36, 37, 38 };
            // Create the new byte array input stream
            bis = new ByteArrayInputStream(buf);
            int k = 0;
            while ((k = bis.read()) != -1) {
                // Conversion of a byte into character
                char ch = (char) k;
                System.out.println("ASCII value of Character is: " + k + "; "
                        + "Special character is: " + ch);
            }
        } finally {
            bis.close();
        }
    }
}
