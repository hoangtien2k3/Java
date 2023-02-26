/*
*   syntax:
*           Public Iterator<E> iterator()
*
*   => Phương thức iterator() của lớp Java Vector được sử dụng để lấy một trình vòng lặp qua
*      các phần tử trong danh sách này theo trình tự thích hợp.
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;
import java.util.Iterator;

public class iterator {
    public static void main(String arg[]) {
        //Create an empty Vector
        Vector < String > colors = new Vector < String > ();
        //Add color elements in the vector
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");
        //Obtain an Iterator
        Iterator<String> itr = colors.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
