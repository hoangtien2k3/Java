/*
*   Abstract and Interface:
*       Sự khác biệt giữa Abstract Class và Interface trong JAVA
*
*
*   - Khi sử dụng Interface thì chúng ta phải "implements"
*   - Khi sử dụng Abstract Class thì chúng ta phải "extends"
*
*
*   * Interface: (HAS-A)
*       - Interface chỉ có phương thức abstract (từ Java 8 thì có thêm "default" và "static")
*       - Interface chỉ có các biến static và final.
*       - Interface thì không thể implement class abstract.
        - Interface có thể kế thừa được nhiều Interface khác. ( Multiple và Hybrid )
 *      - Các thành viên trong Interface kiếu mặc định là "public"
 *
 *
*       - không phải là Class
*       - chỉ chứa những method/properties trông mà khong có thực thi.
*       - Nó giống như một khuôn mẫu, để các lớp Implements và Follow.
*       - Các lớp có thể Implements nhiều Interface.
*
*
*   * Abstract Class (IS-A)
*       - Abstract class có những phương thức abstract và non-abstract.
*       - Class abstract có thể có các biến final, non-final, static và non-static.
*       - Class abstract có thể implement các Interface.
*       - Class abstract có thể kế thừa được một class khác.
*       - abstract thì lại có thể là private, protected...
*

*
* */

package src.java.JavaCore.OOP.JavaOOPs.Abstraction.Abstract_and_Interface;

interface A {
    void a();

    abstract void b();

    public void c();

    public abstract void d();
}

// tạo abstract class cung cấp cài đặt cho một phương thức của interface A
abstract class B implements A {
    public void c() {
        System.out.println("I am C");
    }
}

// tạo subclass của abstract class B, cung cấp cài đặt cho các phương thức còn lại
class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

public class abstract_and_interface {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
