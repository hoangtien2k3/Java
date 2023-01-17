package LeetCode_Solution.Array;

import java.util.*;

//class Solution_fourSum {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length - 3; i++) {
//            for(int j = i + 1; j < nums.length - 2; j++) {
//                long remaining = target - nums[i] - nums[j];
//                int left = j + 1;
//                int right = nums.length - 1;
//                while(left < right) {
//                    long sum = nums[left] + nums[right];
//                    if( sum == remaining) {
//                        ArrayList<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[left]);
//                        temp.add(nums[right]);
//
//                        if(!ans.contains(temp))
//                            ans.add(temp);
//
//                        left++;
//                        right--;
//                    } else {
//                        if(sum < remaining)
//                            left++;
//                        else
//                            right--;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}

class Solution_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                for(int j = i + 1; j < nums.length - 2; j++){
                    if(j == i + 1 || nums[j] != nums[j - 1]){
                        int left = j + 1;
                        int right = nums.length - 1;
                        long val = (long)(target) - (long)(nums[i]) - (long)nums[j];
                        while(left < right){
                            long sum = (long)nums[left] + (long)nums[right];
                            if(sum == val){
                                list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                while(left < right && nums[left] == nums[left+1]){
                                    left++;
                                }
                                while(left < right && nums[right] == nums[right - 1]){
                                    right--;
                                }
                                left++;
                                right--;
                            } else if(sum < val){
                                left++;
                            } else{
                                right--;
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}

public class fourSum {
    public static void main(String[] args) {
        Solution_fourSum solution = new Solution_fourSum();
        int[] nums = new int[] {2, 2, 2, 2, 2, 10, -10, 0, 0};
        int target = 8;
        List<List<Integer>> ans = solution.fourSum(nums, target);
        System.out.println(ans);
    }
}
