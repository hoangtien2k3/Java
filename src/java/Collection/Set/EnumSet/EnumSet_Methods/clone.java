/*
*   EnumSet<E> clone()	: Nó được sử dụng để trả về một bản sao của đối tượng set này.
*
* */


package src.java.Collection.Set.EnumSet.EnumSet_Methods;

import java.util.EnumSet;

enum GFG {
    Welcome,
    To,
    The,
    World,
    of,
    Geeks
}

public class clone {
    public static void main(String[] args)
    {

        // Creating an empty EnumSet
        // Getting all elements from GFG
        EnumSet<GFG> e_set = EnumSet.allOf(GFG.class);

        // Displaying the empty EnumSet
        System.out.println("Initial set: " + e_set);

        // Cloning the set
        EnumSet<GFG> final_set = e_set.clone();

        // Displaying the final set
        System.out.println("The updated set is:" + final_set);

    }
}
