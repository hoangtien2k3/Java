/*
*   TreeSet Trong Java:
*       + Lớp TreeSet trong java implements giao diện Set sử dụng cấu trúc cây để lưu trữ các phần tử.
*       + Nó kế thừa lớp AbstractSet và implements giao diện NavigableSet, lớp này được kế thừa từ SortedSet.
*       + Các đối tượng của lớp TreeSet được lưu trữ theo thứ tự tăng dần.
 *
 *
 *  syntax class TreeSet trong Java:
 *
 *              public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
 *
*
* */


package src.java.Collection.Set.SortedSet.TreeSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

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
    public int compareTo(Student student) {
        // sort student's name by ASC
        return this.getName().compareTo(student.getName());
    }
}

public class TreeSet_Java {
    public static void main(String[] args) {
        // init treeSet
        SortedSet<Student> treeSet = new TreeSet<Student>();
        // create students object
        Student student1 = new Student("Tien", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");

        // add students object to treeSet
        // add phần tử vào vị trí cuối cùng.
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student1);

        // show treeSet
        for (Student student : treeSet) {
            System.out.println(student.toString());
        }

        System.out.println();

        Iterator<Student> it = treeSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }

}
