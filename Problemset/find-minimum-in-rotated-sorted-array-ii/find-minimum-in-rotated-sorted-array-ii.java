
// @Title: 寻找旋转排序数组中的最小值 II (Find Minimum in Rotated Sorted Array II)
// @Author: 15218859676
// @Date: 2020-11-03 13:02:39
// @Runtime: 0 ms
// @Memory: 37.7 MB

class Solution {
    public int findMin(int[] nums) {
        /**
            找出旋转排序数组中最小的元素,数组元素可能会出现重复
            参考上一题
        */
        int len = nums.length;
        if(len == 0){
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while(left<right){
            int mid = (left +right)/2;
            if(nums[left]<nums[right]){
                return nums[left];
            }
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else if(nums[mid]<nums[right]){
                right = mid;
            }else{
                // nums[mid] == nums[right],跳过这个重复出现的数字[3,3,1,3]
                //直接用right = mid,就出把1 跳过了.
                /*
                    例 5：[0, 1, 1, 1, 1, 1, 1]
                    例 6：[1, 1, 1, 1, 0, 1, 1]
                    目标值可能在中间数的左边，也可能在中间数的右边
                    很简单，此时你看到的是右边界，就把只右边界排除掉就好了
                    正是因为右边界和中间数相等，你去掉了右边界，中间数还在，
                    就让中间数在后面的循环中被发现吧。
                */
                right = right - 1;
            }
        }
        return nums[left];
    }
}
