
// Object remove(Object key)	Xóa phần tử trong Hashtable giựa vào Key

package src.java.Collection.Map.Hashtable.Hashtable_Methods;

import java.util.Hashtable;

public class remove {
    public static void main(String[] args) {
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Putting values into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");


        System.out.println("Elements before remove: " + hash_table);

        hash_table.remove("25");

        System.out.println("Elements after remove: " + hash_table);

    }
}
