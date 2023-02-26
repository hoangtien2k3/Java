
// clone()	: Trả về một bản sao của đối tượng đang gọi

package src.java.Collection.Map.Hashtable.Hashtable_Methods;

import java.util.Hashtable;

public class clone {
    public static void main(String[] args) {
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Putting values into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        // Displaying the Hashtable
        System.out.println("The Hashtable is: " + hash_table);

        // Displaying the cloned Hashtable using clone()
        System.out.println("The cloned table look like this: " + hash_table.clone());
    }
}
