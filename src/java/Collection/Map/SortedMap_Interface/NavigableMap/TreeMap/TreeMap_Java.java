/*
*   syntax:
*
*           public class TreeMap<Key,Value> extends AbstractMap<Key,Value>
                implements NavigableMap<Key,Value>, Cloneable, Serializable

 *
* */



package src.java.Collection.Map.SortedMap_Interface.NavigableMap.TreeMap;

import java.util.TreeMap;
import java.util.Iterator;

public class TreeMap_Java {
    public static void main(String args[]) {

        // khoi tao map
        TreeMap<String, String> map = new TreeMap<String, String>();

        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");

        map.put("Py", "Python");

        // show hashMap
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(map.get(itr.next()));
        }

    }
}
