/*
*   - Multiple inheritance: is not supported through class in java, but it is possible by an interface
*
*
*
* */


package src.java.JavaCore.OOP.JavaOOPs.Abstraction.Interface.Multiple_Inheritance_Interface;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class Multiple_Interface implements Printable, Showable {
    public void print() {
        System.out.println("Hoang Anh Tien");
    }

    public void show() {
        System.out.println("Hoang Anh Chung");
    }

    public static void main(String[] args) {
        Multiple_Interface obj = new Multiple_Interface();
        obj.print();
        obj.show();
    }
}
