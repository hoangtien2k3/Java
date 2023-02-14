/*
 *
 *
 * */

package src.java.JavaCore.OOP.JavaObjectClass.Method;

import java.util.Scanner; // import function input number and src.java.JavaCore.Java_String.String

public class Method_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        //reading value from the user
        int num = scan.nextInt();

        System.out.print("Number: " + num);

    }
}
