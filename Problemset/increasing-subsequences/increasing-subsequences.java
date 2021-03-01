
// @Title: 递增子序列 (Increasing Subsequences)
// @Author: 15218859676
// @Date: 2020-12-28 22:42:54
// @Runtime: 6 ms
// @Memory: 45 MB

class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> findSubsequences(int[] nums) {
        //返回数组中所有的递增子序列
        //序列的长度至少是2，序列中可以有数组中重复的数字
        //如何保证升序
        int len = nums.length;
        res = new ArrayList();
        if(len == 0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, 0, path);
        return res;
    }
    //需要保证序列中至少有两个数字
    //因为序列不能重复，所以用一个set来对同层中相同元素来去重
    public void dfs(int[] nums, int index, Deque<Integer> path){
        if(path.size() >= 2){
            res.add(new ArrayList(path));
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = index ; i < nums.length; i++){
            //当前待比较的数字需要比序列中的最后一个小，而且是同层中还没有重复出现的
            if(!path.isEmpty() && nums[i] < path.peekLast() || set.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            set.add(nums[i]);
            dfs(nums, i + 1, path);
            path.removeLast();
        }

    }
}
