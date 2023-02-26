/*
    Phương thức equals() được sử dụng để so sánh hai mảng có bằng nhau hay không.

*/

package src.java.JavaCore.Array.Arrays_Method;

import java.util.Arrays;

public class equals {
    public static void main(String[] args) {
        String[] s1 = { "java", "j2ee", "struts", "hibernate" };
        String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };
        String[] s3 = { "java", "j2ee", "struts", "hibernate" };
        String[] s4 = { "java", "struts", "j2ee", "hibernate" };

        System.out.println(Arrays.equals(s1, s2)); // Output : false
        System.out.println(Arrays.equals(s1, s3)); // Output : true
        System.out.println(Arrays.equals(s1, s4)); // Output : false
    }
}
