
// @Title: 二分查找 (Binary Search)
// @Author: 15218859676
// @Date: 2020-09-30 08:57:50
// @Runtime: 0 ms
// @Memory: 40.1 MB

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                right = mid -1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return -1;
    }
}
