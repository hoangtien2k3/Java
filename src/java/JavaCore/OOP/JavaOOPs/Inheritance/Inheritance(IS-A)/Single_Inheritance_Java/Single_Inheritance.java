package src.java.JavaCore.OOP.JavaOOPs.Inheritance.Inheritance_Java.Single_Inheritance_Java;

class SupperClass {
    public String name;
    public int age;

    public SupperClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class SubClass extends SupperClass {
    public double gpa;

    public SubClass(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public void display() {
        super.display();
        System.out.println("GPA: " + this.gpa);
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        SubClass sub = new SubClass("Tien", 19, 6.9);
        sub.display();
    }
}
