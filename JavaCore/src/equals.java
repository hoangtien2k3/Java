package src;

class Student {
    public int id;
    public String name;
    public String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Student) obj).id;
    }
}

public class equals {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "Hoang anh tien", "Thanh Hoa");
        Student s2 = new Student(1000, "Hoang anh tien", "Thanh Hoa");

        System.out.println(s1 == s2); // so sánh s1 và s2 là so sánh địa chỉ, chứ không phải là so sánh các thuộc tính bên trong đối tượng

        System.out.println(s1.equals(s2)); // dùng phương thức equals có sẵn trong object để so sánh thuộc tính id

    }
}
