package src.main.java.JavaCore.Java_String.Java_String_Methods;

/*
 * syntax:
 *       public src.main.java.JavaCore.Java_String.String concat(src.main.java.JavaCore.Java_String.String anotherString)
 *
 *       => nối thêm chuỗi được chỉ định vào cuối chuỗi đã cho.
 * */

public class concat {
    public static void main(String args[]) {
        String s1 = "java string";
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
    }
}
