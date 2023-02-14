package src.java.JavaCore.OOP.JavaOOPs.Abstraction.Interface;

interface Drawable {
    void draw();

    default void hello() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class Default_Method_Interface {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        d.hello();
    }
}
