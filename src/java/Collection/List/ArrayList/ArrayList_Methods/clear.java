/*
*   Trong ArrayList chúng ta có 2 method để xoá tất cả các phần tử:

        + clear()
        + removeAll()

* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class clear {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("Size truoc khi xoa: " + arr.size());
        arr.clear();
        System.out.println("Size sau khi clear: " + arr.size());


        ArrayList<Integer> brr = new ArrayList<Integer>();
        brr.add(12);
        brr.add(04);
        brr.add(2003);
        brr.add(12345);
        brr.add(54321);
        System.out.println("Size trước đó: " + brr.size());
        brr.removeAll(brr);
        System.out.println("Size sau đó: " + brr.size());

    }

}
