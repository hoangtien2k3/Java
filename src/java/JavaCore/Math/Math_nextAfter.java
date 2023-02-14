/*
*    - trả về số dấu phẩy động liền kề với đối số đầu tiên theo hướng của đối số thứ hai.
*
*
*   syntax:
            public static double nextAfter(double a, double b)
            public static float nextAfter(float a, double b)
*
*
* */

package src.java.JavaCore.Math;

public class Math_nextAfter {
    public static void main(String[] args) {
        double a = 84352.24;
        double b = 154.284;

        // print the next number for a towards b
        System.out.println(Math.nextAfter(a, b));

        // print the next number for b towards a
        System.out.println(Math.nextAfter(b, a));
    }
}
