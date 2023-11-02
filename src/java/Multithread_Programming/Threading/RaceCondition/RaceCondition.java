package src.java.Multithread_Programming.Threading.RaceCondition;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RaceCondition {
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

class Shopper extends Thread {

    static int MASK_PACK_COUNT = 1;

    Shopper(int i) {
        setName(i % 2 == 0 ? "Husband" : "Wife");
    }

    @Override
    public void run() {
        addMask(getName());
    }

    static synchronized void addMask(String threadName) {
        if ("Husband".equals(threadName)) {
            MASK_PACK_COUNT += 1;
            System.out.println("Husband adds 1 pack");
            return;
        }
        MASK_PACK_COUNT *= 3;
        System.out.println("Wife multiple 3 times");
    }
}
