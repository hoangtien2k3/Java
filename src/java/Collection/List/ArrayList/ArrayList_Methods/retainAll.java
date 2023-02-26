/*
 *   Syntax:
 *           public boolean retainAll(Collection c)
 *
 *   => Được sử dụng để xóa tất cả các thành phần từ ArrayList gọi
 *      phương thức này ngoại trừ ArrayList được chỉ định.
 *
 * */


package src.java.Collection.List.ArrayList.ArrayList_Methods;

import java.util.ArrayList;
import java.util.Iterator;

public class retainAll {
    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println(al);


        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        System.out.println(al2);


        al.retainAll(al2);
        System.out.println(al.retainAll(al2));


        System.out.println("Iterating the elements after retaining the elements of al2");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }

}
