package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*       public src.java.JavaCore.Java_String.String toLowerCase()
        public src.java.JavaCore.Java_String.String toLowerCase(Locale locale)
*
*       => toUpperCase() được sử dụng để chuyển chuỗi về dạng chữ hoa.
* */

public class toUpperCase {
    public static void main(String args[]) {
        String s1 = "HELLO stRIng";
        String s1Upper = s1.toUpperCase();
        System.out.println(s1Upper);
    }
}
