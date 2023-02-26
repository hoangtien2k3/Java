/*
*   => void clear()	: Xóa tất cả các phần tử của HashMap.
*
*   Note: clear() method có thể dùng với bất kỳ loại HashMap với key và value
*   có các kiểu dữ liệu khác nhau.
 * */

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class clear {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        // Mapping string values to int keys
        hash_map.put(1, "share");
        hash_map.put(4, "programming");
        hash_map.put(5, "net");
        hash_map.put(10, "Welcomes");
        hash_map.put(6, "You");

        System.out.println("Map init: " + hash_map);
        hash_map.clear();
        System.out.println("After clear(): " + hash_map);

    }
}
