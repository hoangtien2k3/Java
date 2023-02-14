package src.java.JavaCore.String.Java_String_Methods;

/*
 * Syntax:
 *       public char charAt(int index)
 *
 *       => lấy ra ký tu tại chỉ số i nào đó.
 * */

public class charAt {
    public static void main(String args[]) {
        String name = "hello java";
        char ch = name.charAt(4);
        System.out.println(ch);
    }

}

