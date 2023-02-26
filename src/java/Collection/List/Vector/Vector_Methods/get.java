/*
*   syntax:
*           public E get(int index)
*
*   => Phương thức get() của lớp Java Vector được sử dụng để lấy phần tử tại vị trí đã chỉ
*      định trong vectơ.
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class get {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector < String > colors = new Vector < String > ();

        //Add elements in the vector
        colors.add("White");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");

        //Get the element at specified index
        System.out.println("Element at 0th position = " + colors.get(0));
        System.out.println("Element at 2nd position = " + colors.get(2));

    }
}
