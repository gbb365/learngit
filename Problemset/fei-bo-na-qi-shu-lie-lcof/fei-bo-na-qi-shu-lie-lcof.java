
// @Title: 斐波那契数列 (斐波那契数列  LCOF)
// @Author: 15218859676
// @Date: 2021-01-12 19:00:58
// @Runtime: 0 ms
// @Memory: 35.2 MB

class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        if(n < 2){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i <= n ;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }
}
