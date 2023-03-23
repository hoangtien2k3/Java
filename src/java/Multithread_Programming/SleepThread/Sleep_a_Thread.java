/*

    Cú pháp của phương thức sleep trong java
    Lớp Thread cung cấp hai phương thức để tạm ngưng một thread:

        + public static void sleep(long miliseconds) throws InterruptedException

        + public static void sleep(long miliseconds, int nanos) throws InterruptedException


*/

package src.java.Multithread_Programming.SleepThread;

public class Sleep_a_Thread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                long start = System.currentTimeMillis();
                Thread.sleep(500);
                System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Sleep_a_Thread t1 = new Sleep_a_Thread();
        Sleep_a_Thread t2 = new Sleep_a_Thread();

        t1.start();
        t2.start();
    }
}
