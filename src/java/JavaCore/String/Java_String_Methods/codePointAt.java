/*
*   Phương thức codePointAt() trong java lấy ra Số thập phân của ký tự đó trong bảng mã ASCII
*       syntax:
*               String s = "Hello";
                int result = s.codePointAt(index);
* */

package src.java.JavaCore.String.Java_String_Methods;

public class codePointAt {
    public static void main(String[] args) {
        String myStr = "Hello";
        int result = myStr.codePointAt(0);
        System.out.println(result);
    }
}
