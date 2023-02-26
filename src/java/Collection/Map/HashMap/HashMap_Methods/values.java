
// Collection values()	Trả về Collection của các giá trị có trong HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class values {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        Collection<Integer> values = map.values();
        System.out.println("Length: " + values.size());
        System.out.println("Value: " + map.values());
        System.out.println("Value: " + values);
    }
}
