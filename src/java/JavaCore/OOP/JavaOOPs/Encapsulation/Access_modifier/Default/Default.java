/*
 *   Default: - Phạm vi truy xuất bên trong Package:
 *                  + truy xuất được bên trong class.
 *                  + truy xuất được trong class nằm trong 1 package.
 *
 * */

package src.java.JavaCore.OOP.JavaOOPs.Encapsulation.Access_modifier.Default;

public class Default {
    public static void main(String[] args) {
        Person p = new Person("Hoàng Anh Tiến", 3.6);
        p.print();
    }
}
