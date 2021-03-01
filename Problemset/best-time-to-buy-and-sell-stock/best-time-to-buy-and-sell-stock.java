
// @Title: 买卖股票的最佳时机 (Best Time to Buy and Sell Stock)
// @Author: 15218859676
// @Date: 2021-01-13 13:56:12
// @Runtime: 29 ms
// @Memory: 54.7 MB


class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0){
            return 0;
        }
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i = 1 ; i < len ;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i -1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],  -prices[i]);
        }
        return dp[len-1][0];
    }
}

