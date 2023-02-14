/*
*   Ví dụ về Static Binding trong Java
        Khi kiểu của đối tượng được xác định tại thời điểm biên dịch (bởi trình biên dịch),
        nó được gọi là static binding.

        Nếu có bất kỳ phương thức private, final hoặc static trong một lớp, chúng là static binding.
*
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Binding.Static_Binding;

public class static_binding {
    private void eat(){
        System.out.println("Đang ăn...");
    }

    public static void main(String args[]){
        static_binding cauVang = new static_binding();
        cauVang.eat();
    }
}
