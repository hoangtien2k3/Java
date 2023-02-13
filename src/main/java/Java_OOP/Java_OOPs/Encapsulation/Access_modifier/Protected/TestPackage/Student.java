package src.main.java.Java_OOP.Java_OOPs.Encapsulation.Access_modifier.Protected.TestPackage;

public class Student {
    protected double gpa;
    protected String name;
    protected double height;

    protected Student(String name, double gpa, double height) {
        this.name = name;
        this.gpa = gpa;
        this.height = height;
    }
    protected void print() {
        System.out.println("Name: " + name + ", GPA: " + gpa + ", Height: " + height );
    }
}
