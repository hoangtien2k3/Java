/*
    Types of Variables in Java:
        + local variable
        + instance variable
        + static variable
*

    1. Local Variable: biến cục bộ
       + Được khai báo bên trong thân của phương thức. Và ta chỉ sử dụng biến này trong phương thức đó.


    2. Instance Variable:
        + Một biến được khai báo bên trong lớp nhưng bên ngoài phần thân của phương thức,
          được gọi là Instance Variable.
        + Nó không được khai báo như là Static.


    3. Static Variable:
        + Biến được khai báo từ khóa Static gọi là Static Variable ( Biến Static ). Nó không phải là biến Local.
        + Có thể tạo 1 bản sao duy nhất của Static Variable và chia sẻ nó với tất cả các Instance trong class.


*
* */

package src.java.JavaCore.Tutorial;


public class Java_Variables {

    static int m = 100;     // static variable

    void method() {
        int n = 90;         // local variable
    }

    public static void main(String args[]) {
        int data = 50;        // instance variable
    }
}
