package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*       public boolean startsWith(src.java.JavaCore.Java_String.String prefix)
        public boolean startsWith(src.java.JavaCore.Java_String.String prefix, int offset)
*
*       => sử dụng để kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không,
*       => nếu đúng trả về true, sai trả về false.
* */

public class startsWith {
    public static void main(String args[]) {
        String s1 = "java string startsWith() method sample";
        System.out.println(s1.startsWith("ja")); // true
        System.out.println(s1.startsWith("java string")); // true
    }
}
