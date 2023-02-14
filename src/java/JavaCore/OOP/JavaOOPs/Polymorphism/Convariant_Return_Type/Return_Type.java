/*
*   - Convatiant: là một kiểu trả về có thể thay đổi theo cùng hướng với lớp con (subclass).
*
*   - Kiểu trả về covariant đề cập đến kiểu trả về của phương thức ghi đè.
*     Nó cho phép thu hẹp loại trả về của một phương thức được ghi đè mà không cần
*     phải truyền loại hoặc kiểm tra loại trả về.

    - Hãy nhớ là, kiểu trả về covariant chỉ hoạt động cho các kiểu trả về
      không nguyên thủy (non-primitive)
* */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Convariant_Return_Type;

class A {
    A get() {
        return this;
    }
}

public class Return_Type {

    Return_Type get() {
        return this;
    }
    void message() {
        System.out.println("Nói chào Covariant nào.");
    }
    public static void main(String args[]) {
        new Return_Type().get().message(); // cách 1

        Return_Type return_type = new Return_Type();
        return_type.get().message(); // cách 2

        return_type.message();
    }
}
