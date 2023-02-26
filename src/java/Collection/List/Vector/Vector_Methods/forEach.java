/*
*   syntax:
*           public void forEach(Consumer<? super E> action)
*
*   => Phương thức forEach() của lớp Java Vector được sử dụng để thực hiện hành động đã
*      cho cho từng phần tử của Iterable cho đến khi tất cả các phần tử đã được xử lý hoặc
*      hành động đưa ra một ngoại lệ.
 *
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class forEach {
    public static void main(String arg[]) {
        //Create an empty vector
        Vector < String > colors = new Vector < String > ();
        //Add elements in the vector
        colors.add("White");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");

        //Use forEach() method to print vector elements
        colors.forEach(System.out::println);

    }
}
