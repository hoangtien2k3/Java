/*
*   Syntax:
*           arraylist.contains(Object obj)
*
*   Phương thức trả về:

        + Trả về true nếu phần tử được chỉ định có trong danh sách mảng.
        + Trả về false nếu phần tử được chỉ định không có trong danh sách mảng.
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class contains {
    public static void main(String[] args) {
        // khai báo một arraylist có tên là numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // sử dụng phương thức add() để thêm các phần tử vào mảng numbers
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        System.out.println("Các phần tử trong mảng number: " + numbers);

        // kiểm tra xem 3 có trong mảng numbers hay không
        System.out.print("3 có trong danh sách mảng numbers: ");
        System.out.println(numbers.contains(3));

        // kiểm tra xem 1 có trong mảng numbers hay không
        System.out.print("1 có trong danh sách mảng numbers: ");
        System.out.println(numbers.contains(1));

    }

}
