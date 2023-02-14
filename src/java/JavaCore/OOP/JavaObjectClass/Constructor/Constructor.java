package src.java.JavaCore.OOP.JavaObjectClass.Constructor;

class Constructor_Java {
    public String name;
    public double gpa;

    // Constructor in Java
    public Constructor_Java(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("GPA: " + this.gpa);
    }

}


public class Constructor {
    public static void main(String[] args) {
        Constructor_Java cst = new Constructor_Java("Hoang Anh Tien", 6.9);

        cst.display();

    }
}
