/*
*   - Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.


*   - Sử dụng ghi đè phương thức trong java
        + Ghi đè phương thức được sử dụng để cung cấp cài đặt đặc biệt của một phương thức
          mà đã được định nghĩa ở lớp cha.
        + Ghi đè phương thức được sử dụng cho đa hình runtime.

*   - Các nguyên tắc ghi đè phương thức trong java
        + Phương thức phải có tên giống với lớp cha.
        + Phương thức phải có tham số giống với lớp cha.
        + Lớp con và lớp cha có mối quan hệ kế thừa.


*   Lưu ý:
       - Không thể ghi đè được phương thức Static.
        (vì phương thức static bị ràng buộc bởi class, còn phương thức instance thì bị ràng buộc bởi đối tượng)
        (vì static thì thuộc về vùng nhớ của class, còn instance thì thuộc về vùng nhớ heap)

       - không thể ghi đè được phương thức main.
         (vì main là phương thức static)
*/

package src.java.JavaCore.OOP.JavaOOPsMisc.Overloading_and_Overriding.Overriding.Method_Overriding;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Overriding extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Overriding obj = new Overriding();
        ((Vehicle)obj).run();

        Vehicle o = new Overriding();
        o.run();

    }
}
