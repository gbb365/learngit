
// @Title: 前 K 个高频元素 (Top K Frequent Elements)
// @Author: 15218859676
// @Date: 2020-12-04 14:15:43
// @Runtime: 15 ms
// @Memory: 41.2 MB

class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(
                (o1, o2) -> o2.getValue() - o1.getValue()
        );
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            queue.add(entry);
        }
        int[] res = new int[k];
        for(int i = 0 ; i < k ;i++){
            res[i] = queue.poll().getKey();
        }
        return res;
    }
}
