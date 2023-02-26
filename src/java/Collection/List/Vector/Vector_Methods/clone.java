/*
*   => Phương thức clone() của lớp Java Vector được sử dụng để lấy một bản sao của vectơ đang được sử dụng.
*
*   syntax:
*           Public object clone()
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class clone {
    public static void main(String arg[]) {
        //Create an empty Vector vec with an initial capacity of 4
        Vector<Integer> vc = new Vector<Integer>(4);
        Vector<Integer> vecclone = new Vector<Integer>(4);
        //Add elements in the vector
        vc.add(4);
        vc.add(3);
        vc.add(2);
        vc.add(1);
        //Print all the elements available in vector
        System.out.println("Elements in vector are: ");
        for (Integer num : vc) {
            System.out.println("Number= " + num);
        }

        //clone the vector vec
        vecclone = (Vector) vc.clone();
        //Print all the elements available in vecclone
        System.out.println("Elements in vecclone vector are: ");
        for (Integer num : vecclone) {
            System.out.println("Number = " + num);
        }
    }
}
