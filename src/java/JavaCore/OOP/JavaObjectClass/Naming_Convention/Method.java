/*
*   syntax:
*           class Employee
            {
                    // method
                void draw()
                {
                    //code snippet
                }
            }
*
* */

package src.java.JavaCore.OOP.JavaObjectClass.Naming_Convention;

import java.util.Scanner;
class Solution1 {
    public int Print(int[] arr) { // phương thức
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        Solution1 newClass = new Solution1();
        int sum = newClass.Print(arr);

        System.out.println("Sum: " + sum);

    }

}
