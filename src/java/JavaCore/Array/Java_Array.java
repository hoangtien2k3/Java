/*
*   There are two types of array.
        + Single Dimensional Array_1: mảng 1 chiều
        + Multidimensional Array_1: mảng 2 chiều
*
*
*   syntax:
           - Single Array_1 in Java:
                + dataType[] arr;
                + dataType []arr;
                + dataType arr[];

                => dataType[] arr = new datatype[size];


           - Multidimensional Array_1 in Java:
                + dataType[][] arrayRefVar; (or)
                + dataType [][]arrayRefVar; (or)
                + dataType arrayRefVar[][]; (or)
                + dataType []arrayRefVar[];

            => int[][] arr = new int[][];

*    Array_1 : thì chỉ có 1 phương thức "length"
*
*
*
* */

package src.java.JavaCore.Array;

public class Java_Array {

    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
    }

    static int[] getArray() {
        return new int[]{33, 45, 12, 29, -89};
    }


    public static void main(String[] args) {

        // Mảng 1 chiều.
        printArray(new int[]{10, 22, 44, 66}); //passing anonymous array to method



        System.out.println("\n\nDung Vong Lap Thuong: ");
        int[] a = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }




        System.out.println("\n\nDung Vong Lap For Each: ");
        for (int i : a) { // for each
            System.out.print(i + " ");
        }




        System.out.println("\n\nReturn Array_1 in Java; ");
        int[] brr = getArray(); // return array.
        for (int i : brr) {
            System.out.print(i + " ");
        }




        System.out.println("\n\nMang 2 Chieu: ");
        // Mảng 2 chiều:
        int[][] crr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }




        System.out.println("\nMảng đa chiều Java: ");
        // Mảng đa chiều: Jagged Array_1 in Java
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];





        //initializing a jagged array
        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;




        //printing the data of a jagged array
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//new line
        }




        System.out.println("\nCopy Array_1 in Java: ");
        // Copy Array_1 in Java:
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));

    }

}
