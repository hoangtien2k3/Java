/*
    Shutdown Hook trong java:

        Shutdown Hook là một đối tượng được đăng ký với JVM, cho phép bạn viết một phần mã để được
        chạy trước khi JVM đóng hoặc shutdown. Điều này có thể giúp bạn thực hiện một số tác vụ đặc
        biệt, chẳng hạn như ghi lại trạng thái hoặc đóng các tài nguyên mà JVM sử dụng.


    Để tạo một Shutdown Hook, bạn cần sử dụng phương thức Runtime.getRuntime().addShutdownHook() và
    truyền vào một đối tượng Thread đại diện cho hook. Hook sẽ được gọi khi JVM đóng hoặc bị shutdown.



    Phương thức addShutdownHook(Thread hook):
        + Phương thức addShutdownHook(Thread hook) của lớp RunTime được sử dụng để đăng ký thread
        với Virtual Machine.

            Cú pháp:
                    public void addShutdownHook(Thread hook){}


            Runtime r = Runtime.getRuntime();



    Khi nào JVM đóng lại?
        JVM đóng lại khi:

        - Người dụng nhấn ctrl+c trên command prompt
        - Phương thức System.exit(int) được gọi
        - Người dùng logoff
        - Người dùng shutdown vv.



*/

package src.java.Multithread_Programming.Shutdown;

class MyThread extends Thread {
    public void run() {
        System.out.println("shut down hook task completed..");
    }
}

public class shutdown_hook {
    public static void main(String[] args) throws Exception {

        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }
}
