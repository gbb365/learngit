
// @Title: 存在重复元素 (Contains Duplicate)
// @Author: 15218859676
// @Date: 2020-10-12 13:53:44
// @Runtime: 9 ms
// @Memory: 44.8 MB

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i = 0 ;i<nums.length;i++){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1);
        //     }else{
        //         return true;
        //     }
        // }
        // return false;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
