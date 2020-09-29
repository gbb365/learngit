
// @Title: 删除排序数组中的重复项 (Remove Duplicates from Sorted Array)
// @Author: 15218859676
// @Date: 2020-09-29 08:57:59
// @Runtime: 1 ms
// @Memory: 40.9 MB

class Solution {
    public int removeDuplicates(int[] nums) {
        //你不需要考虑数组中超出新长度后面的元素是什么意思?
        //返回新数组的长度,那我用后面的覆盖前面,统计一下剩下的就可了吧
        //原地修改,而且是O(1),肯定是覆盖啊
        
        // int i = 0,j =0;
        // while(i<nums.length){
        //     if(nums[[i]==nums[j]]){
        //         j++;
        //     }
        //     nums[i+1] = nums[j];
        // }

        // return i+1;
        if(nums==null||nums.length == 1){
            return nums.length;
        }
        int i = 0 ,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}
