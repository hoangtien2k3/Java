package src.java.Multithread_Programming.Threading.DataRace;

import java.util.stream.IntStream;

/*
    Xử lý hiện tượng Data Race bằng Mutual Exclusion
        + ReentrantLock: là lock và unlock khi truy cập vào resource chung.
        + Synchronize statement hoặc synchronize method.
        + Sử dụng các Atomic variable với cơ chế CAS (atomic operation)
*/
public class SynchronizeMethod {
    private static int COUNTER = 0;

    public static void main(String... args) throws Exception {
        final Runnable increaseCounterFunc = () -> IntStream
                .range(0, 100)
                .forEach(SynchronizeMethod::increaseCounter);

        final Thread first = new Thread(increaseCounterFunc);
        final Thread second = new Thread(increaseCounterFunc);

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(COUNTER);
    }

    private synchronized static void increaseCounter(int i) {
        ++COUNTER;
    }
}
