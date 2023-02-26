package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class addAll {
    public static void main(String arg[]) {
        //Create a first empty vector
        Vector<String> vec1 = new Vector<>(4);
        //Add elements in the first vector
        vec1.add("E");
        vec1.add("F");
        vec1.add("G");
        vec1.add("H");

        //Create a second empty vector
        Vector<String> vec2 = new Vector<>(4);
        //Add elements in the second vector
        vec2.add("A");
        vec2.add("B");
        vec2.add("C");
        vec2.add("D");

        //Add elements of the vec2 at 1st element position in the vec1
        vec1.addAll(0, vec2);

        //Printing the final vector after appending
        System.out.println("Final vector list: "+vec1);

    }
}
