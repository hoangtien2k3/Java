package src.java.JavaCore.String.Java_String_Methods;

/*
*  syntax:
*           public static src.java.JavaCore.Java_String.String join(CharSequence delimiter, CharSequence... elements)
            public static src.java.JavaCore.Java_String.String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
*
*           => Phương thức join() trả về một chuỗi được nối với nhau bởi dấu phân tách.
*           => Trong phương thức join chuỗi, dấu phân cách được sử dụng cho mỗi chuỗi được nối.
* */

public class join {
    public static void main(String args[]) {
        String joinString1 = String.join("-", "welcome", "to", "java");
        System.out.println(joinString1);
    }
}
