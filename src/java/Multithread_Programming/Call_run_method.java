/*
    SỰ KHÁC NHAU KHI GỌI PHƯƠNG THỨC RUN() THAY VÌ PHƯƠNG THỨC START() :

        + Khi gọi phương thức run() trực tiếp trong Java, nó sẽ chạy như một phương thức bình thường của một
        lớp chứ không phải là một luồng. Do đó, nó sẽ không được chạy song song với các luồng khác trong
        ứng dụng của bạn và sẽ chạy tuần tự trong luồng chính của ứng dụng.

        + Trong khi đó, khi gọi phương thức start(), nó sẽ tạo một luồng mới và chạy song song với các luồng
        khác trong ứng dụng của bạn.

*/

package src.java.Multithread_Programming;

public class Call_run_method extends Thread{
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
                /*
                    InterruptedException là một ngoại lệ trong Java, nó được ném ra khi một
                    tiến trình đang chạy bị gián đoạn. Khi một tiến trình bị gián đoạn,
                    nó sẽ tạm dừng chạy và ném ra một InterruptedException.
                */
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Call_run_method t1 = new Call_run_method();
        Call_run_method t2 = new Call_run_method();

        t1.run();
        t2.run();
    }
}
