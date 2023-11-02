package src.java.Multithread_Programming.Threading.RaceCondition;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RaceCondition1 {

    public static void main(String... args) throws InterruptedException {
        final List<Shopper1> shoppers = IntStream.range(0, 6)
                .mapToObj(Shopper1::new)
                .collect(Collectors.toList());
        // Chạy toàn bộ các thread
        shoppers.forEach(Thread::start);
        // Chờ tất cả thread hoàn thành
        for (Shopper1 shopper : shoppers) {
            shopper.join();
        }
        System.out.println("Total packs: " + Shopper1.MASK_PACK_COUNT);
    }
}

class Shopper1 extends Thread {

    static int MASK_PACK_COUNT = 1;
    static CyclicBarrier BARRIER = new CyclicBarrier(6);

    Shopper1(int i) {
        setName(i % 2 == 0 ? "Husband" : "Wife");
    }

    @Override
    public void run() {
        addMask(getName());
    }

    static void addMask(String threadName) {
        if ("husband".equalsIgnoreCase(threadName)) {
            synchronized (Shopper1.class) {
                MASK_PACK_COUNT += 1;
                System.out.println("Husband adds 1 pack");
            }
            waitAtBarrier();
            return;
        }
        waitAtBarrier();
        synchronized (Shopper1.class) {
            MASK_PACK_COUNT *= 3;
            System.out.println("Wife multiple 3 times");
        }
    }

    static void waitAtBarrier() {
        try {
            BARRIER.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}