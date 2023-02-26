/*
 *   Private:   Phạm vi truy xuất bên trong class.
 *
 * */

package src.java.JavaCore.OOP.JavaOOPs.Encapsulation.Access_modifier.Private;

class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }
}

public class Private {
    private static String s = "Hoang Anh Tien";

    public static void main(String args[]) {
        A obj = new A();
//        System.out.println(obj.data);//Compile Time Error ( vì bên ngoài class)
//        obj.msg();//Compile Time Error( vì bên ngoài class)

        System.out.println(s);

    }
}
