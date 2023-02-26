/*
*
*   Object :
*       + Object là một "instance" của class.
*       + Object là một thực thể thế giới thực : như bút, sách, laptop ...
*       + Object là một thực thể vật chất;.
*       + Object được tạo ra bằng từ khóa "new" : Student_1 s1 = new Student_1();
*       + Object được tạo nhiều lần theo yêu cầu.
*       + Object cấp phát bộ nhớ khi nó được tạo.
*       + Object có nhiều các để khởi tạo.
*
*
*   Class:
*       + Lớp là một bản thiết kế hoặc khuôn mẫu mà từ đó các đối tượng được tạo ra.
*       + Lớp là một nhóm các đối tượng giống nhau.
*       + Lớp là một thực thể logic.
*       + Lớp được khai báo bằng từ khóa "class".
*       + Lớp được khai báo một lần.
*       + Lớp không được cấp phát bộ nhớ khi nó được tạo.
*       + Chỉ có một cách để định nghĩa lớp trong java bằng cách sử dụng từ khóa class.
*
* */

package src.java.JavaCore.OOP.JavaOOPsMisc.Object_and_Class;

class Class_Java {
    public String name = "Hoang Anh Tien";
    public int age = 19;
}

public class Difference_Object_Class extends Class_Java {
    public static void main(String[] args) {
        Class_Java Instance = new Class_Java();
        Difference_Object_Class instance = new Difference_Object_Class();

        System.out.println(Instance.name);
        System.out.println(Instance.age);

        System.out.println();

        System.out.println(instance.name);
        System.out.println(instance.age);

        System.out.println();

        System.out.println(new Difference_Object_Class().name);
        System.out.println(new Difference_Object_Class().age);

    }
}
