
// boolean isEmpty() :	Trả về true nếu HashMap trống.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class isEmpty {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        System.out.println("HashMap is empty: " + hash_map.isEmpty());

        // Mapping string values to int keys
        hash_map.put(1, "share");
        hash_map.put(4, "programming");
        hash_map.put(5, "net");
        System.out.println("HashMap is empty: " + hash_map.isEmpty());
    }
}
