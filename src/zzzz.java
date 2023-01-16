package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class zzzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // hinh 1
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // hinh 2
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println("\n");

        // hinh 3
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println("\n");

        // hinh 4
        for(int i = 1; i <= n; i++) {
            System.out.print("1" + " ");
        }
        System.out.print("\n");
        for(int i = 2; i < n ; i++) {
            for(int j = 1; j <= n; j++) {
                if (j == 1 || j == n ) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(n + " ");
        }

    }


}
