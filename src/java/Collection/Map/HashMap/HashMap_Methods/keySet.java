
// Set keySet()	Trả về một Set interface chứa tất cả các key của HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class keySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        Set<String> keys = map.keySet();
        System.out.println("Length: " + keys.size());
        System.out.println("Keys: " + keys); // one - two
    }
}
