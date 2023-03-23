/*
    Có thể start một thread hai lần không?
        - Không. Sau khi start một thread, nó không bao giờ có thể được start lại.

        - Nếu bạn làm như vậy, một ngoại lệ IllegalThreadStateException sẽ xảy ra.


    Lưu ý:
        + Nếu bạn muốn chạy một Thread nhiều lần,
        bạn có thể tạo một instance mới của nó và start nó mỗi lần bạn muốn chạy.

*/

package src.java.Multithread_Programming;

public class Start_a_Thread_twice extends Thread {
    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) throws Exception{
        Start_a_Thread_twice t1 = new Start_a_Thread_twice();
        t1.start();
        t1.start();
    }
}
