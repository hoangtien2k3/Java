/*
*   * Mảng trong Java là một trong những cấu trúc dữ liệu trong Java, là một tập hợp các biến
*     cùng kiểu được tham chiếu bằng một tên chung. Mảng bao gồm các vị trí bộ nhớ liền nhau.
*
*
*
* */

package src.java.JavaCore.Array;

import java.util.Scanner;

public class Array_1 {
    public static int[] getArray_1(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n phần tử mảng: ");
        int n = input.nextInt();

        int[] arr = getArray_1(n);
        System.out.print("Phần Tử Mảng: ");
        for(int i : arr) {
            System.out.print(i + "  ");
        }


        // Array Cloning/copy in Java:
        System.out.print("\nArray Cloning/copy in Java: ");
        int[] brr = arr.clone();
        for(int i : brr) {
            System.out.print(i + "  ");
        }

    }

}
