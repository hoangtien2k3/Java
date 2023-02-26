/*
*   static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)
*
*   => Nó được sử dụng để tạo một tập hợp enum rỗng với kiểu phần tử được chỉ định.
*
* */


package src.java.Collection.Set.EnumSet.EnumSet_Methods;

// Java program to demonstrate noneof() method
import java.util.*;

// Creating an enum of GFG type
enum BTS {
    Welcome,
    To,
    The,
    World,
    of,
    Geeks
}

public class noneOf {
    public static void main(String[] args) {

        // Creating an empty EnumSet
        // Getting all elements from GFG
        EnumSet<BTS> e_set = EnumSet.allOf(BTS.class);

        // Displaying the initial EnumSet
        System.out.println("The first set is: " + e_set);

        // Creating another empty set
        EnumSet<BTS> other_set = EnumSet.noneOf(BTS.class);

        // Displaying the new set
        System.out.println("The other set is: " + other_set);

    }
}
