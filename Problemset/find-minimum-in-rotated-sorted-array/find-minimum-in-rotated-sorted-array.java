
// @Title: 寻找旋转排序数组中的最小值 (Find Minimum in Rotated Sorted Array)
// @Author: 15218859676
// @Date: 2020-11-02 22:06:38
// @Runtime: 0 ms
// @Memory: 38 MB

class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if( len == 0){
            return -1;
        }
        int left = 0 ;
        int right = len -1;
        while( left< right){
            //这里这么写,用例是[2,1]的时候就会出现死循环
            // int mid = left +(right - left + 1)/2;
            int mid = (left+right)/2;
            if(nums[left]<nums[right]){
                return nums[left];
            }
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right = mid ;
            }
        }
        return nums[left];
    }
}
