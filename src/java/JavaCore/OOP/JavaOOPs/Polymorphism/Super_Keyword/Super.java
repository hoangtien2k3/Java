/*
*   - Từ khóa super trong java là một biến tham chiếu được sử dụng để tham chiếu trực tiếp
*     đến đối tượng của lớp cha gần nhất.
*
*
*   - Trong java, từ khóa super có 3 cách sử dụng như sau:

        + Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
        + super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
        + Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Super_Keyword;

class Vehicle {
    int speed = 50;
    Vehicle(int speed) {
        this.speed = speed;
        System.out.println("Vehicle is created");
    }
}

public class Super extends Vehicle {
    int speed = 100;

    public Super(int speed) {
        super(speed);   //gọi phương thức constructor của lớp cha (có hay không có thì nó sẫn gọi constructor của lớp cha trước)
        System.out.println("Bike is created");
    }
    void display() {
        System.out.println(super.speed);
    }

    public static void main(String[] args) {
        Super s = new Super(100);
        s.display(); // super nó sẽ gọi tới speed của lớp cha.
    }

}
