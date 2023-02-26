/*
*   syntax:
*               public Enumeration<E> elements()
 *
*   => Phương thức phần tử () của lớp Java Vector được sử dụng để liệt kê các phần tử
*      của vectơ đang được sử dụng.
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;
import java.util.Enumeration;

public class elements {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector<Integer> vecObject = new Vector<Integer>();
        //Add element in the vector
        vecObject.add(11);
        vecObject.add(22);
        vecObject.add(33);

        //Get the element in the enumeration
        Enumeration<Integer> enumobject = vecObject.elements();
        System.out.println("Data in enumeration object is: ");
        while (enumobject.hasMoreElements()) {
            System.out.println("Element: " + enumobject.nextElement());
        }
    }
}
