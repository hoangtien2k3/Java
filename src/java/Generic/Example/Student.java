package src.java.Generic.Example;

public class Student extends Person {
    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void say() {
        System.out.println("I'm a Student");
    }
}