/*
*   syntax:
*           arraylist.lastIndexOf(Object obj)
*
*   =>  Lấy ra bị trí xuất hiện của phần tử trong ArrayList
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class lastIndexOf {
    public static void main(String[] args) {

        // Khai báo mảng ArrayList languages
        ArrayList<String> languages = new ArrayList<>();
        // sủ dụng phương thức add() để thêm phần tử vào mảng languages
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");
        System.out.println("Các phần tử trong mảng languages: " + languages);

        //lấy vị trí xuất hiện cuối cùng của "Java"
        int position1 = languages.lastIndexOf("Java");
        System.out.println("Vị trí xuất hiện cuối cùng của 'Java' là: " + position1);
        //lấy vị trí xuất hiện cuối cùng của "C"
        int position2 = languages.lastIndexOf("C");
        System.out.println("Vị trí xuất hiện cuối cùng của 'C' là: " + position2);
        // ->>> kết quả của lần này sẽ là -1, vì 'C' không có trong mảng

    }
}
