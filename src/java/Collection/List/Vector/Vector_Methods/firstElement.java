/*
*   syntax:
*               public E firstElement()
 *
*   => Phương thức firstElement() của lớp Java Vector được sử dụng để lấy phần tử đầu tiên
*       (tại chỉ số 0) của vectơ đang được sử dụng.
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class firstElement {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector < String > colors = new Vector < String > ();
        //Add elements in the vector
        colors.add("White");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        //Get the element at specified index
        System.out.println("First color of this vector = " + colors.firstElement());
    }
}
