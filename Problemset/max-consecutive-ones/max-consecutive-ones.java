
// @Title: 最大连续1的个数 (Max Consecutive Ones)
// @Author: 15218859676
// @Date: 2020-10-23 15:15:15
// @Runtime: 3 ms
// @Memory: 39.8 MB

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        /**
            记录当前为1的个数count，如果为0，让count为0，重新开始计数
            每次遍历的时候都更新最大连续1的个数
        */
        int cur = 0;
        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==1){
                cur++;
            }else{
                cur = 0;
            }
            max = Math.max(max,cur);
        }
        return max;
    }
}
