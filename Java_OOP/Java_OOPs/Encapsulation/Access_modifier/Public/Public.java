/*
*   Public:  Phạm vi truy xuất bên trong Project (truy xuất mọi nơi bên trong Project)

* */


package Java_OOP.Java_OOPs.Encapsulation.Access_modifier.Public;

class Animal {
    public int age;
}

public class Public {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 10;

        System.out.println("Age: " + animal.age);
    }
}
