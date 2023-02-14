package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Convariant_Return_Type;

class A1 {
    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A1");
    }
}


// A2 is the child class of A1
class A2 extends A1 {
    @Override
    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A2");
    }
}

// A3 is the child class of A2
class A3 extends A2 {
    @Override
    A1 foo() {
        return this;
    }

    @Override
    void print() {
        System.out.println("Inside the class A3");
    }
}

public class test {
    public static void main(String[] args) {

        new A1().foo().print(); // cách 1: viết tắt

        A1 a1 = new A1();
        a1.foo().print(); // cách 2: viết đúng


        A2 a2 = new A2();
        // we need to do the type casting to make it
        // more clear to reader about the kind of object created
        ((A2) a2.foo()).print();


        A3 a3 = new A3();
        // doing the type casting
        ((A3) a3.foo()).print();

    }


}
