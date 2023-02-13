/*
 *
 *
 * */

package src.main.java.Java_OOP.Java_Object_Class.Method;

import java.util.Scanner; // import function input number and src.main.java.JavaCore.Java_String.String

public class Method_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        //reading value from the user
        int num = scan.nextInt();

        System.out.print("Number: " + num);

    }
}
