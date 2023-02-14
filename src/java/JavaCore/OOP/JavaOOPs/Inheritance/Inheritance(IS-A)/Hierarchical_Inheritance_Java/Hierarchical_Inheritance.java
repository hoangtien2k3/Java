package src.java.JavaCore.OOP.JavaOOPs.Inheritance.Inheritance_Java.Single_Inheritance_Java.Hierarchical_Inheritance_Java;

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

class SubClass2 extends SupperClass {
    public int year_birth;

    public SubClass2(String name, int age, int year_birth) {
        super(name, age);
        this.year_birth = year_birth;
    }

    public void display() {
        super.display();
        System.out.println("Year_Birth: " + this.year_birth);
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        SubClass1 sub1 = new SubClass1("Tien", 19, 6.8);
        SubClass2 sub2 = new SubClass2("Chung", 24, 1998);

        sub1.display();
        System.out.println();
        sub2.display();

    }
}
