package src.java.JavaCore.Static;

class Student {
    private String name;
    private int age;

    public static int numberOfStudent; // public static int numberOfStudent = 0; (khai baó giá trị)
    /*
    *   biến static không khởi tạo giá trị thì mặc định giá trị đó là default
    *
    *   boolean : false
    *   src.java.JavaCore.Java_String.String: NULL
    *   number = 0;
    *
    * */

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Manh", 19);
        Student s2 = new Student("Tien", 19);
        Student s3 = new Student("Chung", 24);
        System.out.println("NumberOfStudent: " + Student.numberOfStudent);
    }
}
