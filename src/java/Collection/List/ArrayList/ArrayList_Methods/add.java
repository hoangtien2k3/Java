/*
    Syntax:
        public boolean add(Object element)

    	=> Được sử dụng để chèn một phần tử vào collection.

* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

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
