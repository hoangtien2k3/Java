package src.java.JavaCore.String.Java_String_Methods;

/*
 * syntax:
 *       public boolean endsWith(src.java.JavaCore.Java_String.String suffix)
 *
 *       =>  kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định.
 *       => Nó trả về true nếu chuỗi này kết thúc với hậu tố đã cho, nếu khác thì trả về false.
 *
 * */

public class endsWith {
    public static void main(String args[]) {
        String s1 = "hello java";
        System.out.println(s1.endsWith("t")); // false
        System.out.println(s1.endsWith("java")); // true
    }
}
