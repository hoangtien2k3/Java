package src.java.Multithread_Programming.ThreadExample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                System.out.println("ThreadTwo > " + 0);
                Thread.sleep(1000); // dừng 1 giây.
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
