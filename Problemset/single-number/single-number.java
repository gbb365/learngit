
// @Title: 只出现一次的数字 (Single Number)
// @Author: 15218859676
// @Date: 2020-10-20 20:55:50
// @Runtime: 14 ms
// @Memory: 38.6 MB

class Solution {
    public int singleNumber(int[] nums) {
        /**
            返回只出现一次的那个数字
            
        */
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length ;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int ans = 0;
        for(Integer i : set){
            ans = i;
        }
        return ans;
        
    }
}
