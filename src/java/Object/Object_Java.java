package src.java.Object;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        return this.age == ((Person) obj).age && this.name.equals(((Person) obj).name);
    }
}

public class Object_Java {
    public static void main(String[] args) {
        Person person1 = new Person("tien", 20);
        Person person2 = new Person("tuan", 19);
        Person person3 = new Person("tien", 20);
        System.out.println(person1.equals(person3));


        String a = "abc";
        String b = "abc";
        System.out.println("a == b: " + a == b);
        System.out.println("a.equals(b): " + a.equals(b));

        String aa = new String("abc");
        String bb = new String("abc");
        System.out.println("aa == bb: " + aa == bb);
        System.out.println("aa.equals(bb): " + aa.equals(bb));



        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.toString(): " + obj1.toString());
        System.out.println("obj2.toString(): " + obj2.toString());


        // vì là đối tượng, nên 2 phương thức này mặc định nó sẽ so sánh địa chỉ ô nhớ.
        // chúng ta có thể định nghĩa lại phương thức equals() để so sánh theo ý muốn.
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1 == obj2: " + (obj1 == obj2));

        System.out.println("obj1.getClass(): " + obj1.getClass());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
    }
}
