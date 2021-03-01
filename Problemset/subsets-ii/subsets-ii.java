
// @Title: 子集 II (Subsets II)
// @Author: 15218859676
// @Date: 2020-12-23 09:29:51
// @Runtime: 3 ms
// @Memory: 38.8 MB

class Solution {
    private List<List<Integer>> res;
    // private Set<List<Integer>> set;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //返回包含重复元素数组的所有子集
        //方法1.用set去重
        res = new ArrayList();
        int len = nums.length;
        if(len == 0 ){
            return res;
        }
        Arrays.sort(nums);
        // set = new HashSet();
        Deque<Integer> path = new ArrayDeque<Integer>();
        dfs(nums, len, 0, path);
        // res = new ArrayList(set);
        return res;
    }
    public void dfs(int[] nums, int len, int begin, Deque<Integer> path){
        res.add(new ArrayList(path));
        for(int i = begin ; i < len; i++){
            if(i > begin && nums[i] == nums[i - 1]){
                continue;
            }
            path.add(nums[i]);
            dfs(nums, len , i + 1, path);
            path.removeLast();
        }
    }
}
