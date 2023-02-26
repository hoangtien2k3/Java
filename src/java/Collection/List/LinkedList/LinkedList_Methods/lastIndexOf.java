/*
*   LinkedList lastIndexOf() trả về vị trí xuất hiện cuối cùng trong LinkedList.
*   Trả về -1 nếu phần tử không chứa trong LinkedList.

    Syntax:
            public int lastIndexOf(Object o);
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class lastIndexOf {
    public static void main(String args[]) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(200);
        linkedList.add(150);
        linkedList.add(600);

        System.out.println("Index of 200: " + linkedList.lastIndexOf(200));
        System.out.println("Index of 1000: " + linkedList.lastIndexOf(1000));

    }
}
