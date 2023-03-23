/*
    Thread Pool trong Java:

        + Thread pool trong java đại diện cho một nhóm các luồng đang chờ đợi công việc
        và tái sử dụng nhiều lần.

    - Mục đích của Thread Pool là giảm thời gian tạo và hủy luồng, tăng hiệu suất và giảm chi phí tài nguyên.



    <=> Ưu điểm của Thread Pool trong java:
            - Hiệu năng tốt hơn: Tiết kiệm thời gian vì không cần phải tạo thread mới.


*/

package src.java.Multithread_Programming.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage(); // được gọi để xử lý công việc và sleep trong 2 giây.
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread_Pool {
    public static void main(String[] args) {
        // tạo một pool chứa 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5); // tạo một pool chứa 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            // call phương thức execute của ExecutorService
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads !!!");

        /*
            Mục đích của Thread Pool là giảm chi phí tạo và hủy thread, tăng hiệu suất và
            cải thiện tính dễ dàng quản lý của việc chạy các công việc trên nhiều thread.
        */

    }
}
