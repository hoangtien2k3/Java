package JavaCore.Java_Multithreading.Create_Thread;

public class Create_Thread_2 implements Runnable{
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        Create_Thread_2 m1 = new Create_Thread_2();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
