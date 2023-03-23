package src.java.Multithread_Programming.ThreadExample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {

            try {
                System.out.println("ThreadOne" + i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
