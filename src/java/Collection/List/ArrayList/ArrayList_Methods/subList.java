/*
*   syntax:
*           arraylist.subList(int fromIndex, int toIndex)
*
*           + fromIndex - vị trí bắt đầu từ nơi các phần tử được trích xuất.
            + toIndex - vị trí kết thúc mà các phần tử được trích xuất.
*
*   => lấy ra giá trị từ vị trí fromIndex -> toIndex (chú ý không lấy đến giá trị cuối cùng)
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class subList {
    public static void main(String[] args) {
        // khai báo một mảng arraylist languages
        ArrayList<String> languages = new ArrayList<>();
        // sử dụng phương thức add() để thêm các phần tử vào mảng arraylist
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("Các phần tử có trong mảng languages: " + languages);

        // các phần tử từ vị trí 1 đến 2 là.
        System.out.println("Các phần tử đã trích xuất: " + languages.subList(1, 3));
    }
}
