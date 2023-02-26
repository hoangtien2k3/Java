/*
*   syntax:
*           public void copyInto(Object[] anArray)
 *
 * =>   phương thức copyInto() của lớp Java Vector được sử dụng để sao chép các phần tử của
 *      vectơ đang được sử dụng vào Array đã chỉ định.
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class copyInto {
    public static void main(String arg[]) {
        //Create an empty Vector1
        Vector<Integer> vec = new Vector<>(5);
        //Add elements in the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);

        Integer[] arr = new Integer[5];
        //copy elements of vector into an array
        vec.copyInto(arr);
        System.out.println("Elements in an array are: ");
        for(Integer num : arr) {
            System.out.println(num);
        }
    }
}
