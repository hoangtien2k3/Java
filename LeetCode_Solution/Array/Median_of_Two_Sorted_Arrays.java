package LeetCode_Solution.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution { // java
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
            arrlist.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++)
            arrlist.add(nums2[i]);
        Collections.sort(arrlist, (o1, o2) -> o1.compareTo(o2));
        int n = arrlist.size();
        return (n%2==0)?(double)(arrlist.get((n/2)-1)+arrlist.get(n/2))/2:(double)(arrlist.get(n/2));
    }
}

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(nums1, nums2));
    }
}
