/*
*   static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType)
*
*   => Nó được sử dụng để tạo ra một bộ enum chứa tất cả các phần tử trong kiểu phần tử được chỉ định.
*
*
*
* */


package src.java.Collection.Set.EnumSet.EnumSet_Methods;

import java.util.Set;
import java.util.EnumSet;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class allOf {
    public static void main(String[] args) {
        Set<days> set1 = EnumSet.allOf(days.class);

        System.out.println("Elements: " + set1);


    }
}
