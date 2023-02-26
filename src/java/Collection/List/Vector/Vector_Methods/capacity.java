/*
*   syntax:
*       Public int capacity()
*
*   => Phương thức capacity() của lớp Java Vector được sử dụng để lấy dung lượng hiện
*      tại của vectơ đang được sử dụng.
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class capacity {
    public static void main(String[] args) {
        //Create an empty Vector with an initial capacity of 3
        Vector<String> vc = new Vector<>(3);
        //Add elements in the vector
        vc.add("A");
        vc.add("B");
        vc.add("C");
        //Print all the elements of a Vector
        System.out.println("Elements of Vector are: "+vc);
        System.out.println("Current capacity of Vector: "+vc.capacity());

        //Add new element
        vc.add("JavaTpoint");
        //After addition, print all the elements again
        System.out.println("Elements after addition: "+vc);
        System.out.println("Current capacity of Vector after modification: "+vc.capacity());
    }
}
