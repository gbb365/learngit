
// @Title: 移动零 (Move Zeroes)
// @Author: 15218859676
// @Date: 2020-10-09 19:50:23
// @Runtime: 0 ms
// @Memory: 39.3 MB

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        // int j = 0;
        // /*
        //     用两个指针将非零数字全部赋值左侧,记录到达的位置

        // */
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         nums[j++] = nums[i];
        //     }
        // }
        // //将j之后的数字全部置0
        // for(int i = j ;i<nums.length;i++){
        //     nums[i] = 0;
        // }

        //使用快排的思想,用两个指针,直接将非0的全部交换到左边
        int j = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
