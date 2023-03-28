package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.instanceof_operator;

class Animal {
}

class Dog extends Animal {
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(animal instanceof Animal);   // true
        System.out.println(dog instanceof Animal);      // true
        System.out.println(animal instanceof Dog);      // false
        System.out.println(dog instanceof Dog);         // true
    }
}



