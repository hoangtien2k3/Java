/*
    !!! Những điểm quan trọng về lớp Hashtable trong java là:
        + Hashtable là một mảng của list. Mỗi list được biết đến như một xô chứa các phần tử.
          Ví trí của một xô được xác định bằng việc gọi phương thức hashcode().
          Hashtable cũng lưu trữ dữ liệu dưới dạng cặp key và value.

        + Nó chứa các key duy nhất.

        + Nó KHÔNG thể có bất kỳ key hoặc giá trị nào là null.

        + Nó được đồng bộ (synchronized)

*/

package src.java.Collection.Map.Hashtable;

import java.util.Hashtable;
import java.util.Set;

public class Hashtable_Java {

    public static void main(String args[]) {
        // init hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        // add elements to hashtable
        hashtable.put(3, "C++");
        hashtable.put(1, "Java");
        hashtable.put(2, "PHP");
        hashtable.put(4, "Python");

        // show hashtable
        show(hashtable);

        // remove element
        hashtable.remove(2);

        // show hashtable after remove
        System.out.println("After remove:");

        // show hashtable
        show(hashtable);

    }

    public static void show(Hashtable<Integer, String> hashtable) {
        Set<Integer> keySet = hashtable.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }


}