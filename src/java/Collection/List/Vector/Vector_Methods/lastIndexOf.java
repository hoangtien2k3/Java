/*
*   syntax:
*           public int lastIndexOf(Object obj)
            public int lastIndexOf(Object obj, int index)
*
*   => Phương thức lớp lastIndexOf() Java Vector được sử dụng để lấy chỉ mục của lần xuất hiện
*      cuối cùng của phần tử đã chỉ định trong vectơ.
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class lastIndexOf {
    public static void main(String arg[]) {
        //Create an empty Vector
        Vector < Integer > in = new Vector < > ();
        //Add elements in the vector
        in.add(100);
        in.add(200);
        in.add(300);
        in.add(100);
        in.add(400);
        //Obtain an index of last occurrence of the specified element
        System.out.println("Index of element is: " +in.lastIndexOf(100));
        System.out.println("Index of element is: " + in.lastIndexOf(500));
    }
}
