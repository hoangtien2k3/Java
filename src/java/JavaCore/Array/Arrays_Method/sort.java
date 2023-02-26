/*
    Sort()

    => Phương thức sort() được sử dụng để sắp xếp các phần tử của một mảng theo thứ tự tăng dần.
    Phương thức này, bên trong sử dụng thuật toán Quicksort để sắp xếp các phần tử có kiểu nguyên thủy
    (primitive type), sử dụng giải thuật MergeSort để sắp xếp các phần tử có kiểu đối tượng (Object).


    Collections.sort hoặc Arrays_Java.sort() objects: sử dụng giải thuật MergeSort.
    ( Bởi vì, MergeSort sắp xếp tương đối nhanh và ổn định với độ phức tạp là O(nlog(n)) )


* */

package src.java.JavaCore.Array.Arrays_Method;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        // An array of byte
        byte[] b = { 51, 22, 8, 37 };
        Arrays.sort(b); // sorts elements of the specified array in ascending order
        System.out.println(Arrays.toString(b)); // Output : [8, 22, 37, 51]

        // An array of short
        short[] s = { 24, 5, 21, 12, 19 };
        Arrays.sort(s);
        System.out.println(Arrays.toString(s)); // Output : [5, 12, 19, 21, 24]

        // An array of int
        int[] i = { 42, 12, 68, 21 };
        Arrays.sort(i);
        System.out.println(Arrays.toString(i)); // Output : [12, 21, 42, 68]

        // An array of long
        long[] l = { 879, 412, 258, 985, 856 };
        Arrays.sort(l);
        System.out.println(Arrays.toString(l)); // Output : [258, 412, 856, 879, 985]

        // An array of double
        double[] d = { 12.5, 87.4, 41.24, 14.9, 55.8 };
        Arrays.sort(d);
        System.out.println(Arrays.toString(d)); // Output : [12.5, 14.9, 41.24, 55.8, 87.4]

        // An array of char
        char[] c = { 'Z', 'B', 'X', 'L', 'b', 'A' };
        Arrays.sort(c);
        System.out.println(Arrays.toString(c)); // Output : [A, B, L, X, Z, b]

        // An array of String
        String[] str = { "welcome", "to", "gpcdoer" };
        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); // Output : [gpcdoer, to, welcome]

        // An array of boolean
        boolean[] bln = { true, false, false, true };
        // Arrays_Java.sort(bln); // Compile time error
        // There is no sort method in Arrays_Java class which sorts boolean type array
    }
}