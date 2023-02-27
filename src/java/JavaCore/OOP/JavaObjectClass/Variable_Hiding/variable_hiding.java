/*
*   - Variable Hiding

    + Variable Hiding xảy ra khi lớp con khai báo thuộc tinh có tén giống tén thuộc tính ở lớp cha.
    + Lúc này thộc tính của lớp cha sẽ không bị lớp con ghi đè, mà là bị lớp con ẩn đi.

*
*
* */

package src.java.JavaCore.OOP.JavaObjectClass.Variable_Hiding;

class SuperClass {
    int x = 10;

    public void display() {
        System.out.println("x = " + x);
    }
}

class SubClass extends SuperClass {
    int x = 20; // biến int x giống với biến của lớp cha. (gọi là Variable Hiding )

    @Override
    public void display() {
        System.out.println("x = " + x);
    }

    public void print_Display_SuperClass() {
        super.display();
    }
}

public class variable_hiding {
    public static void main(String[] args) {

        SubClass sub = new SubClass();
        System.out.println(((SuperClass)sub).x); // up-casting

        SuperClass a = new SubClass();
//        System.out.println(a.x); // vẫn truy xuất đến thuộc tính lớp cha
        System.out.println(((SubClass)a).x); // down-casting

        ((SubClass)a).display(); // ghi đè thì nó sẽ truy cập tới phương thức của lớp con

        ((SubClass)a).print_Display_SuperClass(); // dùng phương thức và supper để truy cập tới Display của lớp cha

    }
}
