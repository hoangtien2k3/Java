/*
*   syntax:
*           list.getLast()
*
*   => lấy ra giá trị cuối cùng trong LinkedList.
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class getLast {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(900);
        linkedList.add(1000);
        linkedList.add(3000);
        linkedList.add(1200);
        System.out.println("Head: " + linkedList.getLast());

    }
}
