/*
*   Từ khóa final trong Java được sử dụng để hạn chế người dùng. Từ khóa final có thể được sử dụng trong
    nhiều ngữ cảnh:

        + Biến final: bạn không thể thay đổi giá trị của biến final (nó sẽ là hằng số).
        + Phương thức final: bạn không thể ghi đè phương thức final.
        + Lớp final: bạn không thể kế thừa lớp final.
        + Biến static final trống: Một biến final mà không được khởi tạo tại thời điểm khai báo được gọi là
        biến final trống.

*
* */


package src.java.ExceptionHandling.Final;

class Bike {
    final void run() {
        System.out.println("running");
    }
}

final class Bikesss {
}
//
//class Make extends Bikesss{ // không thể kế thừa thừ class final
//}

public class Final extends Bike{
    final int MAX_SPEED = 90; // biến final
//    void run() { // không thể ghi đè
//        MAX_SPEED = 400; // không thể thay đổi giá trị biến final int
//    }

    public static void main(String args[]) {
        Final obj = new Final();
        obj.run();
    }
}

