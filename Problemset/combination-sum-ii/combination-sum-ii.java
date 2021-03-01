
// @Title: 组合总和 II (Combination Sum II)
// @Author: 15218859676
// @Date: 2020-12-24 15:22:19
// @Runtime: 3 ms
// @Memory: 38.6 MB


class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        int len = candidates.length;
        if(len == 0){
            return res;
        }
        //剪枝的前提需要对数组进行排序
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, target, path);
        return res;
    }
    public void dfs(int[] nums, int begin, int target, Deque<Integer> path){
//        if(target < 0){
//            return ;
//        }
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = begin ; i < nums.length ;i++){
            if(target - nums[i] < 0){
                break;
            }
            //因为给出的候选集中可能有重复出现的元素，这一步就排除了同层出现相同的元素，后面的那些不往下递归了
            if( i > begin && nums[i] == nums[i - 1]){
                continue;
            }
            path.addLast(nums[i]);
            dfs(nums, i + 1, target - nums[i], path);
            path.removeLast();
        }
    }
}

