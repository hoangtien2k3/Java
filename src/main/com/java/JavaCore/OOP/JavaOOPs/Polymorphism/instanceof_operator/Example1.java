package src.main.com.java.JavaCore.OOP.JavaOOPs.Polymorphism.instanceof_operator;

class Animal {}

public class Example1 extends Animal {  // Example1 inheritance Animal
    public static void main(String args[]) {
        Example1 dog = new Example1();
        System.out.println(dog instanceof Animal);  // true
        // => dog là 1 thể hiện của kiểu dữ liệu Aninal

        Animal a1 = new Example1();
        System.out.println(a1 instanceof Example1);

    }
}
