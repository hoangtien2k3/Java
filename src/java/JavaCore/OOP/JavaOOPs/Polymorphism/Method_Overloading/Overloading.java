/*
    Overloading Java:
    - If a class has multiple methods having same name but different in parameters,
      it is known as Method Overloading

*   syntax:
*       - There are two ways to overload the method in java
               + By changing number of arguments
               + By changing the data type
*
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Method_Overloading;

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }
}

public class Overloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6));

        Adder adder = new Adder();
        adder.sum(20,20); //now int arg sum() method gets invoked
    }

}
