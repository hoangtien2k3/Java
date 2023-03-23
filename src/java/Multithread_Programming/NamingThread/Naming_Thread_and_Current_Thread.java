/*
    Đặt tên cho Thread:
    - Lớp Thread cung cấp các phương thức để thay đổi và lấy ra tên cho một thread.

        + public String getName():      được sử dụng để trả về tên của một thread.
        + public void setName(String name):     được sử dụng để thay đổi tên của một thread.



    Thread hiện tại:
    - Phương thức currentThread() trả về một tham chiếu của thread hiện đang thực thi.



*/

package src.java.Multithread_Programming.NamingThread;

public class Naming_Thread_and_Current_Thread extends Thread {
    public void run(){
//        System.out.println("running...");

        // trả về tên của luồng đang chạy (là luồng gọi phương thức này).
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Naming_Thread_and_Current_Thread t1 = new Naming_Thread_and_Current_Thread();
        Naming_Thread_and_Current_Thread t2 = new Naming_Thread_and_Current_Thread();
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("hoangtien2k3");
        System.out.println("After changing name of t1: " + t1.getName());
    }

}
