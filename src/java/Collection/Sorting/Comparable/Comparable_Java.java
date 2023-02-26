/*
*     Lý Thuyết:
*           + Giao diện Comparable trong java được sử dụng để sắp xếp các đối tượng của lớp do người
*           dùng định nghĩa (user-defined).
*
*           + Giao diện này thuộc về gói java.lang và chỉ chứa một phương thức có tên compareTo(Object).
*
*
*
*       Chúng ta có thể sắp xếp các phần tử của:

            + Các đối tượng String.
            + Các đối tượng của lớp Wrapper.
            + Các đối tượng của lớp do người dùng định nghĩa (User-defined).
*
*
*
*       Phương thức compareTo(Object obj):
*
                    public int compareTo (Object obj)

                => được sử dụng để so sánh đối tượng hiện tại với đối tượng được chỉ định.
*
*
*           + Implement Comparable và override phương thức compareTo(T obj).
*
* */

package src.java.Collection.Sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student() {}
    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // getter & setter
    @Override
    public String toString() {
        return "Student_1@id = " + id + ",name = " + name + ",age = " + age + ",address = " + address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName()); // sắp xếp theo tên ( bảng chữ cái )
    }

}

public class Comparable_Java {

    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();

        // add students to list
        listStudents.add(new Student(1, "Tien", 25, "Hanoi"));
        listStudents.add(new Student(5, "Chung", 19, "Hanoi"));
        listStudents.add(new Student(6, "Hang", 12, "Hanoi"));
        listStudents.add(new Student(2, "Quy", 22, "Hanoi"));

        // sort list student
        Collections.sort(listStudents); // Comparable theo name.

        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

    }

}
