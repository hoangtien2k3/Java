/*
*   syntax:
*           public boolean equals(Object o)
 *
*   => Phương thức equals() của lớp Java Vector được sử dụng để so sánh đối tượng đã chỉ định
*       với Vector này về sự bằng nhau.
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class equals {
    public static void main(String arg[]) {
        Vector<Integer> vec1 = new Vector<>();
        vec1.add(1);
        vec1.add(2);
        vec1.add(3);
        Vector<Integer> vec2 = new Vector<>();
        vec2.add(1);
        vec2.add(2);
        vec2.add(3);
        System.out.println("Is vector1 equals vector2 ? " + vec1.equals(vec2));
        //Appending all elements
        vec1.addAll(vec2);
        //Printing the vector List
        System.out.println("Vector list: " + vec1);
    }
}
