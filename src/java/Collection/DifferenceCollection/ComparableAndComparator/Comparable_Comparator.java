package src.java.Collection.DifferenceCollection.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Comparable;

class Student implements Comparable<Student> {
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


public class Comparable_Comparator {
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


        // sort list student by it's age ASC
        System.out.println("sort list student by it's age ASC: ");
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });


        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

    }
}
