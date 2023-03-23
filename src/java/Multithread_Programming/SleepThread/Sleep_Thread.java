package src.java.Multithread_Programming.SleepThread;

public class Sleep_Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");
        long startMain = System.currentTimeMillis();
        Thread.sleep(1000);

        // InterruptedException: Nó được ném khi một luồng đang "ngủ" hoặc "chờ" bị gián đoạn bởi một luồng khác.
        Thread t = new Thread(() -> {
            System.out.println("Child thread start");
            try {
                long start = System.currentTimeMillis(); // nó tính thời gian giữa 2 sự kiện
                Thread.sleep(1000);
                System.out.println("Child thread: " + (System.currentTimeMillis() - start));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        System.out.println("Main thread: " + (System.currentTimeMillis() - startMain));
    }
}
