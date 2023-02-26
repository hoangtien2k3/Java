/*
 *   syntax:
 *           public boolean equals(Object anotherObject)
 *
 *           =>  so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi.
 *           => Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
 *
 * */

package src.java.JavaCore.String.Java_String_Methods;

public class equals {
    public static void main(String args[]) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "Java";
        String s4 = "avaj";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equals(s4)); // false
    }
}
