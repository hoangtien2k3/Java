package src.java.Multithread_Programming.CreateThread;

public class test {
    public static void main(String[] args) {
        // đây là luồng chính
        System.out.println("Start");

        // luồng t
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("Thread 1 > " + i);
                }
            }
        });
        t.start();


        new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Thread 2 > " + i);
            }
        }).start();





        // đây cũng là luồng chính.
        System.out.println("End");
    }
}
