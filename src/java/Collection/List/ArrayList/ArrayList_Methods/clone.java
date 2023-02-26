/*
*   syntax:
*           arraylist.clone()
*           (ArrayList<T>) arraylist.clone()
*
*   => Phương thức clone dùng để copy tất cả các phần tử của arraylist này cho arraylist kia.
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class clone {
    public static void main(String[] args) {

        // khai báo một ArrayList có tên là number
        ArrayList<Integer> number = new ArrayList<>();

        // sử dụng phương thức add() để thêm các phần tử vào mảng number
        number.add(1);
        number.add(3);
        number.add(5);

        System.out.println();
        System.out.println("Các phần tử trong mảng number: " + number);

        // khai báo một arraylist bản clone để copy từ mảng number
        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
        System.out.println("Các phần tử trong mảng cloneNumber: " + cloneNumber);

        System.out.println("---------------------------------");

    }
}
