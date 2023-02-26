/*
*       - Khối Try Catch trong Java được sử dụng để nhằm xử lý các ngoại lệ được đưa ra
*       và giúp chương trình tránh việc kết thúc bất thường của chương trình.
*
*
*       Khi thực thi một đoạn code Java nào đó, các lỗi khác nhau có thể xảy ra như:

            Lỗi do chính coder tạo ra
            Lỗi cú pháp
            Lỗi logic
            ... những điều mà chúng ta có thể không lường trước.
*
*
*   syntax:
*           + try - catch:
    *               try {
                        // code có thể ném ra ngoại lệ
                    } catch(Exception_class_Name ex) {
                        // code xử lý ngoại lệ
                    }
*
*           + try - finally:
                    try {
                        // code có thể ném ra ngoại lệ
                    } finally {
                        // code trong khối này luôn được thực thi
                    }
*
*           + try - catch - finally:
    *               try {
                        // code có thể ném ra ngoại lệ
                    } catch(Exception_class_Name_1 ex) {
                        // code xử lý ngoại lệ 1
                    } catch(Exception_class_Name_2 ex) {
                        // code xử lý ngoại lệ 2
                    } catch(Exception_class_Name_n ex) {
                        // code xử lý ngoại lệ n
                    } finally {
                        // code trong khối này luôn được thực thi
                    }

* */

/*
*   - Các ngoại lệ kiểu Checked Exceptions phổ biến:

        + IOException: Ngoại lệ liên quan đến file input / output
        + SQLException: Ngoại lệ liên quan đến cú pháp SQL
        + DataAccessException: Ngoại lệ liên quan đến việc truy cập CSDL
        + ClassNotFoundException: Bị ném khi JVM không thể tìm thấy một lớp mà nó cần, do lỗi dòng lệnh, sự cố đường dẫn hoặc tệp, class bị thiếu...
        + InstantiationException: Ngoại lệ khi cố gắng tạo đối tượng của một abstract class hoặc interface
*
*
*   - Các ngoại lệ kiểu Unchecked Exceptions phổ biến:

        + NullPointerException: Ngoại lệ bị ném ra khi cố gắng truy cập một đối tượng có biến tham chiếu có giá trị hiện tại là null
        + ArrayIndexOutOfBound: Ngoại lệ khi cố gắng truy cập một phần tử vượt quá độ dài của mảng
        + IllegalArgumentException: Ngoại lệ bị ném ra khi một phương thức nhận được một đối số được định dạng khác với phương thức mong đợi.
        + IllegalStateException: Ngoại lệ bị ném ra khi trạng thái của môi trường không phù hợp với hoạt động cố gắng thực hiện, ví dụ: Sử dụng Scanner đã bị đóng.
        + NumberFormatException: Ngoại lệ bị ném khi một phương thức chuyển đổi một Chuỗi thành số nhưng không thể chuyển đổi.
        + ArithmeticException: Lỗi số học, chẳng hạn như chia cho 0.
*
*
* */


package src.java.JavaCore.TryCatch;

public class try_catch {
    public static void main(String[] args) {
        try {
            int data = 5 / 0;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }
        System.out.println("Finished!");

    }

}
