/*
*   - Về cơ bản, việc kết nối một cuộc gọi phương thức đến phần thân phương thức được gọi là Binding.

        Và chúng ta có hai loại Binding:

            + Static Binding
            + Dynamic Binding


    - Khi kiểu của đối tượng được xác định tại thời điểm chạy, nó được gọi là Dynamic Binding


* */


package src.java.JavaCore.OOP.JavaObjectClass.Binding_Java.Dynamic_Binding;

class DongVat {
    void an() {
        System.out.println("Đang ăn...");
    }
}

public class Dynamic_Binding extends DongVat {

    void an() {
        System.out.println("Đang gặm xương...");
    }

    public static void main(String[] args) {
        Dynamic_Binding dynamic_binding = new Dynamic_Binding();
        dynamic_binding.an();
    }

}
