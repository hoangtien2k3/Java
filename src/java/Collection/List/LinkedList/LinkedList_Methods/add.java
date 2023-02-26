/*
*   => Nó được sử dụng để nối thêm phần tử được chỉ định vào cuối một danh sách
*
*   syntax:
*
*           list.add(Object element) : sử dụng hàm add
*
*           list.add(index, value) : sử dụng chỉ số
*
*
* */

package src.java.Collection.List.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class add {
    public static void main(String[] args) {
        // khai báo 1 LinkedList có tên là list
        // có kiểu là String
        LinkedList<String> list = new LinkedList<String>();

        // thêm các phần tử vào list sử dụng hàm add
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        // hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");
        System.out.println(list);


        list.add(4, "Java_2");
        list.add(5, "C++_2");


        // duyệt các phần tử bằng vòng lặp.
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for(String str : list) {
            System.out.print(str + " ");
        }
    }
}
