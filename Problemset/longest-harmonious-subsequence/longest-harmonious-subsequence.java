
// @Title: 最长和谐子序列 (Longest Harmonious Subsequence)
// @Author: 15218859676
// @Date: 2020-11-29 22:55:32
// @Runtime: 15 ms
// @Memory: 38.7 MB

class Solution {
    public int findLHS(int[] nums) {
        //返回最长和谐子序列的长度
        //和谐子序列：数组中元素最大和最小值差是1
        int len  = nums.length;
        if(len < 2){
            return 0;
        }
        Arrays.sort(nums);
        int begin = 0;
        int res = 0;
        for(int i = 0 ; i < len ; i++){
            while(nums[i] -  nums[begin] > 1){
                begin++;
            }if(nums[i] - nums[begin] == 1){
                res = Math.max(res, i - begin + 1);
            }
        }
        return res;
    }
}
