package src.java.Multithread_Programming.JoinThread;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> {
            System.out.println("Thread A started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread A finished");
        });

        Thread threadB = new Thread(() -> {
            System.out.println("Thread B started");
            try {
                threadA.join(); // Phương thức join đảm bảo rằng luồng B sẽ chờ cho đến khi luồng A hoàn thành.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread B finished");
        });

        threadA.start();
        threadB.start();
    }
}
