/*
    Thread group trong java:

        + Java cung cấp một cách thuận tiện để nhóm nhiều thread trong một đối tượng duy nhất.
        Bằng cách đó, chúng ta có thể suspend, resume hoặc interrupt một nhóm các thread bằng
        việc gọi một phương thức duy nhất.


    Các phương thức quan trọng của lớp ThreadGroup:

        1)	int activeCount()	Trả về số no. của các thread đang chạy trong nhóm hiện tại.
        2)	int activeGroupCount()	Trả về số no. của nhóm active trong nhóm thread này.
        3)	void destroy()	Phá hủy nhóm thread này và tất cả các nhóm con của nó.
        4)	String getName()	Trả về tên của nhóm này.
        5)	ThreadGroup getParent()	Trả lại nhóm cha của nhóm này.
        6)	void interrupt()	Ngắt tất cả các thread của nhóm này.
        7)	void list()	In thông tin của nhóm này tới console tiêu chuẩn.



    Example:

        ThreadGroup tg1 = new ThreadGroup("Group A");
        Thread t1 = new Thread(tg1,new MyRunnable(),"one");
        Thread t2 = new Thread(tg1,new MyRunnable(),"two");
        Thread t3 = new Thread(tg1,new MyRunnable(),"three");



*/

package src.java.Multithread_Programming.ThreadGroup;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

class MyRunnableWithException implements Runnable {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        throw new RuntimeException("Test Exception");
    }
}

public class Thread_group {
    public static void main(String[] args) {
        // Create a ThreadGroup
        ThreadGroup group = new ThreadGroup("myGroup") {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Thread " + t.getName() + " throws exception: " + e);
                interrupt();
            }
        };

        // Create a Thread
        Thread t1 = new Thread(group, new MyRunnable(), "thread1");
        Thread t2 = new Thread(group, new MyRunnableWithException(), "thread2");
        Thread t3 = new Thread(group, new MyRunnable(), "thread3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}


