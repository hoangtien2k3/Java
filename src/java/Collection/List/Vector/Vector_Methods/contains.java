/*
*   syntax:
*           public boolean contains(Object o)
*
*  => xem vector có chưa phần tử cần xét hay không. Nếu đúng trả về true, nếu sai trả về false.
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class contains {
    public static void main(String arg[]) {
        //Create an empty Vector
        Vector<Integer>  vec = new Vector<Integer>(4);
        vec.add(11);
        vec.add(22);
        vec.add(33);
        vec.add(44);
        vec.add(55);
        //Here we check the existence of number 33 in the vector
        System.out.println("Existence: "+vec.contains(33));
    }
}
