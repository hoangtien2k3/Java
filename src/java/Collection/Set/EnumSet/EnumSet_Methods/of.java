/*
*   static <E extends Enum<E>> EnumSet<E> of(E e)
*
*   => Nó được sử dụng để tạo một bộ enum ban đầu có chứa các phần tử được chỉ định.
*
* */

package src.java.Collection.Set.EnumSet.EnumSet_Methods;

import java.util.Set;
import java.util.EnumSet;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class of {
    public static void main(String[] args) {
        Set<Day> set1 = EnumSet.of(Day.FRIDAY, Day.MONDAY, Day.SATURDAY);

        System.out.println("Elements: " + set1);

    }
}
