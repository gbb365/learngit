
// @Title: 两数之和 II - 输入有序数组 (Two Sum II - Input array is sorted)
// @Author: 15218859676
// @Date: 2020-10-13 16:44:27
// @Runtime: 2 ms
// @Memory: 38.9 MB

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ;i<numbers.length;i++){
            int obj = target - numbers[i];
            if(map.containsKey(obj)){
                return new int[]{map.get(obj)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{0,0};
    }
}
