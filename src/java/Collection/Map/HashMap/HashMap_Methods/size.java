
// int size(): Trả về số phần tử của HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;
import java.util.Map;

public class size {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        System.out.println("Size: " + map.size());
    }
}
