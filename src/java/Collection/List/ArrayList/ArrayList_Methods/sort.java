/*
*   syntax:
*           arraylist.sort(Comparator c)
*
*   => sắp xếp mảng:
*       + sắp xếp tăng dần: Comparator.naturalOrder()
*       + sap xếp giảm dần: Comparator.reverseOrder()
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        // khai báo một mảng ArrayList numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // thêm phần tử cho mảng numbers
        numbers.add(3);
        numbers.add(1);
        numbers.add(14);
        numbers.add(5);
        System.out.println("Mảng chưa sắp xếp: " + numbers);

        // sử dụng phương thức sort() để sắp xếp theo thứ tự tăng dần
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + numbers);

        // sử dụng phương thức sort() để sắp xếp theo thứ tự giảm dần
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + numbers);

    }
}
