package LeetCode_Solution.Array;

class Solution_1 {
    public int maxArea(int[] height) {
        // kỹ thuật dùng dịch 2 con trỏ.
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int max_area = 0;
        while(a_pointer < b_pointer) {
            if(height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }

        return max_area;
    }
}

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        Solution_1 solution = new Solution_1();
        System.out.println(solution.maxArea(height));
    }
}
