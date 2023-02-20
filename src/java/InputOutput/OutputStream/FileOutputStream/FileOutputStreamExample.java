/*
*   Java FileOutputStreamExample là một output stream được sử dụng để ghi dữ liệu vào một file
*   theo định dạng byte (byte stream).
*           + FileOutputStream ghi file theo luồng byte.
*
*   syntax:
*           public class FileOutputStreamExample extends OutputStream
*
 * */

package src.java.InputOutput.OutputStream.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        int i;

        // create a fileoutputstream object
        FileOutputStream fout = new FileOutputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\FileOutputStream\\testout1.txt");

        // we need to transfer this string to files
        String st = "TIEN HOANG ANH";

        char ch[] = st.toCharArray();
        for (i = 0; i < st.length(); i++) {

            // we will write the string by writing each
            // character one by one to file
            fout.write(ch[i]);
        }

        for(int x : ch) {
            System.out.println(x);
        }

        // by doing fout.close() all the changes which have
        // been made till now in RAM had been now saved to
        // hard disk
        fout.close();
    }

}
