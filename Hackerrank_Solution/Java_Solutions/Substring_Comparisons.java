/*
*   Explanation 0

    String  has the following lexicographically-ordered substrings of length :
*
*   Ex:
*       welcometojava
*       3
*
*
*       => [ava, com, elc, eto, jav, lco, met, oja, ome, toj, wel]
*
*   Result:
*       =>  ava
*           wel
* */

package Hackerrank_Solution.Java_Solutions;

import java.util.Scanner;

public class Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> a = new java.util.ArrayList<>();

        for(int i = 0; i < s.length() - k + 1; i++){
            a.add(s.substring(i, i + k)); // add 3 ký tự vào 1 nhóm.
        }
        java.util.Collections.sort(a);

        System.out.println(a);

        smallest = a.get(0);
        largest = a.get(a.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
