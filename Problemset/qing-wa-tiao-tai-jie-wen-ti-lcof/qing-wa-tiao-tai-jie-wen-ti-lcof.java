
// @Title: 青蛙跳台阶问题 (青蛙跳台阶问题  LCOF)
// @Author: 15218859676
// @Date: 2021-01-12 19:25:02
// @Runtime: 0 ms
// @Memory: 34.8 MB

class Solution {
    public int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum = (a + b)% 1000000007;
            a = b ;
            b = sum;
        }
        //循环第一次, a = b, 即 a = f(1),循环n次, a = f(n),所以返回a
        return a%= 1000000007;
        // if(n <= 1){
        //     return 1;
        // }
        // int [] dp = new int[n + 1];
        // dp[0] = 1;
        // dp[1] = 1;
        // for(int i = 2 ; i <= n ; i++){
        //     //第i级的跳法 = 前i-1级的再来一格  +   前 i-2 级的再来两格 
        //     dp[i] = dp[i - 1] + dp[i - 2];
        //     dp[i] %= 1000000007;
        // }
        // return dp[n];
    }
}
