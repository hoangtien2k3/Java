/*
*   - If a class have an entity reference, it is known as Aggregation.
*   - Aggregation represents HAS-A relationship.
*
*
*   syntax:
*       class Employee{
            int id;
            src.java.JavaCore.Java_String.String name;
            Address address; //Address is a class
                ...
        }
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Inheritance.Aggregation_Java.Aggregation;

class Operation{
    int square(int n){
        return n * n;
    }
}

class Circle {
    Operation op; // aggregation
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius); //code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Circle c = new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
}


