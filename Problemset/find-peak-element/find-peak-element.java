
// @Title: 寻找峰值 (Find Peak Element)
// @Author: 15218859676
// @Date: 2020-11-05 10:21:40
// @Runtime: 0 ms
// @Memory: 38.1 MB

class Solution {
    public int findPeakElement(int[] nums) {
        /**
            寻找峰值，返回峰值的下标
        */
        int len = nums.length;
        int left = 0 ;
        int right = len - 1;
        while(left < right){
            int mid = left + (right - left) /2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
