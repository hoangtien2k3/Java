
// int size(): Trả về số phần tử của HashMap.

package JavaCore.Java_Collections.Map_Interface.HashMap.HashMap_Methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class size {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        System.out.println("Size: " + map.size());
    }
}
