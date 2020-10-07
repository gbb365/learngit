
// @Title: 最大子序和 (Maximum Subarray)
// @Author: 15218859676
// @Date: 2020-10-07 21:58:52
// @Runtime: 1 ms
// @Memory: 38.9 MB

class Solution {
    public int maxSubArray(int[] nums) {
        /*
            遍历数组，记录当前最大的子序和，如果下一个使得子序和减小，则指针跳到
            当前的位置，重新计算子序和
        */
        int maxSum = nums[0];
        int sum = 0;
        for(int num :nums){
            if(sum>0){
                sum+=num;
            }else{
                sum = num;
            }
            maxSum = Math.max(maxSum,sum);
        }
         return maxSum;
       
    }
}
