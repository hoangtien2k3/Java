package src.java.JavaCore.OOP.JavaOOPs.Inheritance.Inheritance_Java.Single_Inheritance_Java.Multilevel_Inheritance_Java;

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

class SubClass1 extends SupperClass {
    public double gpa;

    public SubClass1(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public void display() {
        super.display();
        System.out.println("GPA: " + this.gpa);
    }

}

class SubClass2 extends SubClass1{
    public int year_birth;

    public SubClass2(String name, int age, double gpa, int year_birth) {
        super(name, age, gpa);
        this.year_birth = year_birth;
    }

    public void display() {
        super.display();
        System.out.println("Year_Birth: " + this.year_birth);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        SubClass2 sub2 = new SubClass2("HOANG ANH TIEN", 19, 6.8, 2003);
        sub2.display();
    }
}
