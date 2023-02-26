/*
*   - Instance Initializer Block được sử dụng để khởi tạo thành viên dữ liệu instance.
*     Nó chạy mỗi khi đối tượng của lớp được tạo
*
*
*   - Dưới đây là một số qui tắc chính cho Instance Initializer Block:
        + Instance Initializer Block được tạo khi instance của lớp được tạo.

        + Instance Initializer Block được triệu hồi sau khi constructor của lớp cha được triệu hồi(trước)
        (ví dụ: sau lời gọi super() constructor).

        + Instance Initializer Block thể hiện theo thứ tự mà chúng xuất hiện.

*
* */


package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Instance_initializer_block;



public class Instance_initializer_block {

    int speed;

    Instance_initializer_block() {
        System.out.println("2. constructor duoc trieu hoi"); // được gọi sau Instance initializer block
    }
    {
        System.out.println("1. instance initializer block duoc trieu hoi");
        // Instance initializer block được gọi sau constructor của lớp cha.
    }

    public static void main(String[] args) {
        Instance_initializer_block a1 = new Instance_initializer_block();
    }

}
