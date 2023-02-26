
// Object get(Object key): Trả về giá trị của key được chỉ định.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class get {
    public static void main(String args[]) {
        // init hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // add elements to hashMap
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(4, "Python");

        // hien thi HashMap
        System.out.println("Phan tu co key = 1 la: " + hashMap.get(1));
        System.out.println("Phan tu co key = 2 la: " + hashMap.get(2));
    }
}
