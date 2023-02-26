/*
*   syntax:
*           Public void ensureCapacity(int minCapacity)
 *
* => Phương thức ensureCapacity() của lớp Java Vector được sử dụng để tăng dung lượng
*   của vectơ đang được sử dụng, nếu cần.
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class ensureCapacity {
    public static void main(String arg[]) {
        //Create an empty vector of capacity 10
        Vector<String> vecobject = new Vector<>();
        //Add element in the vector
        vecobject.add("50");
        vecobject.add("green");
        vecobject.add("red");
        System.out.println("Element: " + vecobject);
        System.out.println("Capacity of the vector is: " +vecobject.capacity());

        //Increases the capacity of this vector
        vecobject.ensureCapacity(20);
        System.out.println("New Capacity of the vector is:" +vecobject.capacity());

    }
}
