/*
*   Phân biệt ArrayList và LinkedList:
*
*   * ArrayList:
*       + ArrayList là dùng một mảng động (như mảng thường nhưng có thể thay đổi kích thước và
*         các phương thức thêm) để lưu trữ phần tử.
 *      + Thao tác với ArrayList chậm vì nó sử dụng một mảng bên trong.
 *      + Một lớp ArrayList chỉ có thể hoạt động như một danh sách (vì nó chỉ thực hiện Danh sách).
 *      + ArrayList tốt hơn để lưu trữ và truy cập dữ liệu.
 *      + Vị trí bộ nhớ cho các phần tử của ArrayList liền kề nhau.
 *      + ArrayList là một mảng động có thể thay đổi được kích thước.


*   * LinkedList:
*       + LinkedList sử dụng danh sách liên kết để lưu trữ phần tử.
*       + Thao tác với LinkedList nhanh hơn ArrayList vì nó sử dụng danh sách liên kết kép,
*         do đó không cần dịch chuyển bit trong bộ nhớ.
*       + Lớp LinkedList có thể hoạt động như một danh sách và cả hàng đợi
*         vì nó thực hiện các giao diện List và Deque.
*       + LinkedList tốt hơn để thao tác dữ liệu.
*       + vị trí của các phần tử trong LinkedList thì không kiền nhau.
*       + LinkedList thì áp dụng giao thức của danh sách liên kết kép.

* */

package src.java.Collection.DifferenceCollection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Difference_ArrayList_and_LinkedList {
    public static void main(String args[]){

        List<String> al = new ArrayList<String>();      //creating arraylist
        al.add("Ravi");     //adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");


        List<String> al2 = new LinkedList<String>();    //creating linkedlist
        al2.add("James");   //adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");


        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);

    }
}
