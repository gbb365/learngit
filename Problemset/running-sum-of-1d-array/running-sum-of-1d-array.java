
// @Title: 一维数组的动态和 (Running Sum of 1d Array)
// @Author: 15218859676
// @Date: 2020-08-13 11:32:21
// @Runtime: 0 ms
// @Memory: 39.9 MB

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++){
            nums[i]+= nums[i-1];
        }
        return nums;
    }
}
