/*
   Daemon Thread in Java:

        + Daemon thread là một loại luồng trong Java, được sử dụng để thực hiện các nhiệm vụ hỗ
        trợ cho các luồng khác trong chương trình.


    Các phương thức của luồng hiểm:
        1)	public void setDaemon(boolean status)	:  Được sử dụng để đánh dấu luồng hiện tại là
                                                       luồng hiểm hoặc luồng người dùng.

        2)	public boolean isDaemon() : 	Được sử dụng để kiểm tra xem luồng hiện tại có phải
                                            là luồng hiểm không.



    luồng giám sát hết thời gian hoạt động của chương trình có thể được xác định là một luồng Daemon.
    Nếu tất cả các luồng chính trong chương trình đã kết thúc, JVM sẽ tự động đóng luồng Daemon.



    Lưu ý: Mặc định, luồng được tạo bởi các lớp con của Thread đều là luồng user.

*/

package src.java.Multithread_Programming.DaemonThread;

public class daemon_thread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {    // check luong hiem
            System.out.println("Luồng hiến hoạt động");
        } else {
            System.out.println("Luồng người dùng hoạt động");
        }
    }

    public static void main(String[] args) {
        daemon_thread t1 = new daemon_thread(); // tao thread
        daemon_thread t2 = new daemon_thread();
        daemon_thread t3 = new daemon_thread();

        t1.setDaemon(true); // cài đặt t1 là luống hiếm

        t1.start(); // start cac thread
        t2.start(); // luồng người dùng
        t3.start(); // luồng người dùng
    }
}
