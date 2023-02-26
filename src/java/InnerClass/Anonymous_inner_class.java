/*
*   => Anonymous Inner Class là một loại Inner Class trong Java mà không có tên.
*   Nó được tạo trực tiếp khi gọi và không cần tạo một đối tượng riêng cho nó.
*
* */


package src.java.InnerClass;

abstract class Shape {
    abstract void draw();
}

interface Printable {
    public void print();
}

class Main {
    public static void main(String[] args) {
        // Anonymous Inner Class với Abstract class
        Shape shape = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a shape");
            }
        };
        shape.draw();


        // Anonymous Inner Class với src.java.JavaCore.Interface
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Printing something");
            }
        };
        printable.print();



        // Lambda Expression trong java
        Runnable shape1 = () -> {
            System.out.println("Drawing a shape1");
        };
        Thread t1 = new Thread(shape1);
        t1.start();


    }
}