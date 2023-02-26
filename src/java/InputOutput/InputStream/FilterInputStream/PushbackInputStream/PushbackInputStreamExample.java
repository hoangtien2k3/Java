/*
*   => Lớp PushbackInputStream trong java ghi đè các phương thức của lớp InputStream và cung cấp
*   thêm chức năng mở rộng cho một input stream khác.
*   Nó có thể unread một byte đã được đọc và đẩy trở lại một byte.
*
*   syntax:
*           public class PushbackInputStream extends FilterInputStream
*
* */

package src.java.InputOutput.InputStream.FilterInputStream.PushbackInputStream;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class PushbackInputStreamExample {
    public static void main(String[] args) throws Exception {
        String srg = "1##2#34###12";
        byte[] byteArr = srg.getBytes();
        ByteArrayInputStream array = new ByteArrayInputStream(byteArr);
        PushbackInputStream push = new PushbackInputStream(array);
        int i;
        while ((i = push.read()) != -1) {
            if (i == '#') {
                int j;
                if ((j = push.read()) == '#') {
                    System.out.print("**");
                } else {
                    push.unread(j);
                    System.out.print((char) i);
                }
            } else {
                System.out.print((char) i);
            }
        }
    }
}