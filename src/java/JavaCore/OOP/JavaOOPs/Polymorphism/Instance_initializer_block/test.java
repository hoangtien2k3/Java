package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Instance_initializer_block;

class B {
    B() {
        System.out.println("1. parent class constructor invoked"); // được gọi hàm đầu tiên(vì nó là constructor của lớp cha)
    }
}

public class test extends A {
    test() {
        super();
        System.out.println("3. child class constructor invoked"); // được gọi sau cùng. sau Instance Initializer Block
    }
    {
        System.out.println("2. instance initializer block is invoked"); // được gọi tiếp theo sau constructor của lớp cha
    }

    public static void main(String[] args) {
        test t = new test();
    }

}
