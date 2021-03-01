
// @Title: 排列序列 (Permutation Sequence)
// @Author: 15218859676
// @Date: 2020-12-28 19:31:54
// @Runtime: 1 ms
// @Memory: 35.7 MB

class Solution {
    private boolean[] visit;
    private int[] factorial;

    public String getPermutation(int n, int k) {
        if(n <= 0 || k <= 0){
            return null;
        }
        //计算所有节点下面剩余节点的阶乘数
        caculateFactorial(n);
        visit = new boolean[n + 1];
        StringBuilder path = new StringBuilder();
        dfs(0, path, n, k);
        return path.toString();
        
    }
    public void dfs(int index, StringBuilder path, int n, int k){
        if(index == n){
            return ;
        }
        //计算还没确定数组的全排列个数，第一次剩下的是n-1个
        int cnt = factorial[n - 1 - index];
        for(int i = 1 ; i <= n ;i++){
            if(visit[i]){
                continue;
            }
            //这一节点得所有排列数小于k，结果不可能出现在这里，跳过
            if(cnt < k){
                k -= cnt;
                continue;
            }
            visit[i] = true;
            path.append(i);
            //添加了一个节点，继续往下找
            dfs(index + 1, path, n, k);
            //不需要回溯
            return;
        }
    }
    public void caculateFactorial(int n){
        factorial = new int[n + 1];
        factorial[0] = 1;
        for(int i = 1 ; i <= n ;i++){
            factorial[i] = factorial[i - 1] * i;
        }
    }
}
