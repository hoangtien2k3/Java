/*
   => Để sắp xếp các phần tử của mảng, chúng ta sử dụng lớp tiện ích  Arrays_Java.sort().

    + Arrays_Java.sort(arr) : Sắp xếp tất cả các phần tử của mảng tăng dần

    + Arrays_Java.sort(arr, fromIndex, toIndex) : Sắp xếp một phần của mảng

    + Arrays_Java.parallelSort.sort(arr) :
        Sắp xếp tất cả các phần tử của mảng theo cách xử lý song song.
        Phương thức này chia nhỏ một mảng thành nhiều mảng con và thực hiện sắp xếp trên các mảng con
        này một cách song song trên các luồng (Thread) khác nhau, sau đó merge lại để có một mảng được
        sắp xếp hoàn chình.

    + Arrays_Java.parallelSort.sort(arr, fromIndex, toIndex) : Sắp xếp một phần của mảng theo cách xử lý song song.


* */

package src.java.Sorting.Sort;

public class Arrays_Java {
    public static final int NUMBERS[] = { 5, 1, 2, 4, 3, 6, 7, 9, 8 };

    public static void main(String[] args) {
        // Sorting Complete Array
        int arr1[] = java.util.Arrays.copyOf(NUMBERS, NUMBERS.length);
        java.util.Arrays.sort(arr1);
        System.out.println(java.util.Arrays.toString(arr1));
        // => [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Sorting Part of an Array
        int arr2[] = java.util.Arrays.copyOf(NUMBERS, NUMBERS.length);
        java.util.Arrays.sort(arr2, 2, 5);
        System.out.println(java.util.Arrays.toString(arr2));
        // => [5, 1, 2, 3, 4, 6, 7, 9, 8]

        // Java 8 parallelSort
        int arr3[] = java.util.Arrays.copyOf(NUMBERS, NUMBERS.length);
        java.util.Arrays.parallelSort(arr3);
        System.out.println(java.util.Arrays.toString(arr3));
        // => [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
