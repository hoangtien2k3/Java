/*
    => boolean containsKey(Object key): Trả về true nếu HashMap chứa một phần tử có key được chỉ định.

*   Note: Tham số truyền vào của containsKey() là một object thế nên bạn có thể truyền bất
*   ký giá trị có kiểu dữ liệu nào, không nhất thiết phải giống với kiểu dữ liệu của key.
*   Tất nhiên nếu bạn truyền khác kiểu dữ liệu của key chúng ta sẽ luôn nhận về kết quả false.
*
* */

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class containsKey {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(1, "share");
        hash_map.put(4, "programming");
        hash_map.put(5, "net");
        hash_map.put(10, "Welcomes");
        hash_map.put(6, "You");

        System.out.println("key (1) is contain: " + hash_map.containsKey(1));
        System.out.println("key (17) is contain: " + hash_map.containsKey(17));
        System.out.println("Key (100) is contain: " + hash_map.containsKey(100));

    }
}
