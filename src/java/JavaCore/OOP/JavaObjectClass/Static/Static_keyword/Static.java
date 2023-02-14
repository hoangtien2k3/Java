package src.java.JavaCore.OOP.JavaObjectClass.Static.Static_Block.Static_keyword;

class Student {
    int rollno; //instance variable
    String name;
    static String college = "Vua Ly Doan"; //static variable

    //constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
}

public class Static {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Tien");
        //we can change the college of all objects by the single line of code
        //Student_1.college="BBDIT";
        s1.display();
        s2.display();
    }
}
