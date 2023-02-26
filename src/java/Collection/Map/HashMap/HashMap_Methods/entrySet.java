
// Set entrySet()	Trả về Collection view các ánh xạ có trong HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Length: " + entrySet.size());
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key - Value: " + entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("_____________________________________");

        Set<String> keys = map.keySet();
        System.out.println("Length: " + keys.size());
        System.out.println("Keys: " + keys);

        System.out.println("_____________________________________");

        Collection<Integer> values = map.values();
        System.out.println("Length: " + values.size());
        System.out.println("Values: " + values);

    }
}
