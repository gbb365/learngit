
// @Title: 组合总和 (Combination Sum)
// @Author: 15218859676
// @Date: 2020-12-24 14:57:54
// @Runtime: 131 ms
// @Memory: 39.4 MB


class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        int len = candidates.length;
        if (len == 0){
            return res;
        }
        Arrays.sort(candidates);
        Deque<Integer> path  = new ArrayDeque<>();
        dfs(candidates, 0, target,path);
        return res;
    }
    public void dfs(int[] nums, int begin, int target, Deque<Integer> path){
//        if(target < 0){
//            return;
//        }
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = begin ; i < nums.length ; i++){
            if( target - nums[i] < 0){
                break;
            }
            path.addLast(nums[i]);
            System.out.println("递归之前=>" + path+",剩余"+(target - nums[i]));
            dfs(nums, i, target - nums[i], path);
            path.removeLast();
            System.out.println("递归之后 =>" + path);
        }
    }
}

