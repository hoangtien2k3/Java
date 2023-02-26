/*
    => Từ khóa throw trong java được sử dụng để ném ra một ngoại lệ rõ ràng.
       + Ngoại lệ checked không được truyền ra nếu chỉ sử dụng từ khóa throw.

*   Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ (exception) cụ thể.
*       + Chúng ta có thể ném một trong hai ngoại lệ checked hoặc unchecked trong java bằng từ khóa throw.
*       + Từ khóa throw chủ yếu được sử dụng để ném ngoại lệ tùy chỉnh (ngoại lệ do người dùng tự định nghĩa).
*
* */


package src.java.ExceptionHandling.Throw;

public class MyException extends Exception {
    private String error;

    public MyException(String str) {
        super();
        this.error = str;
    }

    public String getError() {
        return error;
    }

    public void setError() {
        this.error = error;
    }

}
