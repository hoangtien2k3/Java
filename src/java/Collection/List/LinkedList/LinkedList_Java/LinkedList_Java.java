/*
    Lý Thuyết:

*   => Lớp LinkedList trong java là một lớp kế thừa lớp AbstractSequentialList và triển khai của
*      List, Queue src.java.JavaCore.Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và
*      phương thức tương đồng với List, Queue.
*
*   => Lớp LinkedList trong java sử dụng cấu trúc danh sách liên kết kép Doubly để lưu trữ các phần tử.
*

    => LinkedList
        + LinkedList có cú pháp, khai báo rất giống với ArrayList,
          bạn dễ dàng đổi từ ArrayList sang LinkedList bằng cách thay kiểu đối tượng.
*
*
* /////////////////////////////////////////////////////////
*
*   * Syntax:

*           public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable
*

            List<Kiểu dữ liệu> <Tên> = new LinkedList<>();
            LinkedList<Kiểu dữ liệu> <Tên> = new LinkedList<>();
            ( kiểu dữ liệu phải là wrapper )



    Example:
                List<Student_1> listOfStudents = new ArrayList<>(); (work)

                List<Student_1> listOfStudents = new Vector<>(); (work)

                List<Student_1> listOfStudents = new LinkedList<>(); (work)




*   * Khai báo:
            LinkedList list = new LinkedList(); // non-generic - kiểu cũ

            LinkedList<Type> list = new LinkedList<String>(); // generic - kiểu mới

                => kiểu dữ liệu trong LinkedList và ArrayList phải là wrapper. kiểu dữ liệu nguyên thủy không được sử dụng.
*
*
*
*
* /////////////////////////////////////////////////////////////
*   * Những điểm cần ghi nhớ về lớp LinkedList:

        + Lớp LinkedList trong java có thể chứa các phần tử trùng lặp.
        + Lớp LinkedList duy trì thứ tự của phần tử được thêm vào.
        + Lớp LinkedList là không đồng bộ (non-synchronized).
        + Trong java lớp LinkList, thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
        + Lớp LinkedList trong java có thể được sử dụng như list (danh sách), stack (ngăn xếp) hoặc queue (hàng đợi).

 *
* */

package src.java.Collection.List.LinkedList.LinkedList_Java;

public class LinkedList_Java {
}
