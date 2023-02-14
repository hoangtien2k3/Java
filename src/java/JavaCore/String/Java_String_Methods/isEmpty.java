package src.java.JavaCore.String.Java_String_Methods;

/*
* syntax:
*       public boolean isEmpty()
*
*       => Phương thức isEmpty() khi chuỗi trống trả về true, ngược lại trả về false.
* */

public class isEmpty {
    public static void main(String args[]) {
        String s1 = "";
        String s2 = "hello java";

        System.out.println(s1.isEmpty()); // true
        System.out.println(s2.isEmpty()); // false
    }
}
