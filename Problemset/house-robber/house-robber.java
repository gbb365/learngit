
// @Title: 打家劫舍 (House Robber)
// @Author: 15218859676
// @Date: 2020-12-07 21:45:54
// @Runtime: 0 ms
// @Memory: 35.8 MB

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2 ; i < len; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[len - 1];
    }
}
