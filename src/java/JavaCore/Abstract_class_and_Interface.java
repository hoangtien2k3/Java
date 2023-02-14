/*
    Abstract class và interface là hai từ khóa trong Java, cả hai đều có mục đích tái sử dụng mã và tách mã.


    Tuy nhiên, có một số sự khác nhau giữa hai kiểu này:


        1. Triển khai phương thức:

            + Trong abstract class, bạn có thể triển khai các phương thức cụ thể và tạo ra các biến trong lớp abstract.

            + trong interface, bạn không thể triển khai các phương thức cụ thể và không thể tạo ra các biến.


        2. Kế thừa:

            + Chỉ có thể kế thừa từ một lớp abstract hoặc từ một lớp cụ thể.

            + Trong Java, một lớp có thể kế thừa từ một hoặc nhiều interface.


        3. Tính trừu tượng:

            + Abstract class cung cấp mức độ trừu tượng cao hơn so với interface.
               - Abstract class có thể chứa cả phương thức trừu tượng và phương thức không trừu tượng.

               *Syntax phương thức trừu tượng:

                      public abstract returntype methodname(parameter list);


            + Interface, bạn chỉ có thể định nghĩa các phương thức chung và không thể sử dụng tính đa hình.
               - Interface chỉ chứa phương thức trừu tượng.
              Tất cả các phương thức trong một interface đều phải là phương thức trừu tượng,
              vì vậy không có phương thức không trừu tượng trong một interface.


        4. Độ rộng của trừu tượng:

            + Abstract class cung cấp mức độ trừu tượng cao hơn so với interface.
            Bạn có thể sử dụng abstract class để tạo ra các phương thức và biến cụ thể và sử dụng tính đa hình.

            + Chỉ có thể sử dụng interface để định nghĩa các phương thức chung và không thể sử dụng tính



    Phương thức trừu tượng trong interface và abstract class có một số sự khác biệt như sau:

        + Tạo ra: Phương thức trừu tượng trong interface được tạo ra để định nghĩa một tập hợp các phương thức
        mà một lớp cần phải thực hiện. Trong khi đó, phương thức trừu tượng trong abstract class được tạo ra
        để định nghĩa một tập hợp các phương thức mà một lớp con cần phải thực hiện hoặc ghi đè.

        + Sử dụng: Trong interface, một lớp có thể implement nhiều interface và phải thực hiện tất cả các phương
        thức trừu tượng được định nghĩa trong các interface đó. Trong abstract class, một lớp con có thể kế
        thừa từ chỉ một abstract class và ghi đè tất cả các phương thức trừu tượng được định nghĩa trong
        abstract class đó.

        + Ghi đè: Trong interface, tất cả các phương thức trừu tượng phải được ghi đè bởi lớp implement nó.
        Trong abstract class, có thể có hoặc không có phương thức trừu tượng được ghi đè bởi lớp con kế thừa.
        Nếu không có ph



*/

package src.java.JavaCore;

interface Shape {
    void draw();
}

abstract class AbstractCircle implements Shape {
    public int x, y, radius;
    public AbstractCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public abstract void resize(int factor); // đây là phương thức từu tượng.

    public int getRadius() {
        return this.radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with center at (" + x + "," + y + ") and radius " + radius);
    }
}

class Circle extends AbstractCircle {
    public Circle(int x, int y, int radius) {
        super(x, y, radius);
    }
    public void resize(int factor) {
        radius *= factor;
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Circle(0, 0, 5);
        s.draw();
    }
}