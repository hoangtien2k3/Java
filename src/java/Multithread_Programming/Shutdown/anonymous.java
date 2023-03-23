package src.java.Multithread_Programming.Shutdown;

public class anonymous {
    public static void main(String[] args) throws Exception {

        Runtime r = Runtime.getRuntime();

        r.addShutdownHook(new Thread() {
            public void run() {
                System.out.println("shut down hook task completed..");
            }
        });

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }
}
