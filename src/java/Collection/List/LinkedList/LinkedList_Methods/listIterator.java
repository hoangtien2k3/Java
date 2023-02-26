/*
*   import java.util.ListIterator;
*
*   listIterator:   listsIterator() để thêm các phần tử vào LinkedList.
*
*
*   syntax:
*
*           ListIterator<E> listIterator(int index)
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.ListIterator;
import java.util.ArrayList;

public class listIterator {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Tien");

        // Creating an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        listIterate.add("Dog");
        listIterate.add("Cat");

        System.out.println("LinkedList: " + animals);

    }
}
