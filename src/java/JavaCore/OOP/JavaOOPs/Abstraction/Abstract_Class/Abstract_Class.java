/*
    # Tính Trừu Tượng Trong Java:
*       + Tính trừu tượng là một tiến trình ẩn các cài đặt chi tiết và chỉ hiển thị tính năng tới người dùng.
*       + Tính trừu tượng giúp bạn trọng tâm hơn vào đối tượng thay vì quan tâm đến cách nó thực hiện.
*

*   - Có 2 cách để đạt được sự trừu tượng hóa trong java
        + Sử dụng lớp abstract ( 0 -> 100% )
        + Sử dụng interface ( 100% )


    - Class abstract đại diện cho mối quan hệ "IS - A"


*   Abstract Class trong Java:
*       - Một lớp được khai báo với từ khóa abstract là lớp abstract trong Java.
*         Lớp abstract có nghĩa là lớp trừu tượng, nó có thể có các phương thức
*         abstract hoặc non-abtract.
*

    - QUY TẮC TRONG ABSTACT CLASS JAVA:
         + Một lớp trừu tượng phải được khai báo bằng một từ khóa "abstract".
         + Nó có thể có các phương thức trừu tượng và không trừu tượng.
         + Nó không thể được khởi tạo.
         + Nó có thể có các hàm tạo và cả các phương thức tĩnh.
         + Nó có thể có các phương thức "final", buộc lớp con không thay đổi phần thân của phương thức.
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Abstraction.Abstract_Class;

abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run(); // abstract

    void changeGear() {
        System.out.println("gear changed");
    } // non-abstract
}

class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

public class Abstract_Class {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
