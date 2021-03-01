
// @Title: 子集 (Subsets)
// @Author: 15218859676
// @Date: 2020-12-23 09:13:15
// @Runtime: 1 ms
// @Memory: 38.8 MB

class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        res = new ArrayList();
        if(len == 0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<Integer>();
        dfs(nums, len, 0, path);
        return res;
    }
    public void dfs(int[]nums, int len, int begin, Deque<Integer> path){
        res.add(new ArrayList<>(path));
        for(int i = begin; i < len; i++){
            path.add(nums[i]);
            dfs(nums, len, i + 1, path);
            path.removeLast();
        }
    }
}
