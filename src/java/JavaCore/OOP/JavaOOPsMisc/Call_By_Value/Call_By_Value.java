/*
*   * Call by Value and Call by Reference in Java:
*     => Chỉ có cuộc gọi theo giá trị trong java, không gọi theo tham chiếu.
*       Nếu chúng ta gọi một phương thức truyền một giá trị, nó được gọi là gọi theo giá trị.
*       Những thay đổi được thực hiện trong phương thức được gọi, không bị ảnh hưởng trong phương thức gọi.
*
*
*
* */

// Example of call by value in java

package src.java.JavaCore.OOP.JavaOOPsMisc.Call_By_Value;

public class Call_By_Value {

    // Call by Value
    int data = 50;
    void change(int data) {
        data = data + 100;  // chỉ có thể thay đổi được giá trị của biến cục bộ.
                            // Không thể thay đổi giá trị của biến toàn cục.
    }

    void ChangerValue(Call_By_Value op) {
        op.data = op.data + 100; // sẽ thay đổi được giá trị.
    }

    public static void main(String[] args) {
        Call_By_Value op = new Call_By_Value();

        System.out.println("Trước Khi thay đổi: " + op.data); // data = 50
        op.change(500); // chỉ có thể thay đổi gias trị biến cục bộ trong hàm. Khoog thể thay đổi giá trị của biến toàn cục.
        System.out.println("Sau khi thay đổi: " + op.data); // data vẫn là 50.

        System.out.println();

        System.out.println("TRƯỚC KHI THAY ĐỔI: " + op.data);
        op.ChangerValue(op);
        System.out.println("SAU KHI THAY ĐỔI: " + op.data);
    }

}
