package src.java.Generic.Example;

public class Teacher extends Person {
    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void say() {
        System.out.println("I'm a Teacher");
    }
}