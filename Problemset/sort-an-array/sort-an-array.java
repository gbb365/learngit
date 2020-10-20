
// @Title: 排序数组 (Sort an Array)
// @Author: 15218859676
// @Date: 2020-10-15 11:16:30
// @Runtime: 1134 ms
// @Memory: 45.8 MB

class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length <= 1){
            return nums;
        }
        int len = nums.length;
        for(int i = 0 ; i < len - 1; i++){
            int minIndex = i;
            for(int j = i+1 ; j < len; j++ ){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
