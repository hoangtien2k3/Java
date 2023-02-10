/*
*   => Anonymous Inner Class là một loại Inner Class trong Java mà không có tên.
*   Nó được tạo trực tiếp khi gọi và không cần tạo một đối tượng riêng cho nó.
*
* */


package JavaCore.Java_Inner_Class;

abstract class Shape {
    abstract void draw();
}

interface Printable {
    void print();
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


        // Anonymous Inner Class với JavaCore.Interface
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Printing something");
            }
        };
        printable.print();

    }
}