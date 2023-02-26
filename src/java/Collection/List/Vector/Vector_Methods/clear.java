/*
*   => Phương thức clear() của lớp Java Vector được sử dụng để xóa tất cả các phần tử
*      khỏi vectơ đang được sử dụng
*
*   syntax:
*       Public void clear()
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class clear {
    public static void main(String arg[]) {
        //Create an empty Vector with initial capacity of 5
        Vector<Integer> vecObject = new Vector<Integer>(5);
        //Add values in the vector
        vecObject.add(3);
        vecObject.add(5);
        vecObject.add(2);
        vecObject.add(4);
        vecObject.add(1);
        System.out.println("Elements of Vector is: "+vecObject);
        //Clear vector
        vecObject.clear();
        System.out.println("Elements of Vector after clear(): "+vecObject);
    }
}
