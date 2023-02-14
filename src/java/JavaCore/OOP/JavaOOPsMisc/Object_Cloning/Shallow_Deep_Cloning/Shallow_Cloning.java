/*
*   Shallow Cloning/Copy:
* */

package src.java.JavaCore.OOP.JavaOOPsMisc.Object_Cloning.Shallow_Deep_Cloning;

import java.lang.Cloneable;

class Address {
    String province;
    String district;

    public Address(String province, String district) {
        super();
        this.province = province;
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address [province = " + province + ", district = " + district + "]";
    }
}

class Person implements Cloneable {
    int id;
    String name;
    Address address;

    public Person(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return "Person [id = " + id + ", name = " + name + ", address = " + address + "]";
    }
}

public class Shallow_Cloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Thanh Hóa", "Hòa Bình");
        Person person1 = new Person(1, "GPcoder", address);
        Person person2 = (Person) person1.clone(); // shallow cloning/copy

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println("\nPerson1.Address and Person 2.Address are the same reference: ");
        System.out.println("Person1: " + getObjectAddress(person1));
        System.out.println("Person1.Address: " + getObjectAddress(person1.address));
        System.out.println("Person2: " + getObjectAddress(person2));
        System.out.println("Person2.Address: " + getObjectAddress(person2.address));

        System.out.println("\nAfter changed: ");
        person1.id = 4;
        person1.address.district = "Hoàng Tiến";

        System.out.println(person1);
        System.out.println(person2);
    }

    public static String getObjectAddress(Object obj) {
        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
    }

}
