
// @Title: 搜索插入位置 (Search Insert Position)
// @Author: 15218859676
// @Date: 2020-09-29 10:20:36
// @Runtime: 0 ms
// @Memory: 38 MB

class Solution {
    public int searchInsert(int[] nums, int target) {
        //二分查找
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                j = mid-1;
            }else{
                i = mid + 1;
            }
        }
        return i;
        // int tmp = 0;
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]== target){
        //         tmp = i;
        //         break;
        //     }else if(nums[i]>target){
        //         tmp = 0;
        //         break;
        //     }else if(nums[nums.length-1]<target){
        //         tmp = nums.length;
        //         break;
        //     }else if(nums[i]>target){
        //         target = i;
        //         break;
        //     }
        // }
        // return tmp;
    }
}
