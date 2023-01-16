
// Object put(Object key, Object value)	Thêm một cặp key-value vào HashMap.

package JavaCore.Java_Collections.Map_Interface.HashMap.HashMap_Methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class put {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Length: " + entrySet.size());
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key - Value: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
