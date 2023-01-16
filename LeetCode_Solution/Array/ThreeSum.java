package LeetCode_Solution.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_3Sum {

    // bài này áp dụng kỹ thuật 2 con trỏ để code rất hay và tối ưu code.( độ phức tạp sẽ được giảm xuống )
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        // -1 , 0 , 1 , 2 , -1 , -4
        for(int i = 0 ; i < nums.length - 2 ; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1]) ){
                // (i > 0 && nums[i] != nums[i-1] : điều kiện này để tránh trùng lặp lại bội 3 số đã xét
                int ans = 0 - nums[i];  // a + b + c = 0 => 0 - a = b + c
                int low = i + 1; // tương đương với b là số kế tiếp
                int high = nums.length-1; // tương đương với c là số cuối cùng.

                while(low < high){
                    if(nums[low] + nums[high] == ans){

                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);

                        if(!list.contains(temp))
                            list.add(temp);

                        low++ ;
                        high--;
                    }else{
                        if(nums[low] + nums[high] > ans)
                            high--;
                        else
                            low++;
                    }
                }
            }
        }

        return list;
    }
}

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        Solution_3Sum solution = new Solution_3Sum();
        System.out.println(solution.threeSum(nums));
    }
}
