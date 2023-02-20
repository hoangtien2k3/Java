/*
*   Từ khóa throw trong java
        Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ cụ thể.
*
*
* */


package src.java.ExceptionHandling.Throw;

public class MyThrow {
    public static void chia2so(int a, int b) throws MyException {
        try {
            int kq = a/b;
            System.out.println(kq);
        } catch(Exception e) {
            throw new MyException("Loi chia cho 0");
        }
    }

    public static void main(String[] args) {
        try {
            chia2so(1, 0);
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }

}
