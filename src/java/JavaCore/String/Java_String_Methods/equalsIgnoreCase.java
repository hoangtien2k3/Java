package src.java.JavaCore.String.Java_String_Methods;

/*
*   syntax:
*           public boolean equals(Object anotherObject)
*
*           => so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.
*           => Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
 *
* */

public class equalsIgnoreCase {
    public static void main(String args[]) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "python";
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // false
    }
}
