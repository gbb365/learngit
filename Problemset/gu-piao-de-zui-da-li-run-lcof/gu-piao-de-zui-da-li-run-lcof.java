
// @Title: 股票的最大利润 (股票的最大利润  LCOF)
// @Author: 15218859676
// @Date: 2021-01-14 10:17:39
// @Runtime: 4 ms
// @Memory: 38.2 MB

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0){
            return 0;
        }
        int[][] dp = new int[len][2];
        dp[0][0] = 0 ;
        dp[0][1] = -prices[0];
        for(int i = 1 ; i < len ; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[len-1][0];
    }
}
