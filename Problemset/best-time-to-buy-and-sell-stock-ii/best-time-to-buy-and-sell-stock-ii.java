
// @Title: 买卖股票的最佳时机 II (Best Time to Buy and Sell Stock II)
// @Author: 15218859676
// @Date: 2021-01-13 19:45:39
// @Runtime: 4 ms
// @Memory: 38.3 MB


class Solution {
    public int maxProfit(int[] prices) {
        //买卖股票的最佳时机, 每个股票可以买卖无限次
      int len = prices.length;
      int[][] dp = new int[len][2];
      dp[0][0] = 0;
      dp[0][1] = -prices[0];
      for(int i = 1 ; i < len ;i++){
          //第i天不持有股票的最大收益: 1.前一天也不持有的 或者 前一天持有,今天卖掉 中较大的一个
          dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
          //第i天持有股票的最大收益: 1.前一天持有的最大收益 或者 前一天没有,今天买入  中较大的;
          dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
      }
      return dp[len - 1][0];
    }
}

