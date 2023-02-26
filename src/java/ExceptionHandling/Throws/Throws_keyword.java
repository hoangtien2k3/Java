/*
*   => Từ khóa throws trong java được sử dụng để khai báo một ngoại lệ.
       + Ngoại lệ checked được truyền ra ngay cả khi chỉ sử dụng từ khóa throws.


*   => Exception Handling chủ yếu được sử dụng để xử lý ngoại lệ checked.
*       + Nếu xảy ra bất kỳ ngoại lệ unchecked như NullPointerException, đó là lỗi của lập trình viên
*       mà anh ta không thực hiện kiểm tra trước khi code được sử dụng.


*   => IOException còn được gọi là checked exception.
        Chúng được trình biên dịch kiểm tra tại thời điểm biên dịch và lập trình viên được yêu cầu xử
        lý các ngoại lệ này.


*   syntax:

            return_type method_name() throws exception_class_name {
                // method code
            }

*   Lợi ích của từ khóa throws trong java
        + Ngoại lệ checked có thể được ném ra ngoài và được xử lý ở một hàm khác.
        + Cung cấp thông tin cho caller của phương thức về các ngoại lệ.

* */

package src.java.ExceptionHandling.Throws;

import java.io.IOException;

public class Throws_keyword {
    void m() throws IOException {
        throw new IOException("device error"); // checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() throws IOException {
        n();
    }

    public static void main(String args[]) {
        Throws_keyword obj = new Throws_keyword();

        try {
            obj.p();
        } catch (Exception e) {
            System.out.println("Loi Roi !!!");
        }

        System.out.println("normal flow...");
    }
}
