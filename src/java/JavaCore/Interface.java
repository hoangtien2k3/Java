/*
    src.java.JavaCore.Interface trong java:

    + src.java.JavaCore.Interface là một tập hợp các phương thức chỉ có khai báo mà không có thực thi.
    Một lớp có thể implement (thực hiện) một hoặc nhiều interface để tạo một tương tác giữa các lớp.

 */

package src.java.JavaCore;
interface Shape_1 {
    double getArea();
    double getPerimeter();
}

class Circle_1 implements Shape_1 {
    private double radius_1;

    public Circle_1(double radius) {
        this.radius_1 = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius_1 * radius_1;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius_1;
    }
}

class Rectangle_1 implements Shape_1 {
    private double width;
    private double height;

    public Rectangle_1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Interface {
    public static void main(String[] args) {
        Shape_1 circle = new Circle_1(5);
        Shape_1 rectangle = new Rectangle_1(3, 4);
        System.out.println("src.java.JavaCore.Circle area: " + circle.getArea());
        System.out.println("src.java.JavaCore.Circle perimeter: " + circle.getPerimeter());
        System.out.println("src.java.JavaCore.Rectangle area: " + rectangle.getArea());
        System.out.println("src.java.JavaCore.Rectangle perimeter: " + rectangle.getPerimeter());
    }
}