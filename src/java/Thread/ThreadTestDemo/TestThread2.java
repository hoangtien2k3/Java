package Thread.ThreadTestDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread2 implements Runnable {

    private final Lock lock = new ReentrantLock();

    private int tong;

    public TestThread2() {
        this.tong = 1000;
    }

    public void rutTien() throws InterruptedException {
        // cách 1:
        synchronized (this) {
            if (tong > 0) {
                Thread.sleep(1000);
                tong = tong - 1000;
                System.out.println(tong);
            } else {
                System.out.println("Không còn tiền");
            }
        }


        // cách 2:
//        lock.lock();
//        try {
//            if (tong > 0) {
//                Thread.sleep(1000);
//                tong = tong - 1000;
//                System.out.println(tong);
//            } else {
//                System.out.println("Không còn tiền");
//            }
//        } finally {
//            lock.unlock();
//        }

    }

    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread2 t = new TestThread2();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();


    }

}
