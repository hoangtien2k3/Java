package src.java.JavaCore.String.Java_String_Methods;

/*
*  syntax:
*       public src.java.JavaCore.Java_String.String trim()
 *
 *      => Phương thức trim() được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi.
* */

public class trim {
    public static void main(String args[]) {
        String s1 = "  hello string   ";
        System.out.println(s1 + "java");
        System.out.println(s1.trim() + " java");
    }
}
