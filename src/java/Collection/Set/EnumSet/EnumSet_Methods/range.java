/*
*   static <E extends Enum<E>> EnumSet<E> range(E from, E to)
*
*   => Nó được sử dụng để tạo một bộ enum ban đầu chứa các phần tử được chỉ định.
*
* */

package src.java.Collection.Set.EnumSet.EnumSet_Methods;

import java.util.*;

// Creating an enum of GFG type
enum TTT {
    Welcome, To, The, World, of, Geeks
}

public class range {
    public static void main(String[] args) {

        // Creating an EnumSet
        EnumSet<TTT> e_set;

        // Input the values using range()
        e_set = EnumSet.range(TTT.The, TTT.Geeks);

        // Displaying the new set
        System.out.println("The enum set is: " + e_set);
    }
}
