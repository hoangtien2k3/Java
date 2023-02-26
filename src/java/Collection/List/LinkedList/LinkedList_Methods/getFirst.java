/*
*   syntax:
*           list.getFirst(E e)
*
*   => lấy ra giá trị trong LinkedList đầu tiền.
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class getFirst {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(900);
        linkedList.add(1000);
        linkedList.add(3000);
        linkedList.add(1200);
        System.out.println("Head: " + linkedList.getFirst());
    }
}
