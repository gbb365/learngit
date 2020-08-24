
// @Title: 两数之和 (Two Sum)
// @Author: 15218859676
// @Date: 2018-10-02 18:55:50
// @Runtime: 11 ms
// @Memory: N/A

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }
}
