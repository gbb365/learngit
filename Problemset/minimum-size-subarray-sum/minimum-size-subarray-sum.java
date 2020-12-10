
// @Title: 长度最小的子数组 (Minimum Size Subarray Sum)
// @Author: 15218859676
// @Date: 2020-11-22 10:03:10
// @Runtime: 1 ms
// @Memory: 38.6 MB

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        /**
        返回长度最小的子数组的长度
        双指针，让累加和大于等于s，记录长度，然后让一个指针从头开始减少长度，更新最小
        */
        int len = nums.length;
        if(len <1 ){
            return len;
        }
        int sum = 0;
        int cnt = Integer.MAX_VALUE;
        int j = 0;
        for(int i = 0 ; i < len ;i++){
            sum += nums[i];
            while(sum >= s){
                cnt = Math.min(cnt,i-j+1);
                sum -= nums[j];
                j++;
            }
        }
        return cnt == Integer.MAX_VALUE?0:cnt;

    }
}
