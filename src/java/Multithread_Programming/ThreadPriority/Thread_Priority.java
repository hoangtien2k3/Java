/*
    Mức ưu tiên của một Thread:

        - Priority trong Java là một tính năng cho phép chúng ta đặt mức độ ưu tiên cho mỗi luồng.
        - Mức độ ưu tiên này sẽ quyết định luồng nào sẽ được chạy trước trong một tình huống
        cần sử dụng nhiều tài nguyên hệ thống.

            + public static int MIN_PRIORITY
            + public static int NORM_PRIORITY
            + public static int MAX_PRIORITY


    + Trong Java, mức độ ưu tiên của mỗi luồng được đặt trong khoảng từ MIN_PRIORITY
    (mức ưu tiên thấp nhất, giá trị là 1) đến MAX_PRIORITY (mức ưu tiên cao nhất, giá trị là 10).

    + Luồng mặc định có mức độ ưu tiên là NORM_PRIORITY (giá trị là 5).




*/


package src.java.Multithread_Programming.ThreadPriority;

public class Thread_Priority extends Thread {
    public void run() {
        System.out.println("running thread name is: " + Thread.currentThread().getName());
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        Thread_Priority m1 = new Thread_Priority();
        Thread_Priority m2 = new Thread_Priority();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY có mức độ ưu tiện cao nhất
        m1.start();
        m2.start();
    }
}
