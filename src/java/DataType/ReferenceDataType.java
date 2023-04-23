package src.java.DataType;

import java.lang.ref.*;

class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

public class ReferenceDataType {
    public static void main(String[] args) {

        // Strong Reference Example
        Person person1 = new Person("Tiến");
        Person person2 = person1;
        System.out.println("Strong Reference : " + person1.getName());


        // Weak Reference Example
        WeakReference<Person> weakRef = new WeakReference<>(new Person("Ronaldo"));
//        System.gc(); // gc: Grabage Collector (bộ nhớ sẽ được giải phóng ngay lập tức khi gọi phương thức này )
        Person person3 = weakRef.get();
        System.out.println("Weak Reference : " + (person3 != null ? person3.getName() : "null"));


        // Soft Reference Example
        SoftReference<Person> softRef = new SoftReference<>(new Person("Messi"));
        System.gc();
        Person person4 = softRef.get();
        System.out.println("Soft Reference : " + (person4 != null ? person4.getName() : "null"));


        // Phantom Reference Example
        ReferenceQueue<Person> queue = new ReferenceQueue<>();
        PhantomReference<Person> phantomRef = new PhantomReference<>(new Person("Neymar"), queue);
        System.gc();
        Reference<? extends Person> ref = queue.poll();
        if (ref == phantomRef) {
            System.out.println("Phantom Reference : Person has been garbage collected");
        }
    }
}
