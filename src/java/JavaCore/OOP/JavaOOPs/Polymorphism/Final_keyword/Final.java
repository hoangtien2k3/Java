/*
*
*   - Từ khóa final trong Java được sử dụng để hạn chế người dùng.
*
*   - Từ khóa final có thể được sử dụng trong nhiều ngữ cảnh:

        + Biến final:   bạn không thể thay đổi giá trị của biến final (nó sẽ là hằng số).

        + Phương thức final:    bạn không thể ghi đè phương thức final.

        + Lớp final:    bạn không thể kế thừa lớp final.

        + Biến static final trống:      Một biến final mà không được khởi tạo tại thời điểm khai báo
                                        được gọi là biến final trống.
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Final_keyword;

class Bike {
    final void run() {
        System.out.println("running");
    }
}

public class Final extends Bike {

    final int x = 50;
//    x = 100;              // không thể thay đổi giá trị của biến final

//    void run() {          // không thể ghi đè đươc phương thức final
//        System.out.println("running");
//    }

    public static void main(String[] args) {

        Final fal = new Final();
        fal.run();

        new Final().run();

    }

}
