/*
        public class HashSet<E> extends AbstractSet<E>
            implements Set<E>, Cloneable, java.io.Serializable {

            private transient HashMap<E,Object> map;

            // tao dummy value de lien ket voi doi tuong map
            private static final Object PRESENT = new Object();

            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
            }

            public boolean remove(Object o) {
                return map.remove(o)==PRESENT;
            }
        }

* */

package src.java.Collection.Set.HashSet.HastSet_Methods;

import java.util.HashSet;

public class remove {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: " + set);

        //Removing specific element from HashSet
        set.remove("Ravi"); // loại bỏ "Ravi" khỏi HashSet
        System.out.println("After invoking remove(object) method: "+set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);

        //Removing all the new elements from HashSet
        set.removeAll(set1); // loại bỏ tất cả các phần tủ của set1
        System.out.println("After invoking removeAll() method: "+set);

        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay")); // loại bỏ "Vijay" bằng removeIf
        System.out.println("After invoking removeIf() method: "+set);

        //Removing all the elements available in the set
        set.clear(); // loại bỏ tất cả các phần tử khỏi HashSet
        System.out.println("After invoking clear() method: "+set);

    }
}
