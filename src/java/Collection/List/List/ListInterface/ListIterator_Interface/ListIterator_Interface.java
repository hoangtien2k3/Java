/*
*   * ListIterator src.java.JavaCore.Interface:
*
*       syntax:
*               public interface ListIterator<E> extends Iterator_Interface<E>

*
*       + hasNext() : trả về true nếu list iterator có tồn tại phần tử kế tiếp phần tử hiện tại.
*       + hasPrevious() : Trả về true nếu list interator có tồn tại phần tử kế sau phần tử hiện tại.
*       + next() : Trả về phần tử kế tiếp trong danh sách và vị trí con trỏ tăng lên 1.
*       + previous() : Trả về phần tử kế sau trong danh sách và vị trí con trỏ giảm đi 1.
*
*
*
* */

package src.java.Collection.List.List.ListInterface.ListIterator_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Interface {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Add element to list
            list.add("0" + i);
        }

        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator_Interface: Only Traversing the list in the forward direction ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        // ListIterator src.java.JavaCore.Interface trong Java
        ListIterator<String> itr = list.listIterator();

        System.out.println("Using ListIterator: Traversing the list in the forward direction ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println("Using ListIterator: Traversing the list in the reverse direction ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }

    }
}
