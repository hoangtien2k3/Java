/*
 *   - Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con, thì đó là Upcasting.
 *       ( hay ép kiểu dữ liệu của lớp con về kiểu dữ liệu của lớp cha )
 * */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Up_casting;

class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("meowing...");
    }

    public void eat() {
        System.out.println("hoang anh tien");
    }
}


public class up_casting {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal animal1 = cat; // ép kiểu một cách không tường minh(nhưng trong java vẫn hiểu)
        Animal animal2 = (Animal) cat;

        animal1.eat();

    }
}
