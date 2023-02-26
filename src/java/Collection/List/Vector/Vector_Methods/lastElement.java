package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class lastElement {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector<String> vec = new Vector<>(4);
        //Add elements in the vector
        vec.add("Java");
        vec.add("JavaScript");
        vec.add("Android");
        vec.add("Python");
        //Obtain the last element of this vector
        System.out.println("The last element of a vector is: " +vec.lastElement());
    }
}
