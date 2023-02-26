/*
    Lý Thuyết:

*   <=> So sánh Iterator và ListIterator

*       Iterator:
            + Có thể được sử dụng để duyệt phần tử của bất kỳ tập hợp nào.
            + Chỉ có thể duyệt phần tử theo hướng tiến về phía trước.
            + Đối tượng có thể được tạo bằng cách gọi phương thức iterator() của một lớp tập hợp.
            + Không cho phép xóa các phần tử.
            + Đưa ra ngoại lệ ConcurrentModificationException trong thao tác thêm phần tử.
              Do đó, việc thêm phần tử là không được cho phép.
            + Không thể truy cập vào chỉ số của phần tử được duyệt.
            + Không cho phép thay đổi các phần tử.



*       ListIterator:
            + Chỉ có thể được sử dụng để duyệt phần tử của các tập hợp danh sách bao gồm
              LinkedList, ArrayList và một số tập hợp danh sách khác.
            + Có thể duyệt phần tử theo cả hai hướng là lùi về phía sau và tiến về phía trước.
            + Đối tượng có thể được tạo bằng cách gọi phương thức listIterator() của một lớp tập hợp.
            + Cho phép xóa các phần tử.
            + Việc thêm phần tử được cho phép.
            + Phương thức nextIndex() and nextPrevious() được sử dụng để truy cập vào chỉ số của phần tử được duyệt.
            + Cho phép thay đổi các phần tử.



* */

package src.java.Collection.List.List.ListInterface.Difference_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Difference_Iterator_and_ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> so_nguyen = new ArrayList<>();
        so_nguyen.add(34);
        so_nguyen.add(25);
        so_nguyen.add(58);
        System.out.println(so_nguyen);

        // Sử dụng Iterator src.java.JavaCore.Interface trong Java
        Iterator<Integer> phan_tu = so_nguyen.iterator();
        int i = phan_tu.next();
        System.out.println(i);
        phan_tu.remove();

        while(phan_tu.hasNext()) {
            phan_tu.forEachRemaining((gia_tri) -> System.out.print(gia_tri + " "));
        }



        ///////////////////////////////////////////////////////////////////////////

        List<String> list = new ArrayList<>();
        for (int k = 1; k <= 5; k++) {
            // Add element to list
            list.add("0" + k);
        }

        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator_Interface: Only Traversing the list in the forward direction ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        // ListIterator src.java.JavaCore.Interface trong Java
        ListIterator<String> itr = list.listIterator();

        System.out.println("Using ListIterator: Traversing the list in the forward direction ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println("Using ListIterator: Traversing the list in the reverse direction ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
}
