/*
    Syntax:
        public boolean add(Object element)

    	=> Được sử dụng để chèn một phần tử vào collection.

* */

package JavaCore.Java_Collections.List_Interface.ArrayList_Java.ArrayList_Methods;

import java.util.ArrayList;
import java.util.Iterator;

public class add {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) { // hasNext: kiểm tra xem tới khi không còn phần tử nào nữa
            System.out.println((String) iterator.next());
        }

    }
}
