
// Object remove(Object key): Xóa một phần tử có key được chỉ định ra khởi HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class remove {
    public static void main(String args[]) {
        // khoi tao hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        // them cac phan tu vao hashMap
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(4, "Python");
        System.out.println(hashMap);

        // xoa phan tu co key = 4
        hashMap.remove(4);
        System.out.println(hashMap);

        // xoa toan bo hashMap
        hashMap.clear();
        System.out.println(hashMap);
    }
}
