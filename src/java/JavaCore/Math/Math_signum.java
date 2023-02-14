/*
*   - Math.signum() được sử dụng để tìm dấu của một giá trị nhất định.
*       ( kiểm tra số âm, số dương)
*       + số dương thì trả về 1
*       + số âm thì trả về -1
*       + sô 0 thì trả về 0
*       + NaN thì trả về NaN
*
*   syntax:
*       + public static double signum(double x)
        + public static float signum(float x)
*
* */

package src.java.JavaCore.Math;

public class Math_signum {
    public static void main(String[] args) {
        double a = 82.7;
        float b = -74.3f;
        float c = 0f;
        double d = 0.0/0;

        System.out.println(Math.signum(a));
        System.out.println(Math.signum(b));
        System.out.println(Math.signum(c));
        System.out.println(Math.signum(d));
    }
}
