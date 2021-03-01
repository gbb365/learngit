
// @Title: 组合 (Combinations)
// @Author: 15218859676
// @Date: 2020-12-24 21:28:49
// @Runtime: 2 ms
// @Memory: 39.7 MB

class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        //组合，组合是不能重复的[1,2] = [2,1],需要跳过重复的元素,设置搜索起点
        res = new ArrayList();
        // if(n <= 0 || k <= 0 || n <= k){
        //     return res;
        // }
        if( n == 0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque();
        dfs(n, 1, path, k);
        return res;
    }
    public void dfs(int n , int begin, Deque<Integer> path, int k){
        if(path.size() == k){
            res.add(new ArrayList(path));
            return;
        }
        //剪枝：当前剩下的如果凑不够需要的个数就不用执行下去了
        // n - i + 1  < k - path.size()
        //只有剩下的元素大于等于需要的个数才有执行下去的需要
        // n - i + 1 >= k - path.size()
        for(int i = begin ; i <= n - (k - path.size()) + 1 ; i++){
        // for(int i = begin ; i <= n ; i++){
            path.add(i);
            dfs(n, i + 1, path, k);
            path.removeLast();
        }
    }
}
