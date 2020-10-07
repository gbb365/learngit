
// @Title: 在排序数组中查找元素的第一个和最后一个位置 (Find First and Last Position of Element in Sorted Array)
// @Author: 15218859676
// @Date: 2020-09-30 11:40:51
// @Runtime: 0 ms
// @Memory: 42.2 MB

class Solution {
    public int[] searchRange(int[] nums, int target) {
        //O(logn)必须用二分,返回target中开始和结束位置
        if(nums==null||nums.length==0){
            return new int[]{-1,-1};
        }
        int first = getFirst(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        return new int[]{getFirst(nums,target),getLast(nums,target)};
    }
    public int getFirst(int []nums,int target){
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(nums[mid] == target){
                j = mid - 1;
            }else if(nums[mid]<target){
                i = mid+1;
            }else{
                j = mid - 1;
            }
        }
        if(i!=nums.length&&nums[i]==target){
            return i;
        }
        return -1;
    }
    public int getLast(int[]nums,int target){
        int i = 0;
        int j = nums.length-1;
        while(i<= j){
            int mid = i +(j-i)/2;
            if(nums[mid]==target){
                i = mid+1;
            }else if(nums[mid]<target){
                i = mid+1;
            }else{
                j = mid -1;
            }
        }
        return j;
    }
}
