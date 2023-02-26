/*
*   syntax:
*           arraylist.forEach(Consumer<E> action)
*
*   Example:
*           arr.forEach((e) -> {
              e = e * 2;
            });
*
*   => dùng forEach để duyệt từng phần tử. mà không làm thay đổi giá trị của ArrayList
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {

        // khai báo mảng ArrayList numbers.
        ArrayList<Integer> numbers = new ArrayList<>();
        // sử dụng phương thức add() để thêm các phần tử vào mảng numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Các phần tử trong mảng numbers: " + numbers);

        // Nhân với 10 cho tất cả các phần tử
        System.out.print("Mảng sau khi nhân các phần tử với 10: ");

        // Sử dụng forEach() để duyệt từng phần tử trong mảng
        numbers.forEach((e) -> {
            e = e * 10;
            System.out.print(e + " ");
        });


        System.out.println("\nPhần Tử ArrayList: " + numbers);

    }
}
