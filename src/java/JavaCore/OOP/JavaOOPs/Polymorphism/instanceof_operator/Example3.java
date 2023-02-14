
// sử dụng toán tử instanceof để xác định kiểu phần tử của mảng

package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.instanceof_operator;

public class Example3 {
    public static void main(String[] args) {
        Object[] objArray = new Object[4];
        objArray[0] = "hello";
        objArray[1] = 1000L;
        objArray[2] = 20;
        objArray[3] = 'c';

        for (int i = 0; i < objArray.length; i++) {
            if (objArray[i] instanceof Integer) {
                System.out.println("kieu integer: " + objArray[i]);
            } else if (objArray[i] instanceof Long) {
                System.out.println("kieu long: " + objArray[i]);
            } else if (objArray[i] instanceof Character) {
                System.out.println("kieu char: " + objArray[i]);
            } else {
                System.out.println("kieu khac: " + objArray[i]);
            }
        }

    }
}
