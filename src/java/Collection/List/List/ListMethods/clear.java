/*
*   syntax:
*       list.clear()
*
*   => xóa tất cả các phần tử khỏi ArrayList
*
* */

package src.java.Collection.List.List.ListMethods;

import java.util.*;

public class clear {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList: " + list);

        list.clear();

        System.out.println("Clear ArrayList: " + list);


    }
}
