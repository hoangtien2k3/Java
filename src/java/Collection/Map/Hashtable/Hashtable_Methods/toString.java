
// String toString()	Ép kiểu các phần tử trong Hastable sang kiểu chuỗi

package src.java.Collection.Map.Hashtable.Hashtable_Methods;

import java.util.Hashtable;

public class toString {
    public static void main(String[] args) {

        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Inserting elements into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);

        // Displaying the string representation
        System.out.println("The set is: " + hash_table.toString());

    }
}
