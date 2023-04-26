package src.java.Generic;

import java.util.*;

public class WildcardDemo {

    // giới hạn kiểu dữ liệu phải là lớp con của một lớp cụ thể.
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // giới hạn kiểu dữ liệu phải là lớp cha của một lớp cụ thể.
    public static void printList(List<? super Integer> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Sum of integers in the list: " + sum(intList));

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);
        System.out.println("Sum of doubles in the list: " + sum(doubleList));

        List<Object> objectList = new ArrayList<Object>();
        objectList.add(1);
        objectList.add("two");
        objectList.add(3.0);
        System.out.println("List of objects: ");
        printList(objectList);
    }
}