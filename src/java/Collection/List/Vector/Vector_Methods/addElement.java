// Public void addElement(E e)

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class addElement {
    public static void main(String[] args) {
        //Create an empty Vector with an initial capacity of 3
        Vector<Integer> vc = new Vector<>(3);
        //Add elements in the vector by using add() method
        vc.add(101);
        vc.add(-201);
        vc.add(301);
        //Print all the elements of a Vector
        System.out.println("Elements of Vector are: " + vc);
        //Add new element
        vc.addElement(-5001);
        //After addition, print all the elements again
        System.out.println("Elements of vector after addition: "+vc);
    }
}
