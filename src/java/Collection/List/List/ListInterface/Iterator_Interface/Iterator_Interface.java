/*
*   Định Nghĩa Iterator:
*           - Iterator trong Java là một interface được sử dụng để thay thế Enumerations
*             trong Java Collection Framework.
*           - Bạn có thể sử dụng interator để: Duyệt các phần tử từ đầu đến cuối của một collection.
*
*
*
*   Các phương thức của Iterator:
        - Iterator src.java.JavaCore.Interface cung cấp 4 phương thức:
            + Phương thức hasNext(): Trả về true nếu tồn tại một phần tử trong tập hợp.
            + Phương thức next(): Trả về phần tử tiếp theo của tập hợp.
            + Phương thức remove(): Loại bỏ phần tử cuối cùng được trả về bởi next().
            + Phương thức forEachRemaining(): Thực hiện hành động được chỉ định cho từng phần tử còn lại của tập hợp.
*
*
*
*
*   * Ưu điểm của Iterator src.java.JavaCore.Interface
        + Nó không phải là một src.java.JavaCore.Interface kế thừa và có thể duyệt qua các phần tử của các tập hợp như ArrayList, HashMap, TreeSet, HashSet, và các tập hợp khác.
        + Nó có thể được sử dụng cho bất kỳ tập hợp nào.
        + Các thao tác đọc và xóa được hỗ trợ trong src.java.JavaCore.Interface này.
        + Tên phương thức của Iterator đơn giản và dễ sử dụng.


    * Nhược điểm
        + Nó không hỗ trợ các thao tác tạo và cập nhật trong các thao tác (Tạo, Đọc, Cập nhật, Xóa).
        + Nó chỉ hỗ trợ duyệt phần tử đơn hướng, tức là chỉ có duyệt theo hướng về phía trước.
        + Nó không hỗ trợ quá trình duyệt phần tử tốt hơn trên một khối lượng lớn dữ liệu so với Spliterator.
        + Nó chỉ hỗ trợ việc lặp tuần tự, không hỗ trợ việc duyệt qua các phần tử song song.

*
* */


package src.java.Collection.List.List.ListInterface.Iterator_Interface;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Iterator_Interface {
    public static void main(String[] args) {
        List<Integer> so_nguyen = new ArrayList<>();
        so_nguyen.add(34);
        so_nguyen.add(25);
        so_nguyen.add(58);
        System.out.println(so_nguyen); // in ra các phần tu của ArrayList


        // Iterator src.java.JavaCore.Interface trong Java
        Iterator<Integer> phan_tu = so_nguyen.iterator();
        System.out.println(phan_tu.next());  // in ra giá trị phần tử đầu tiên trong ArrayList
        phan_tu.remove();       // xóa bỏ phần tử đầu tiên trong danh sách.


        // in ra các phần tử lần lượt trong danh sách.
        while(phan_tu.hasNext()) {
            phan_tu.forEachRemaining((gia_tri) -> System.out.print(gia_tri + " "));
        }

        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };

    }
}
