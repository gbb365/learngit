
// @Title: 最大子序和 (Maximum Subarray)
// @Author: 15218859676
// @Date: 2021-01-14 10:44:15
// @Runtime: 158 ms
// @Memory: 38.7 MB

class Solution {
    public int maxSubArray(int[] nums) {
        //暴力
        int len = nums.length;
        int result = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < len ;i++){
            int count = 0;
            for(int j = i ; j < len ; j++){
                count += nums[j];
                result = result > count ? result : count;
            }
        }
        return result;
    }
}
