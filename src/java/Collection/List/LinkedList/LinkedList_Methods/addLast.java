/*
 *   syntax:
 *           list.addLast(E e)
 *
 *   => dùng để chèn các phần tử vào cuối LinkedList
 *
 * */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class addLast {
    public static void main(String args[]) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(300);
        linkedList.add(200);
        System.out.println(linkedList);


        System.out.println("Thêm phần tử vào cuối LinkedList");
        linkedList.addLast(600);
        System.out.println(linkedList);

    }

}
