/*
    Giới thiệu Lambda Expression trong Java:

        + Lambda expression là một tính năng mới trong Java 8 cho phép bạn viết code tắt
        và định nghĩa một phương thức hoặc interface đơn giản mà không cần tên.

        +  Lambda expressions cho phép bạn tạo một đối tượng function tại thời điểm chạy
        và truyền nó như một đối số cho các phương thức khác.


    syntax:

            (input parameters) -> expression



    Lưu ý:
        Lambda expressions được sử dụng rộng rãi trong các functional interface và streams trong Java.
        Với sự hỗ trợ của lambda expressions, bạn có thể viết code tắt và dễ dàng hơn trong việc xử lý
        các tác vụ như duyệt, lọc và tính toán trên các danh sách dữ liệu.

*/


package JavaCore.Java_8_Features;

import java.util.Arrays;
import java.util.List;

public class Lambda_Expression {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));

        System.out.println("Max number: " + max);
    }
}