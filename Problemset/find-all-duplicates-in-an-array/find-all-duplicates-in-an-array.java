
// @Title: 数组中重复的数据 (Find All Duplicates in an Array)
// @Author: 15218859676
// @Date: 2020-11-19 14:56:36
// @Runtime: 8 ms
// @Memory: 46.9 MB

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        /**
            原地哈希，让n排在数组中n-1的位置上
            排列完成后，一次遍历如果num[i]-1 != i,就说明它不在自己的位置，重复了
        */
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        if(len == 0 ){
            return list;
        }
        for(int i = 0 ; i < nums.length; i++){
            //将n放到数组中n-1的位置上,如果之前的位置被占用了或者已经是合适的位置就跳过
            while(nums[nums[i]-1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i = 0 ; i< len ; i++){
            if(nums[i]-1 != i){
                list.add(nums[i]);
            }
        }
        return list;

    }
    public void swap(int[] nums,int i,int j){
        if(i == j ){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
