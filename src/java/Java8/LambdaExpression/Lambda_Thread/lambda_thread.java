package src.java.Java8.LambdaExpression.Lambda_Thread;

public class lambda_thread {
    public static void main(String[] args) {
        // anonymous class
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();


        // Thread sử dụng biểu thức lambda expression
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();



        // Sử dụng biểu thức Lambda để tạo một luồng
        new Thread(() -> {
            System.out.println("Child Thread");
        }).start();


    }
}
