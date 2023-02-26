/*
*   Java LinkedList indexOf() kiểm tra và trả về vị trí xuất hiện đầu tiên của phần tử trong LinkedList.

    Syntax

    public int indexOf(Object o)
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class indexOf {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(900);
        linkedList.add(1000);
        linkedList.add(900);
        linkedList.add(1200);

        System.out.println("indexOf 900: " + linkedList.indexOf(900));
        System.out.println("indexOf 1200: " + linkedList.indexOf(1200));
        System.out.println("Không chứa trong indexOf: " + linkedList.indexOf(12345)); // trả về -1

    }
}
