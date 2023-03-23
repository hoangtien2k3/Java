package src.java.Multithread_Programming.ThreadScheduler;

public class Thread_scheduler extends Thread {
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        Thread_scheduler t1 = new Thread_scheduler();
        Thread_scheduler t2 = new Thread_scheduler();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}

