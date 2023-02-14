package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Instance_initializer_block;

class A{
    A(){
        System.out.println("1. _parent class constructor invoked");
    }
}

public class test1 extends A {

    test1() {
        super();
        System.out.println("3. _child class constructor invoked");
    }

    test1(int a) {
        super();
        System.out.println("3. _child class constructor invoked - " + a);
    }
    {
        System.out.println("2. _instance initializer block is invoked");
    }

    public static void main(String[] args) {
        test1 t1 = new test1();
        test1 t2 = new test1(10);
    }
}
