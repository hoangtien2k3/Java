/*
*   Lớp BufferedReader trong java được sử dụng để đọc văn bản từ một input stream dựa trên các
*   ký tự (character stream).
*
*   Nó có thể được sử dụng để đọc dữ liệu theo dòng (line by line) bằng phương thức readLine().
*   Nó giúp hiệu suất nhanh.
*   Nó kế thừa lớp Reader.
*
*   syntax:
                public class BufferedReader extends Reader
*
* */

package src.java.InputOutput.Reader.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\Reader\\BufferedReader\\TTT.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
