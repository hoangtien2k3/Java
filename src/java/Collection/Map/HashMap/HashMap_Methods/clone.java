
// Object clone()	Trả về một bản copy của HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class clone {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        // Mapping string values to int keys
        hash_map.put(1, "share");
        hash_map.put(4, "programming");
        hash_map.put(5, "net");

        HashMap<Integer, String> copy = (HashMap<Integer, String>) hash_map.clone();
        copy.put(111, "clone");
        System.out.println("origin: " + hash_map);
        System.out.println("clone " + copy);
    }
}
