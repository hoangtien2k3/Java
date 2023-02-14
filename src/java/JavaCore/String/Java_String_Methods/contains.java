package src.java.JavaCore.String.Java_String_Methods;

/*
 *  syntax:
 *          public boolean contains(CharSequence sequence)
 *
 *          => tìm kiếm chuỗi ký tự trong chuỗi này.
 *          => Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, nếu không trả về false.
 * */

public class contains {
    public static void main(String args[]) {
        String name = "what do you know about me";
        System.out.println(name.contains("do you know")); // true
        System.out.println(name.contains("about")); // true
        System.out.println(name.contains("hello")); // false
    }
}
