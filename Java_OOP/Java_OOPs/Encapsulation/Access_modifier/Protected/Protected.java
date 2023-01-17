/*
    Protected:  - Phạm vi truy xuất bên trong Package và bên ngoài Package nhưng phải có tính kế thừa.
                       + truy xuất được bên trong class.
                       + truy xuất được bên trong class kế thừa.
                       + truy xuất được bên trong class có cùng chung 1 package với class khai báo.

 * */

package Java_OOP.Java_OOPs.Encapsulation.Access_modifier.Protected;

import Java_OOP.Java_OOPs.Encapsulation.Access_modifier.Protected.TestPackage.Student;

public class Protected extends Student {
    protected Protected(String name, double gpa, double height) {
        // phương thức khởi tạo Protected sẽ gọi phương thức Person.
        super(name, gpa, height);
    }
    public static void main(String[] args) {
        Protected aProtected = new Protected("Hoàng Anh Tiến", 3.6, 170);
        aProtected.print();
    }
}
