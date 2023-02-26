/*
*   syntax:
*           arraylist.toArray(T[] arr)
*
*   =>  Một mảng kiểu T nếu tham số T [] arr được truyền cho phương thức.
        Một mảng kiểu Object nếu tham số không được truyền.
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;

public class toArray {
    public static void main(String[] args) {

        //khai báo một mảng arraylist languages
        ArrayList<String> languages = new ArrayList<String>();
        //sử dụng phương thức add() để thêm phần tử cho mảng languages
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("Mảng arraylist languages: " + languages);

        // tạo mảng một chiều arr với độ dài bằng với độ dài của mảng languages
        String[] arr = new String[languages.size()];

        // chuyển đổi mảng arraylist languages thành mảng một chiều arr.
        languages.toArray(arr); // chuyển từ ArrayList sang mảng một chiều Array

        // xuất mảng một chiều ra màn hình.
        System.out.print("Mảng một chiều arr: ");
        for(String item : arr) {
            System.out.print(item + ", ");

        }

    }
}
