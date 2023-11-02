package src.java.Multithread_Programming.Threading.DataRace;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.stream.IntStream;

/*
    Xử lý hiện tượng Data Race bằng Mutual Exclusion
        + ReentrantLock: là lock và unlock khi truy cập vào resource chung.
        + Synchronize statement hoặc synchronize method.
        + Sử dụng các Atomic variable với cơ chế CAS (atomic operation)
*/
public class ReentrantLock {
    private static int COUNTER = 0;
    private static Lock lock = new java.util.concurrent.locks.ReentrantLock();

    public static void main(String... args) throws Exception {
        final Runnable increaseCounterFunc = () -> IntStream
                .range(0, 100)
                .forEach(ReentrantLock::increaseCounter); // forEach(i -> ReentrantLockExample.increaseCounter(i))

        final Thread first = new Thread(increaseCounterFunc);
        final Thread second = new Thread(increaseCounterFunc);

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(COUNTER);
    }

    private static void increaseCounter(int i) {
        lock.lock();
        try {
            ++COUNTER;
        } finally {
            lock.unlock();
        }
    }
}