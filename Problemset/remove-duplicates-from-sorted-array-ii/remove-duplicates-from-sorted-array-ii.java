
// @Title: 删除排序数组中的重复项 II (Remove Duplicates from Sorted Array II)
// @Author: 15218859676
// @Date: 2020-11-23 19:44:44
// @Runtime: 0 ms
// @Memory: 38.6 MB

class Solution {
    public int removeDuplicates(int[] nums) {
        //原地删除重复的元素，但是可以保留两位，原地删除，不可额外空间
        int len = nums.length;
        if(len < 2 ){
            return len;
        }
        int i = 2; 
        for( int j = 2;  j < len ; j++){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
