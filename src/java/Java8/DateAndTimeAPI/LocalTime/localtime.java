package src.java.Java8.DateAndTimeAPI.LocalTime;

import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {

        // Java LocalTime Example: now()
        LocalTime  time = LocalTime .now();
        System.out.println(time);

        // Java LocalTime Example: of()
        time = LocalTime.of(10,43,12);
        System.out.println(time);

        // Java LocalTime Example: minusHours() and minusMinutes()
        LocalTime time1 = LocalTime.of(10,43,12);
        System.out.println(time1);
        LocalTime time2 = time1.minusHours(2);
        LocalTime time3 = time2.minusMinutes(34);
        System.out.println(time3);

        // Java LocalTime Example: plusHours() and plusMinutes()
        LocalTime time11 = LocalTime.of(10,43,12);
        System.out.println(time1);
        LocalTime time22=time11.plusHours(4);
        LocalTime time33=time22.plusMinutes(18);
        System.out.println(time33);

    }
}
