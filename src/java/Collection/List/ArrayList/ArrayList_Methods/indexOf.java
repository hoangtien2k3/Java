/*
*   syntax:
*           arraylist.indexOf(Object obj)
*
*   => Phương thức trả về:

        Vị trí của phần tử được chỉ định từ danh sách mảng.
        Nếu phần tử được chỉ định không tồn tại trong danh sách, phương thức indexOf () trả về -1.

* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class indexOf {
    public static void main(String[] args) {
        // khai báo một mảng arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        // sử dụng phương thức add() để thêm các phần tử vào mảng
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        System.out.println("Các phần tử trong mảng numbers: " + numbers);

        // tìm vị trí của số 13 trong mảng
        int position1 = numbers.indexOf(13);
        System.out.println("Vị trí của 13 trong mảng là: " + position1);

        // tìm vị trí của số 50 trong mảng
        int position2 = numbers.indexOf(50);
        System.out.println("Vị trí của 50 trong mảng là: " + position2);
        // ->> vì 50 không có trong mảng nên kết quả sẽ trả về -1
    }


}
