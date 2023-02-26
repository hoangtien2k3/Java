/*
*   => boolean containsValue(Object value)	Trả về true nếu HashMap chứa một phần
*   tử có giá trị (value) được chỉ định.
*
*   Trả về true nếu HashMap chứa một phần tử có giá trị (value) được chỉ định.
* */

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class containsValue {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(1, "share");
        hash_map.put(4, "programming");
        hash_map.put(5, "net");
        hash_map.put(10, "Welcomes");
        hash_map.put(6, "You");

        System.out.println("Value (share) is contain: " + hash_map.containsValue("share"));
        System.out.println("Value (haha) is contain: " + hash_map.containsValue("haha"));
    }
}
