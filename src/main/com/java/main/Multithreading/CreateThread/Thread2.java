/*
   Tạo thread trong java:
       + Bởi extends lớp Thread
       + Bởi implements Runnable interface.
*/

package src.main.com.java.main.Multithreading.CreateThread;

public class Thread2 extends Thread{
    public void run() {
        System.out.println("Multithreading");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread2();
        t1.start();
    }

}
