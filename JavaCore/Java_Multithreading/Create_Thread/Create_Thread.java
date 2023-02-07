/*
   Tạo thread trong java:
       + Bởi extends lớp Thread
       + Bởi implements Runnable interface.



* */

package JavaCore.Java_Multithreading.Create_Thread;

public class Create_Thread extends Thread{
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        Create_Thread t1 = new Create_Thread();
        t1.start();
    }
}
