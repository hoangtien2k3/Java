package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*       public src.java.JavaCore.Java_String.String trim()
 *
 *      + valueOf() : được sử dụng để chuyển đối kiểu dữ liệu khác thành chuỗi.
 *
 *      ( có thể chuyển int thành chuỗi, long thành chuỗi, boolean thành chuỗi, float thành chuỗi,
 *      double thành chuỗi, char thành chuỗi, mảng char thành chuỗi, đối tượng thành chuỗi )
* */

public class valueOf {
    public static void main(String args[]) {
        int value = 30;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10);

        if (value == Integer.parseInt(s1)) {
            System.out.println("Good job");
        } else {
            System.out.println("Not answer");
        }
    }
}
