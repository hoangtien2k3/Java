
// Object put(Object key, Object value)	Thêm phần tử (key:value) vào trong Hashtable

package src.java.Collection.Map.Hashtable.Hashtable_Methods;

import java.util.Hashtable;

public class put {
    public static void main(String[] args) {
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Putting values into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        System.out.println("elements Hashtable: " + hash_table);


    }
}
