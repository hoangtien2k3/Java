package src.java.JavaCore.Array;

import java.util.Scanner;

public class Array_2 {
    public static int[][] getArray_2(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[m][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập m hàng: ");
        int m = input.nextInt();
        System.out.print("Nhập n cột: ");
        int n = input.nextInt();

        int[][] brr = getArray_2(m, n);
        System.out.println("Phần Tử Mảng: ");
        for(int i = 0; i < brr.length; i++) {
            for(int j = 0; j < brr.length; j++) {
                System.out.print(brr[i][j] + "  ");
            }
            System.out.println();
        }


        int[][] crr = brr.clone();
        System.out.print("\nArray Cloning: ");


    }

}