/*
*   String.format : trả về chuỗi đã được format, để có thể tái sử dụng lần sau
*   System.out.printf() : nó chỉ in ra màn hình console
*
* */

package src.java.JavaCore.String.Java_String_Methods.String_Format_Java;

public class String_Format {

    public static void main(String[] args) {
        String header = String.format("%-12s%-12s%s","Column 1","Column 2","Column3");
        String row = String.format("%-12d%-12d%07d", 15, 12, 5);
        System.out.println(header);
        System.out.println(row);
    }

}
