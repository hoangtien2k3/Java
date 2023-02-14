/*
*   Có ba cách để so sánh chuỗi trong java:

        + Sử dụng phương thức equals() : được sử dụng để so sánh nội dung của 2 chuỗi.

        + Sử dụng toán tử ==  : được sử dụng để so sánh tham chiếu (không phải giá trị) của 2 chuỗi.

        + Sử dụng phương thức compareTo()  : so sánh các giá trị theo thứ tự từ điển và trả về một
          giá trị số nguyên mô tả nếu chuỗi đầu tiên nhỏ hơn, bằng hoặc lớn hơn chuỗi thứ hai.
*
*
* */

package src.java.JavaCore.String.Java_String.Comparison;

public class comparison {
    public static void main(String[] args) {

        // so sánh theo Phương thức equals() :
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "Hallo";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false


        System.out.println();

        // so sánh theo Phương thức ==
        String s11 = "Hello";
        String s22 = "Hello";
        String s33 = new String("Hello");
        String s44 = s22;
        System.out.println(s11 == s22);//true (vì cả 2 cùng tham chiếu instance giống nhau)
        System.out.println(s11 == s33);//false(vì s3 tham chiếu instance mà không ở trong Pool)
        System.out.println(s11 == s44); // true ( vì nó cùng tham chiếu tới 1 instance )


        System.out.println();

        // so sanh theo Phương thức compareTo()
        String s111 = "Hello";
        String s222 = "Hello";
        String s333 = "Java";
        System.out.println(s111.compareTo(s222));
        System.out.println(s111.compareTo(s333));
        System.out.println(s333.compareTo(s111));


    }


}
