/*
*   => Lớp FileInputStream trong java đọc được các byte từ một input file.
*   Nó được sử dụng để đọc dữ liệu theo định dạng byte (các byte stream)
*   như dữ liệu hình ảnh, âm thanh, video vv.
*
*   syntax:
*           public class FileInputStream extends OutputStream
*
* */

package src.java.InputOutput.InputStream.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String args[]) throws IOException {

        // Attaching the file to FileInputStream
        FileInputStream fin = new FileInputStream("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\InputStream\\FileInputStream\\testout.txt");

        // Illustrating getChannel() method
        // Nó được sử dụng để trả về các đối tượng FileChannel duy nhất liên kết với file input stream.
        System.out.println(fin.getChannel());

        // Illustrating getFD() method
        System.out.println(fin.getFD());

        // Illustrating available method
        // Nó được sử dụng để trả về số byte ước tính có thể đọc được từ file input stream.
        System.out.println("Number of remaining bytes: " + fin.available());

        // Illustrating skip() method
        // Nó được sử dụng để bỏ qua và loại bỏ x byte dữ liệu từ file input stream.
        fin.skip(4);

        // Display message for better readability
        System.out.println("FileContents: ");

        // Reading characters from FileInputStream
        // and write them
        int ch;

        // Holds true till there is data inside file
        while ((ch = fin.read()) != -1)
            System.out.print((char)ch);

        // Close the file connections
        // using close() method
        fin.close(); // Nó được sử dụng đẻ đóng stream.
    }
}
