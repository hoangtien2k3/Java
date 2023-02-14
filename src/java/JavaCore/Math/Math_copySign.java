
// Math.copySign() : được sử dụng để trả về đối số đầu tiên có dấu của đối số thứ hai.

package src.java.JavaCore.Math;

public class Math_copySign {
    public static void main(String[] args) {
        double x = 740.4;
        double y = -29.1;

        System.out.println(Math.copySign(x, y)); // -740.4
    }
}
