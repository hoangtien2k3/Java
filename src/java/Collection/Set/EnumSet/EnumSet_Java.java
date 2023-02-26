/*
    Lớp EnumSet trong java là một cài đặt chuyên biệt để sử dụng với các kiểu enum.
    Nó kế thừa lớp Enum và lớp AbstractSet.


*   syntax:
            public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E>
                implements Cloneable, Serializable


* */

package src.java.Collection.Set.EnumSet;

import java.util.Set;
import java.util.EnumSet;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSet_Java {
    public static void main(String[] args) {

        Set<days> set = EnumSet.of(days.MONDAY, days.TUESDAY, days.WEDNESDAY);
        System.out.println("Elements set: " + set);


        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Elements set1: " + set1);





    }
}