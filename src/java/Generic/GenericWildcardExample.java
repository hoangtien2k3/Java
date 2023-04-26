package src.java.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardExample {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);

        printList(integerList);
        printList(doubleList);
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

}