
// @Title: 最接近的三数之和 (3Sum Closest)
// @Author: 15218859676
// @Date: 2020-11-06 11:08:23
// @Runtime: 6 ms
// @Memory: 38.3 MB

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        /**
            排序，双指针
        */
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        for(int i = 0 ; i < nums.length;i++){
            int left = i + 1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum -target) < Math.abs(res - target)){
                    res = sum;
                }
                if(sum > target){
                    right--;
                }else if (sum <target){
                    left++;
                }else{
                    return target;
                }
            }
        }
        return res;
        
    }
}
