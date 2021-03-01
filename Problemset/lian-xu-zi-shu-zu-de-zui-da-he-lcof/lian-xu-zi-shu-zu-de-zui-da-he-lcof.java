
// @Title: 连续子数组的最大和 (连续子数组的最大和  LCOF)
// @Author: 15218859676
// @Date: 2021-01-14 11:10:49
// @Runtime: 7 ms
// @Memory: 45.3 MB

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i = 1 ;i < len ; i++){
            if(dp[i-1] > 0){
                dp[i] = dp[i-1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
        }
        Arrays.sort(dp);
        return dp[len - 1];
    }
}
