/*
*   syntax:
*           boolean remove(Object o)
*
*   => Được sử dụng để xóa phần tử từ ArrayList.
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class remove {

    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");

        System.out.println(letters);                   // [A, B, C, D, E]
        System.out.println(letters.remove("C"));    // prints true
        System.out.println(letters.remove("Z"));    // prints false

        System.out.println(letters.remove(0));    // print "A"
        System.out.println(letters);                   // print ArrayList

    }

}
