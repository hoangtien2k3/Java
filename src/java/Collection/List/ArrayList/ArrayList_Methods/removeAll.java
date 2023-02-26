/*
*   Syntax:
*           public boolean removeAll(Collection c)
*
*       => Được sử dụng để xóa tất cả các phần tử của ArrayList được
*          chỉ định từ ArrayList gọi phương thức này.
*
* */


package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class removeAll {
    public static void main(String[] args) {
        ArrayList<String> letters = null;
        System.out.println(letters);    // null

        ArrayList<String> removedLetters = new ArrayList<String>();
        removedLetters.add("a");
        removedLetters.add("b");
        System.out.println(removedLetters);     // [a, b]

        try {
            letters.removeAll(removedLetters);  // throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Arraylist empty");
        }

    }
}
