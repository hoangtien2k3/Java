/*
    => Iterator trong Java là một interface được sử dụng để thay thế Enumerations trong
       Java Collection Framework.
            + Duyệt các phần tử từ đầu đến cuối của một collection.
            + Iterator cho phép xóa phần tử khi lặp một collection.


    * Các Phương Thức của Iterator trong Java:

      + public boolean hasNext()  : Nó trả về true nếu iterator còn phần tử kế tiếp phần tử đang duyệt.

      + public object next()  : Nó trả về phần tử hiện tại và di chuyển con trỏ trỏ tới phần tử tiếp theo.

      + public void remove()  : Nó loại bỏ phần tử cuối được trả về bởi Iterator.
                                  Nó hiếm khi được sử dụng.

      + forEachRemaining()  :

* */


package src.java.Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Interface {
    public static void main(String args[]) {
        ArrayList listLanguages = new ArrayList();

        // them phan tu vao array list
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add(".NET");
        listLanguages.add("C");
        listLanguages.add("C++");

        // su dung iterator de hien thi noi dung cua listLanguages
        System.out.println("Danh sach ngon ngu lap trinh: ");
        Iterator itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }

        System.out.println();

        // sua cac phan tu duoc lap
        ListIterator litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + " (PASS)");
        }


        System.out.println("Noi dung da duoc sua cua listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();

        // hien thi cac phan tu theo thu tu nguoc lai
        System.out.println("Noi dung da duoc sua cua listLanguages " + "theo thu tu nguoc lai: ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.println(element);
        }
        System.out.println();

        // xoa phan tu C (PASS)
        litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            if ("C (PASS)".equals(element.toString())) {
                litr.remove();
            }
        }

        System.out.println("Noi dung da duoc sua cua listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();

    }
}
