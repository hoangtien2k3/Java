/*
*       1. this can be used to refer current class instance variable.
        2. this can be used to invoke current class method (implicitly)
        3. this() can be used to invoke current class constructor.
        4. this can be passed as an argument in the method call.
        5. this can be passed as argument in the constructor call.
        6. this can be used to return the current class instance from the method.
*
* */


package src.java.JavaCore.OOP.JavaObjectClass.This_keyword;

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + fee);
    }
}

public class This {
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}

