
// Object put(Object key, Object value)	Thêm một cặp key-value vào HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.*;

public class put {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        System.out.println("Length: " + entrySet.size());
//        for(Map.Entry<String, Integer> entry : entrySet) {
//            System.out.println("Key - Value: " + entry.getKey() + " - " + entry.getValue());
//        }


        /////////////////////////////////

//        List<List<Integer>> list = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap();

        String str = "eat";

        if(! map.containsKey(str)){
            map.put("mango", new ArrayList<>());
        }

        List<Integer> list = map.get("mango");
        list.add(3);

        System.out.println(list);
        System.out.println(map);


    }
}
