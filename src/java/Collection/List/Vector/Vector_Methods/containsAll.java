/*
 *   syntax:
 *           public boolean containsAll(Collection<?> c)
 *
 *   => xem coi vector 1 có chưa các phần tử của vector 2 hay không.
 *       Nếu đúng thì trả về true, sai thì trả về false.
 *
 * */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class containsAll {
    public static void main(String arg[]) {
        //Create an empty Vector1
        Vector<Integer> vector1 = new Vector<Integer>();
        //Add element in vwctor1
        vector1.add(11);
        vector1.add(22);
        vector1.add(33);
        vector1.add(44);

        //Create an empty Vector2
        Vector<Integer>  vector2 = new Vector<Integer>();
        //Add element in vector2
        vector2.add(22);
        vector2.add(33);

        //Check the existence of vector2 in the vector1
        System.out.println("Existence: " + vector1.containsAll(vector2));

        //Lets add a new element to vector2
        vector2.add(101);
        //Checking again
        System.out.println("Existence: " + vector1.containsAll(vector2));
    }
}
