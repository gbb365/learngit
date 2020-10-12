
// @Title: 多数元素 (Majority Element)
// @Author: 15218859676
// @Date: 2020-10-09 20:39:09
// @Runtime: 1 ms
// @Memory: 42.3 MB

class Solution {
    public int majorityElement(int[] nums) {
        //使用一个map记录数组中每个元素出现的次数.
        // Map<Integer,Integer> count = count(nums);
        // Map.Entry<Integer,Integer> res = null;
        // for(Map.Entry<Integer,Integer> entry:count.entrySet()){
        //     if(res == null|| entry.getValue()>res.getValue()){
        //         res = entry;
        //     }
        // }
        // return res.getKey();            
    
    //使用一个临时的entryset,遍历count的entrySet(可以用来比较值,又能直接取出键)
    // public Map<Integer,Integer> count(int[] nums){
    //     Map<Integer,Integer> map = new HashMap<>();
    //     for(int i = 0;i<nums.length;i++){
    //         if(!map.containsKey(nums[i])){
    //             map.put(nums[i],1);
    //         }else{
    //             map.put(nums[i],map.get(nums[i])+1);
    //         }
    //     }
    //     return map;    
    // }
       //方法二.由于题目说总有出现次数大于n/2的元素.那么这个元素一定是出现在中间的位置
       //排序,取中间位置即可
       // Arrays.sort(nums);
       // return nums[nums>>2];


       //摩尔投票法.遍历数组.相同的count+1,不同减1
       //多数>n/2,其余小于n/2.多数减少数肯定>=1
        int can_num = nums[0];
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(can_num == nums[i]){
                count++;
            //这个(--count == 0)用的不错,整合到一起,可以少些一个判断语句
            }else if(--count == 0){
                can_num = nums[i];
                count = 1;
            }
        }
    return can_num;

    }
    
}
