package src.java.Generic;

class MyClass {}
class MySubClass extends MyClass {}

public class main {
    public <T extends MyClass> void printMyClass(T t) {
        System.out.println(t.getClass().getName()); // Reflection
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        MySubClass mySubObj = new MySubClass();

        main obj = new main();
        obj.printMyClass(myObj);
        obj.printMyClass(mySubObj);
    }
}