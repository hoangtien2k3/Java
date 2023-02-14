/*
    Phương thức deeprequals() được sử dụng để so sánh hai mảng hai chiều có bằng nhau
    hay không thay vì phương thức equals().

    Bởi vì, deepEquals() thực hiện so sánh tất cả các phần tử của mảng con của cả hai mảng.

* */

package src.java.JavaCore.Array.Arrays_Method;

import java.util.Arrays;

public class deepEquals {
    public static void main(String[] args) {
        String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
        String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

        System.out.println(Arrays.equals(s1, s2)); // Output : false
        System.out.println(Arrays.deepEquals(s1, s2)); // Output : true
    }
}
