
// Math.pow() : It returns the value of first argument raised to the power to second argument.
// syntax:
//      public static double pow(double a, double b)

package src.java.JavaCore.Math;

public class Math_pow {
    static int a = 10;
    static double b = -7;

    static int a1 = 2, b1 = 3;

    public static void main(String[] args) {
        System.out.println(Math.pow(a, 2));

        System.out.println(Math.pow(b, 0.7)); // NaN

        System.out.println(Math.pow(a1, b1));
    }
}
