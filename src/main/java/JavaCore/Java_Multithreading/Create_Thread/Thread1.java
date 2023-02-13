/*
   Tạo thread trong java:
       + Bởi extends lớp Thread
       + Bởi implements Runnable interface.
*/

package src.main.java.JavaCore.Java_Multithreading.Create_Thread;

public class Thread1{
    public static void main(String args[]) {
        Runnable task1 = new Student(20, "A");
        Thread t1 = new Thread(task1);

        Runnable task2 = new Student(20, "B");
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

    }
}
