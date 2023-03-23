/*
    => Thread join() là gì?
        + Phương thức join() được sử dụng để đảm bảo cho quá trình thực thi của Thread đang chạy không
        bị gián đoạn bởi các Thread khác.


*/

package src.java.Multithread_Programming.JoinThread;

class MyThread implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Bắt đầu thread: " + t.getName());
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Kết thúc thread:" + t.getName());
    }
}

public class Join_a_thread {
    public static void main(String[]args){
        Thread th1 = new Thread(new MyThread(),"th1");
        Thread th2 = new Thread(new MyThread(),"th2");
        Thread th3 = new Thread(new MyThread(),"th3");
        th1.start();
        th2.start();
        th3.start();
    }
}