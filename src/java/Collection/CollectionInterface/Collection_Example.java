package src.java.Collection.CollectionInterface;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Collection_Example {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
        Set<Integer> set = new HashSet<>();
        //it adds all the elements of specified collection in the invoking collection.
        Collections.addAll(set, 11, 12, 13, 14, 15);
        System.out.println("Collection : "+set);
        //It returns an iterator over the elements in proper sequence.
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        set.clear();
        //checks whether the set is empty or not
        Boolean b1 = set.isEmpty();
        if (b1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
        for (int i=1;i<21;i++){
            queue.add(i);
        }
        System.out.println(" Elements in the set : " + queue);
        for (int i = 1; i < 11; i++) {
            int j = i *5;
            set.add(j);
        }
        //will give the elements in the queue which are present in set
        queue.retainAll(set);
        System.out.println(" Multiple of 5 : " + queue);
    }
}
