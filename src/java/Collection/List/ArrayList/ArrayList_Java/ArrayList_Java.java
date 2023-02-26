/*
    Lý Thuyết:

*   !!! Những điểm quan trọng của ArrayList:
            Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
            Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
            Lớp ArrayList là không đồng bộ (non-synchronized).
            Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
            Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.

*       Syntax:
*
*           ArrayList<int> al = ArrayList<int>(); // does not work: không hoạt động được
            ArrayList<Integer> al = new ArrayList<Integer>(); // works fine: hoạt động được.


            List<Kiểu dữ liệu> <Tên> = new ArrayList<>();
            ArrayList<Kiểu dữ liệu> <Tên> = new ArrayList<>();
            ( kiểu dữ liệu phải là wrapper )



        !!! ArrayList class declaration:

            Syntax:

                public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
*
*
*
*       !!! Constructors of ArrayList:
*           Constructor:
*               + ArrayList()
*               + ArrayList(Collection<? extends E> c)
*               + ArrayList(int capacity)
*
* */

/*
    !!! Sự khác nhau giữa ArrayList và LinkedList:

*       - ArrayList:
            + ArrayList sử dụng mảng động để lưu trữ phần tử.
            + ArrayList là cấu trúc dữ liệu dựa trên chỉ mục.
            + Thao tác khi thêm, sửa, xóa phần tử là 0(n)
            + Thao tác tìm kiếm là 0(1).
            + ArrayList chỉ có thể hoạt động như một list vì nó chỉ implements giao tiếp List.
            + ArrayList yêu cầu ít bộ nhớ hơn so với LinkedList.
            + ArrayList tốt hơn trong việc lưu trữ và truy xuất dữ liệu (get).



*       - LinkedList:
            + LinkedList sử dụng danh sách liên kết (double linkedlist) để lưu trữ phần tử.
            + LinkedList được gọi là node. Gồm 3 thông tin: Tham chiếu cuả phần tử trước đó, giá trị phần tử đó, và tham chiếu phần tử sau đó.
            + Thao tác khi thêm, sửa, xóa phần tử là 0(1).
            + Thao tác tìm kiếm là 0(n).
            + LinkedList có thể hoạt động như một ArrayList, stack (hàng đợi), queue (hàng đợi), Singly Linked List and
              Doubly Linked List vì nó implements các giao tiếp List và Deque.
            + LinkedList yêu cầu nhiều bộ nhớ hơn so với ArrayList.
            + LinkedList tốt hơn trong việc thao tác dữ liệu (thêm/ xóa).


* */


package src.java.Collection.List.ArrayList.ArrayList_Java;

public class ArrayList_Java {
}
