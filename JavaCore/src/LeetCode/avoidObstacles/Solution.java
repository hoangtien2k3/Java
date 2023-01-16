/*
*   You are given an array of integers representing coordinates of obstacles situated on a straight line.

    Assume that you are jumping from the point with coordinate 0 to the right.
*   You are allowed only to make jumps of the same length represented by some integer.

    Find the minimal length of the jump enough to avoid all the obstacles.
*
*
* Example

For inputArray = [5, 3, 6, 7, 9], the output should be
solution(inputArray) = 4.
*
* */

package src.LeetCode.avoidObstacles;

import java.util.Scanner;

public class Solution {

    static int solution1(int[] inputArray) {

        int check = 1;
        boolean fail = true;

        while(fail) {
            check++;
            fail = false;
            for(int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % check == 0) {
                    fail = true;
                    break;
                }
            }
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] inputArray = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("inputArray[%d] = ", i);
            inputArray[i] = scanner.nextInt();
        }

        int result = solution1(inputArray);
        System.out.println("Solution Length: " + result);

    }
}
