/*
*   49. Group Anagrams
*
* */

package LeetCode_Solution.Array;


import java.util.*;

class Solution_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> s = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String e : strs){
            char ch[] = e.toCharArray(); // toCharArray : dùng để chuyển chuỗi thành mảng ky tự.

            Arrays.sort(ch); // sắp xếp mảng ký tự đó.
            String str = new String(ch); // có thể chuyền mảng ký tự vào chuỗi.

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(e);
            // [[eat, tea, ate], [tan, nat], [bat]]
        }

        s.addAll(map.values());
        return s;
    }
}

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        Solution_Group_Anagrams solution = new Solution_Group_Anagrams();
        System.out.println(solution.groupAnagrams(s));

    }
}
