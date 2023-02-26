package src.java.InputOutput.OutputStream.FilterOutputStream.BufferedOutputStream;

import java.io.File;
import java.io.FileInputStream;

public class test {
    public static void main(String[] args) {
        File f = new File("D:\\Code Java\\Java\\src.java.JavaCore\\Java_Input_Output\\OutputStream\\BufferedInputStream\\testout111.txt");

        FileInputStream in = null;
        int c;

        try {
            in = new FileInputStream(f);

            while((c = in.read()) != -1) {
                System.out.print((char)c);
            }

        } catch(Exception ex) {
            System.out.println("Can't read file");
        }


    }




}
