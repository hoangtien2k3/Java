/*
    Giới thiệu Lambda Expression trong Java:

        + Lambda expression là một tính năng mới trong Java 8 cho phép bạn viết code tắt
        và định nghĩa một phương thức hoặc interface đơn giản mà không cần tên.

        +  Lambda expressions cho phép bạn tạo một đối tượng function tại thời điểm chạy
        và truyền nó như một đối số cho các phương thức khác.





    Trong Java, có một số quy tắc và cú pháp cần thiết để sử dụng lambda expression. Đây là một số trong số những quy tắc đó:

        1. Cú pháp:
                    (parameters) -> expression

        2. Tham số:

            Tham số của một lambda expression có thể là một hoặc nhiều biến.
            Nếu có nhiều hơn một tham số, chúng phải được ngăn cách bởi dấu phẩy.
            Các tham số cần có kiểu dữ liệu như bình thường, hoặc có thể sử dụng kiểu dữ liệu var
            (trong Java 10 trở lên).

        3. Toán tử "->":

            Toán tử này được gọi là toán tử arrow.
            Nó phân chia lambda expression thành hai phần: tham số và biểu thức.

        4. Biểu thức:

            Biểu thức là phần của lambda expression mà tính giá trị của nó.
            Nó có thể là một phép tính đơn giản hoặc một câu lệnh.

        5. Sử dụng trong interface:

            Một lambda expression chỉ có thể được sử dụng trong một giao diện có một phương thức trừu tượng.
            Giao diện có thể được sử dụng để tạo ra một đối tượng động bằng cách sử dụng lambda expression.





    Tại sao sử dụng biểu thức Lambda:
        + Cung cấp bản thực hiện cho interface Chức năng.
        + Viết ít code hơn.


    Lưu ý:
        Lambda expressions được sử dụng rộng rãi trong các functional interface và streams trong Java.
        Với sự hỗ trợ của lambda expressions, bạn có thể viết code tắt và dễ dàng hơn trong việc xử lý
        các tác vụ như duyệt, lọc và tính toán trên các danh sách dữ liệu.

*/


package src.java.Java8.LambdaExpression;

interface Drawable {
    public void draw();
}

public class Lambda_Expression {
    public static void main(String[] args) {

        int width = 10;


        // sử dụng annonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing with Anonymous Class: " + width);
            }
        };
        d.draw();



        // sử dụng biểu thức lambda
        Drawable d2 = () -> {
            System.out.println("Drawing with Lambda: " + width);
        };
        d2.draw();

        Drawable d3 = () -> System.out.println("Drawing with Lambda: " + width);


    }
}