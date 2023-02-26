/*
*   instanceof trong java với biến có giá trị null
*
*       Nếu bạn sử dụng toán tử instanceof với biến có kiểu bất kỳ có giá trị null
*       thì giá trị trả về luôn là null.
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.instanceof_operator;

public class Example2 {
    public static void main(String args[]) {
        Example2 d = null;
        System.out.println(d instanceof Example2);  // false
    }
}
