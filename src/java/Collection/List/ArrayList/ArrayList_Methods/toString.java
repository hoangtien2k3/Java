/*
*   syntax:
*           arraylist.toString()
*
*   =>
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class toString {
    public static void main(String[] args) {

        //khai báo mảng arraylist languages
        ArrayList<String> languages= new ArrayList<>();

        // sử dụng phương thức add() để thêm các phần tử vào mảng languages
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("Các phần tử trong mảng: " + languages);

        //sử dụng phương thức toString() để chuyển đổi mảng languages thành chuỗi list (String)
        String str = languages.toString();
        System.out.println("Chuỗi str: " + str);

    }
}
