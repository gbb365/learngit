
// @Title: 数组中重复的数字 (数组中重复的数字 LCOF)
// @Author: 15218859676
// @Date: 2020-09-30 15:18:56
// @Runtime: 1 ms
// @Memory: 46.7 MB

class Solution {
    public int findRepeatNumber(int[] nums) {
        //找数组中重复的数字当然是用一个Map啊,边遍历边从map中拿出来比较
        /*  这个解法太慢了,而且使用了一个辅助空间
            执行用时：11 ms, 在所有 Java 提交中击败了10.85%的用户
            内存消耗：47.1 MB, 在所有 Java 提交中击败了43.71%的用户
        */
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i = 0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return nums[i];
        //     }else{
        //         map.put(nums[i],i);
        //     }
        // }
        // return -1;


        //解法2.由于数组中的所有数字范围都是在0-n-1,所以将数组排序后,
        //如果对应位置的nums[i]=i,证明肯定没有重复
        //解决办法(原地重排):
        //在遍历数组的时候,如果num[i]!=i,就将num[i]与num[num[i]]交换
        int temp = 0;
        for(int i = 0 ;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] =temp;
            }
        }
        return -1;
    }
}
