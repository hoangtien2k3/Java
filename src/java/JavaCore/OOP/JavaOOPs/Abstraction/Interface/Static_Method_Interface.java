package src.java.JavaCore.OOP.JavaOOPs.Abstraction.Interface;

interface D {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class R implements D {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class Static_Method_Interface {
    public static void main(String args[]) {
        D d = new R();
        d.draw();
        System.out.println(D.cube(3));
    }
}

