/*
 - Về cơ bản, việc kết nối một cuộc gọi phương thức đến phần thân phương thức được gọi là Binding.

        Và chúng ta có hai loại Binding:

            + Static Binding
            + Dynamic Binding
*
*
*   * Static Binding:

    - Khi kiểu của đối tượng được xác định tại thời điểm biên dịch (compile),
      nó được gọi là static binding.

    - Nếu có bất kỳ phương thức private, final hoặc static trong một lớp, chúng là static binding.
*
* */


package src.java.JavaCore.OOP.JavaObjectClass.Binding_Java.Static_Binding;

public class Static_Binding {

    private void an(){ // static binding
        System.out.println("Đang ăn...");
    }

    public static void main(String[] args) {
        Static_Binding static_binding = new Static_Binding();
        static_binding.an();
    }

}
