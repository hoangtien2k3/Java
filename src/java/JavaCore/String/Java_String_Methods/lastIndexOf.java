package src.java.JavaCore.String.Java_String_Methods;

/*
* syntax:
*       int lastIndexOf(int ch)
        int lastIndexOf(int ch, int fromIndex)
        int lastIndexOf(src.java.JavaCore.Java_String.String substring)
        int lastIndexOf(src.java.JavaCore.Java_String.String substring, int fromIndex)
*
*       => trả vể chỉ số cuối của ký tự hoặc chuỗi con.
*       => Nếu không tìm thấy trả về -1. Giá trị index được tính từ 0.
*
* */

public class lastIndexOf {
    public static void main(String args[]) {
        String s1 = "this is index of example";
        int index1 = s1.lastIndexOf('s');
        int index2 = s1.lastIndexOf("ex");
        System.out.println(index1);//6
        System.out.println(index2);//17
    }
}
