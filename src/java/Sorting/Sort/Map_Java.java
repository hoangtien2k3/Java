/*
*   => Để có thể lưu trữ được thứ tự các phần tử của Map, chúng ta phải sử dụng LinkedHashMap.
*
* */

package src.java.Sorting.Sort;

import java.util.*;
import java.util.Map.Entry;

public class Map_Java {

    public static void main(String[] args) {
        // Original data
        Map<Integer, String> map = new HashMap<>();
        map.put(44, "Four");
        map.put(22, "Two");
        map.put(33, "Three");
        map.put(55, "Five");
        map.put(11, "One");

        // Convert list to map
        List<Entry<Integer, String>> list1 = new ArrayList<>(map.entrySet());

        // Create a comparator to sort by key
        Comparator<Entry<Integer, String>> keyComparator = new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };

        // Sorting a List
        Collections.sort(list1, keyComparator);

        /////////////////////////////////////////////////

        // Convert list to map
        List<Entry<Integer, String>> list2 = new ArrayList<>(map.entrySet());

        // Create a comparator to sort by value
        Comparator<Entry<Integer, String>> valueComparator = new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        // Sorting a List
        Collections.sort(list2, valueComparator);

        // Convert List to Map
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Entry<Integer, String> entry : list1) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Original map: " + map);
        System.out.println("Sorted map: " + sortedMap);
    }
}
