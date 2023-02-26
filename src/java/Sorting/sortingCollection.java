/*

    Chúng ta có thể sắp xếp các phần tử của:
*       + Các đối tượng String.
        + Các đối tượng của lớp Wrapper.
        + Các đối tượng của lớp do người dùng định nghĩa (User-defined).
*
*

    Lớp Collections trong java cung cấp các phương thức static để sắp xếp các phần tử của collection.

        + Collections.sort(list)

        + Collections.sort(list, new Comparator<T>())





* */


package src.java.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // getter & setter
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student_1@id = " + id + ", name = " + name + ",age = " + age + ", address = " + address;
    }
}

public class sortingCollection {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));

        // Anonymous sort list student
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
