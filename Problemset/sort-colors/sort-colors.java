
// @Title: 颜色分类 (Sort Colors)
// @Author: 15218859676
// @Date: 2020-11-20 09:59:41
// @Runtime: 0 ms
// @Memory: 37.1 MB

class Solution {
    public void sortColors(int[] nums) {
        //颜色分类，对数组进行三分，一趟扫描快排，不能调库
        int len = nums.length;
        if(len < 2){
            return;
        }
        int i = 0 ; 
        int zero = 0;
        int two = len;
        while( i < two){
            if(nums[i] == 0){
                swap(nums, i , zero);
                i++;
                zero++;
            }else if(nums[i] == 1){
                i++;
            }else{
                two--;
                swap(nums, i, two);
            }
        }
    }
    public void swap(int[]nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
