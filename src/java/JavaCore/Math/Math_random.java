/*
*   - được sử dụng để trả về số kiểu kép giả ngẫu nhiên lớn hơn hoặc bằng 0,0 và nhỏ hơn 1,0.
*     Số ngẫu nhiên mặc định luôn được tạo từ 0 đến 1.
*
*
* */

package src.java.JavaCore.Math;

public class Math_random {
    public static void main(String[] args)
    {
        double a = Math.random();
        double b = Math.random();

        // Output is different every time this code is executed
        System.out.println(a);
        System.out.println(b);


        double aa = Math.random() * 20;
        double bb = 5 + (Math.random() * 20);
        // Output is different every time this code is executed
        System.out.println(aa);
        System.out.println(bb);


    }
}
