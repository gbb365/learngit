
// @Title: 搜索旋转排序数组 II (Search in Rotated Sorted Array II)
// @Author: 15218859676
// @Date: 2020-11-02 21:40:16
// @Runtime: 1 ms
// @Memory: 38 MB

class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0 ){
            return false;
        }
        int left = 0;
        int right = len - 1;
        while (left < right){
            //中间元素和右边界比较,还有一种是中间元素和左边界元素进行比较
            int mid = left + (right - left +1)/2;
            if (nums[mid]<nums[right]){
                if (nums[mid]<=target && target<= nums[right]){
                    left = mid;
                }else {
                    right = mid -1;
                }
            }else if(nums[mid]>nums[right]){
                if (nums[left]<=target && target<= nums[mid-1]){
                    right = mid -1;
                }else {
                    left = mid;
                }

            }else {
                //判断是否刚好就是在中间.不是就减1继续
                if (nums[right] == target){
                    return true;
                }
                right = right-1;
            }
        }
        return nums[left] == target;
    }
}
