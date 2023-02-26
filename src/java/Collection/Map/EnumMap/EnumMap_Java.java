/*
*   EnumMap trong java Collection:
*      - Lớp EnumMap trong java là một cài đặt chuyên biệt để sử dụng với các enum keys.
*        Nó kế thừa lớp Enum và AbstractMap.
*
*
*   syntax:
*           public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K,V>
                implements Serializable, Cloneable

*
*
* */

package src.java.Collection.Map.EnumMap;

import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.Map;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student_1@name = " + name + ", age = " + age + ", address = " + address;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return 0;
    }
}

public class EnumMap_Java {
    public enum Key {
        One, Two, Three, Four
    };


    public static void main(String args[]) {
        // init enumMap
        EnumMap<Key, Student> enumMap = new EnumMap<Key, Student>(Key.class);

        // add elements to enumMap
        enumMap.put(Key.One, new Student("A", 12, "Hanoi"));
        enumMap.put(Key.Two, new Student("B", 13, "Hanoi"));
        enumMap.put(Key.Three, new Student("C", 15, "Hanoi"));
        enumMap.put(Key.Four, new Student("D", 14, "Hanoi"));

        // show enumMap
        for (Map.Entry<Key, Student> map : enumMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}