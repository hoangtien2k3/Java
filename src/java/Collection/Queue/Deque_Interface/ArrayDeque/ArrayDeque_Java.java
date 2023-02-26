package src.java.Collection.Queue.Deque_Interface.ArrayDeque;

import java.util.*;

public class ArrayDeque_Java {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        //Traversing elements
        for(String str : deque) {
            System.out.println(str);
        }

        System.out.println();

        Iterator<String> iter = deque.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
