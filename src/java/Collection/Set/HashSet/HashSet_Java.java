/*
*   * Lớp HashSet trong Java:
*       + HashSet trong java là một lớp kế thừa lớp AbstractSet và triển khai của
*         Set src.java.JavaCore.Interface trong Collections Framework.
*
*       + HashSet được sử dụng để tạo một bộ sưu tập sử dụng bảng băm để lưu trữ.
*         Nó kế thừa lớp AbstractSet và triển khai Set interface.
 *
 *
 *      => hash table lưu giữ thông tin bởi sử dụng một kỹ thuật được gọi là hashing (băm).
 *
 *
 *  * Các điểm quan trọng về lớp HashSet trong java là:

        + HashSet chỉ chứa các phần tử duy nhất, không chấp nhận 2 phần tử trùng nhau.

        + HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là hashing (băm - hash table).

        + HashSet không đảm bảo thứ tự được thêm vào.

        + HashSet cho phép chứa phần tử NULL.

 *
 *
 *  * Khái báo lớp HashSet trong Java:
 *
            public class HashSet<E> extends AbstractSet<E>
                    implements Set<E>, Cloneable, Serializable

*
        Ex:
            public class HashSet<E> extends AbstractSet<E>
            implements Set<E>, Cloneable, java.io.Serializable {

                private transient HashMap<E,Object> map;

                // tao dummy value de lien ket voi doi tuong map
                private static final Object PRESENT = new Object();

                public HashSet() {
                    map = new HashMap<>();
                }

                public HashSet(Collection<? extends E> c) {
                    map = new HashMap<>(Math.max((int) (c.size()/.75f) + 1, 16));
                    addAll(c);
                }

                public HashSet(int initialCapacity, float loadFactor) {
                    map = new HashMap<>(initialCapacity, loadFactor);
                }

                public HashSet(int initialCapacity) {
                    map = new HashMap<>(initialCapacity);
                }

                HashSet(int initialCapacity, float loadFactor, boolean dummy) {
                    map = new LinkedHashMap<>(initialCapacity, loadFactor);
                }
            }


* */


package src.java.Collection.Set.HashSet;

import java.util.Set;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student_1 [id = " + id + ", name = " + name + "]";
    }

}

public class HashSet_Java {
    public static final int NUM_OF_ELEMENT = 5; // static
    public static void main(String[] args) {
        // Create list
        Set<Student> students = new java.util.HashSet<Student>();

        Student student1 = new Student(1, "myname1");
        Student student2 = new Student(2, "myname2");
        Student student3 = new Student(3, "myname3");
        Student student4 = new Student(4, "myname4");
        Student student5 = new Student(5, "myname5");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.add(student2);
        students.add(student3);

        // Show set student
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
