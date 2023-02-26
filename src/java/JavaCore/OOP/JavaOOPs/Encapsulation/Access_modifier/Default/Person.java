package src.java.JavaCore.OOP.JavaOOPs.Encapsulation.Access_modifier.Default;

public class Person {
    double gpa;
    String name;

    Person(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    void print() {
        System.out.println("Nam: " + this.name + ", GPA: " + this.gpa);
    }
}
