/*
*   syntax:
*           list.size();
*   => lấy ra số lượng phần tử LinkedList
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class size {
    public static void main(String[] args) {

        LinkedList<Double> list = new LinkedList<>();
        list.add(100.7);
        list.add(123.23);
        list.add(23.12);
        list.add(3423.0);

        System.out.println("Số lượng phần tử của LinkedList: " + list.size());

    }
}

