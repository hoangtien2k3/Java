
// Reference Copy

package src.java.JavaCore.OOP.JavaOOPsMisc.Object_Cloning;

class Student {
    int id;
    String name;

    Student() {}
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Student_1 [id = " + id + ", name = " + name + "]");
    }

}

public class ObjectCloningExample {

    public static void main(String[] args) {

        Student s1 = new Student(12042003, "tiencoder");
        Student s2 = (Student) s1;
        s1.show();
        s2.show();

//        Student_1 k1 = new Student_1(1234, "Tiến Coder");
//        Student_1 k2 = new Student_1();
//        k2.id = k1.id;
//        k2.name = k1.name;

        System.out.println("\ns1 and s2 are the same reference: ");
        System.out.println(s1); // in ra địa chỉ tham chiếu.
        System.out.println(s2); // in ra địa chỉ tham chiếu.

        System.out.println("\nAfter changed: ");
        s1.id = 12; // đối tượng s1 thay đổi giá trị, thì đối tượng s2(đối tượng copy) cũng thay đổi theo, do cùng tham chiếu tới 1 vùng nhớ.
        s1.show();
        s2.show();
    }

}
