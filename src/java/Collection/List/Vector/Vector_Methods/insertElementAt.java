/*
*   syntax:
*           public void insertElementAt(E obj, int index)
 *
*   => Phương thức insertElementAt() của lớp Java Vector được sử dụng để chèn đối tượng đã
*      chỉ định làm thành phần trong vectơ này tại chỉ mục đã chỉ định.
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class insertElementAt {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector < String > vec = new Vector < String > ();
        //Add elements in the vector
        vec.add("Java");
        vec.add("Ruby");
        vec.add("Android");
        vec.add("Python");

        //Print the elements of this vector
        System.out.println("Components of vector: ");
        for (String program : vec) {
            System.out.println(" " +program);
        }

        //Insert the element at 2nd position
        vec.insertElementAt("PHP", 1);
        System.out.println("Components of vector after insertion = ");
        for (String program : vec) {
            System.out.println(" " +program);
        }

    }
}
