/*
*   syntax:
*           arraylist.get(index)

    =>    index - vị trí của phần tử được truy cập
    *  arraylist.get(0) : lấy ra giá trị của phần tử ArrayList số 0.
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class get {
    public static void main(String[] args) {

        // tạo mới một arraylist
        ArrayList<String> languages = new ArrayList<>();
        // thêm các phần tử cho mảng
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("Các phần tử trong mảng là: " + languages);

        // lấy phần tử ở ví trí số 1
        String element = languages.get(0);
        System.out.println("Phần tử ở vị trí số 1 là: " + element);
        System.out.println("Phần tử ở vị trí số 2 là: " + languages.get(2));

    }
}
