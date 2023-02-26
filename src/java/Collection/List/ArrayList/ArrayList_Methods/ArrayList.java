/*
*   ArrayList:
*       + Lớp ArrayList trong java là một lớp kế thừa lớp AbstractList và triển khai của List src.java.JavaCore.Interface
*       trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với List.
*
*       +  ArrayList được sử dụng như một mảng động để lưu trữ các phần tử.
*
*
    Ex:
    *       ArrayList<int> al = ArrayList<int>();               // does not work
            ArrayList<Integer> al = new ArrayList<Integer>();   // works fine
*
*
*
*   Những điểm cần ghi nhớ về ArrayList:
        + Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
        + Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
        + Lớp ArrayList là không đồng bộ (non-synchronized).
        + Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
        + Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
*
*
*
*   syntax:
*           public class ArrayList<E> extends AbstractList<E>
                    implements List<E>, RandomAccess, Cloneable, java.io.Serializable
*
*
*           Khởi tạo: Có 2 cách:
*
                    + ArrayList list = new ArrayList(); // non-generic - kiểu cũ
                    + ArrayList<String> list = new ArrayList<String>(); // generic - kiểu mới
*
* */

/*
*       Constructor của lớp ArrayList :
*           + ArrayList() :	Nó được sử dụng để khởi tạo một danh sách mảng trống.
*
*           + ArrayList(Collection c) :	Nó được sử dụng để xây dựng một danh sách mảng được khởi tạo
*                                       với các phần tử của collection c.
            + ArrayList(int capacity) :	Nó được sử dụng để xây dựng một danh sách mảng mà có dung lượng
                                        ban đầu được chỉ định.
*
* */

package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là list
        // có kiểu là String
        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        // thêm các phần tử vào list.
        list.add("Java");
        list.add("C++");

        list.add("PHP");
        list.add("Java");


        // hiển thị các phần tử của list
        System.out.print("Element ArrayList: ");
        System.out.println(list);


        // Duyệt các phần tử của ArrayList - sử dụng vòng lặp for
        System.out.print("For Thuong: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Duyệt các phần tử của ArrayList - sử dụng vòng lặp for earch
        System.out.print("For Earch: ");
        for(String str : list) {
            System.out.print(str + " ");
        }

        System.out.println();

        // Duyệt các phần tử của ArrayList - sử dụng Iterator_Interface.
        // Iterator_Interface in Java.
        System.out.print("Iterator_Interface: ");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print((String) iterator.next() + " ");
        }

        System.out.println();

        // Duyệt các phần tử của ArrayList - sử dụng ListIterator.
        System.out.print("ListIterator: ");
        ListIterator<String> iterator1 = list.listIterator();
        while(iterator1.hasNext()) {
            System.out.print((String) iterator1.next() + " ");
        }

    }
}
