
// @Title: 在排序数组中查找元素的第一个和最后一个位置 (Find First and Last Position of Element in Sorted Array)
// @Author: 15218859676
// @Date: 2020-10-27 15:55:42
// @Runtime: 0 ms
// @Memory: 41.7 MB

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if(len == 0 ){
            return new int[]{-1,-1};
        }
        int first = getFirst(nums,target);
        if(first == -1){
            return new int[]{-1,-1};
        }
        return new int[]{getFirst(nums,target),getLast(nums,target)};
    }
    public int getFirst(int[] nums,int target){
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while(left<right){
            int mid = left+(right - left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid] == target){
                right = mid;
            }else{
                right = mid - 1;
            }
        }
        if(nums[left] == target){
            return left;
        }
        return -1;
    }
    public int getLast(int[]nums,int target){
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while(left < right ){
            int mid = left + (right - left+1)/2;
            if(nums[mid]<target){
                left = mid +1;
            }else if(nums[mid] == target){
                left = mid;
            }else{
                right = mid -1;
            }
        }
        if(nums[left] == target){
            return left;
        }
        return -1;
    }
}
