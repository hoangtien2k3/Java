/*
*   *   => Biến static final trống trong Java:
 *       + Một biến static final mà không được khởi tạo tại thời điểm khai báo thì đó là biến static final trống.
 *       Nó chỉ có thể được khởi tạo trong khối static.

* */

package src.java.ExceptionHandling.Final;

public class static_final {
    static final int data; // Biến static final trống
    static {
        data = 50;
    }

    public static void main(String args[]) {
        System.out.println(static_final.data);
    }
}
