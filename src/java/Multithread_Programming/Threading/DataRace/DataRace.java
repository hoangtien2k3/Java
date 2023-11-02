package src.java.Multithread_Programming.Threading.DataRace;

import java.util.stream.IntStream;


/*
    - Xảy ra hiện tượng Data Race: khi mà 2 hoặc nhiều Thread cùng truy cập vào 1 resource chung (share resource)
    và có 1 thread thay đổi giá trị trong share resource đó.
*/
public class DataRace {

    private static int COUNTER = 0;

    public static void main(String... args) throws Exception {

        final Runnable increaseCounterFunc = () -> IntStream
                .range(0, 100)
                .forEach(DataRace::increaseCounter);

        final Thread first = new Thread(increaseCounterFunc);
        final Thread second = new Thread(increaseCounterFunc);

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(COUNTER);
    }

    private static void increaseCounter(int i) {
        ++COUNTER;
    }

}