
// @Title: 缺失的第一个正数 (First Missing Positive)
// @Author: 15218859676
// @Date: 2020-11-19 15:11:02
// @Runtime: 1 ms
// @Memory: 36.1 MB

class Solution {
    public int firstMissingPositive(int[] nums) {
        /**
            原地哈希，将[1,n]范围的元素放到对应放到数组中n-1的位置上
            遍历，如果nums[i] != i+1, 就返回i+1，超出数组长度就返回len+1
        */
        int len = nums.length;
        for(int i = 0 ; i < len ;i++){
            //规定交换的范围并且没有放到合适的位置上才交换
            //范围：大于0并且小于等于数组长度
            while(nums[i]>0 && nums[i]<=len && nums[nums[i]-1]!=nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i = 0; i < len;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;

    }
    public void swap(int[]nums,int i ,int j){
        if(i == j){
            return ;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
