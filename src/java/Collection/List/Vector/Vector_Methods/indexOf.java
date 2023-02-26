/*
*   syntax:
*           public int indexOf(Object obj)
            public int indexOf(Object obj, int index)
*
*   => Phương thức lớp Java Vector indexOf() được sử dụng để lấy chỉ mục của lần xuất hiện
*      đầu tiên của phần tử được chỉ định trong vectơ.
*
*       Nếu đúng trả về vị trí phần tử đó trong vector.
*       Nếu sau trả về -1
*
* */

package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class indexOf {
    public static void main(String arg[]) {
        //Create a first empty vector
        Vector<String> vec = new Vector<>(4);
        //Add elements in the first vector
        vec.add("Java");
        vec.add("JavaScript");
        vec.add("Android");
        vec.add("Python");
        //Obtain an index of first occurrence of the specified element
        System.out.println("Index of element is: " + vec.indexOf("Android"));
        System.out.println("Index of element is: " +vec.indexOf("C"));
        System.out.println("The element is not found.");
    }
}
