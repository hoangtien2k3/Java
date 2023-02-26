/*
*   Lý Thuyết:
*
*     => Giao diện Comparator trong java được sử dụng để sắp xếp các đối tượng của lớp do người dùng
*       định nghĩa (user-defined). Giao diện này thuộc về gói java.util và chứa hai phương thức có
*       tên compare(Object obj1,Object obj2) và equals(Object element).


*   Chúng ta có thể sắp xếp các phần tử của:

        + Các đối tượng String.
        + Các đối tượng của lớp Wrapper.
        + Các đối tượng của lớp do người dùng định nghĩa (User-defined).


*   Phương thức compare()

            public int compare(Object obj1,Object obj2)
            => so sánh đối tượng đầu tiên với đối tượng thứ hai.

           + Implement Comparator và override phương thức compare(T obj1, T obj2).


       Example:

                Collections.sort(listStudents, new Comparator<Student_1>() {
                    @Override
                    public int compare(Student_1 o1, Student_1 o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });

* */


package src.java.Collection.Sorting.Comparator;

import java.util.*;

class Student {
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
}


public class Comparator_Java {
    public static void main(String[] args) {
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 24, "Thanh Hóa"));
        listStudents.add(new Student(3, "Phu", 20, "Hòa Bình"));
        listStudents.add(new Student(4, "Quy", 22, "Ninh Bình"));


        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASC: ");
        Collections.sort(listStudents, new Comparator<Student>() { // class anonymous
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()); // so sánh 2 chuỗi trong java
            }
        });


        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

        // sort list student by it's age ASC
        System.out.println("sort list student by it's age ASC: ");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1; // so sánh 2 số trong java
            }
        });

        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

    }
}
