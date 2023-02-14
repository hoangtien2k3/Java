/*
*   * Recursion in Java:
*       => Recursion in java is a process in which a method calls itself continuously.
*          A method in java that calls itself is called recursive method.
*
*
*       syntax:
                returntype methodname(){
                    // code to be executed
                    methodname(); //calling same method
                }
* */


package src.java.JavaCore.OOP.JavaOOPsMisc.Java_Recursion;

import java.util.Scanner;

public class Java_Recursion {
    static int factorial(int n){
        if (n == 1)
            return 1;
        return(n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = scanner.nextInt();
        System.out.println("Factorial of n! = " + factorial(n));
    }
}
