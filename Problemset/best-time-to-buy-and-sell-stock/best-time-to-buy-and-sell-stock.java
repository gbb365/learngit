
// @Title: 买卖股票的最佳时机 (Best Time to Buy and Sell Stock)
// @Author: 15218859676
// @Date: 2020-10-10 21:05:52
// @Runtime: 5 ms
// @Memory: 38.8 MB

class Solution {
    public int maxProfit(int[] prices) {
        //后面的数字要比前面的数字大.
        //找到数组中两个元素最大的差?
       int len = prices.length;
       if(len<2){
           return 0;
       }
        //有可能不做交易，因此结果的初始值设置为 0 ,时间复杂度太高
        // int result = 0;
        // for(int i = 0 ;i<prices.length-1;i++){
        //     for(int j = i+1;j<prices.length;j++){
        //         result = Math.max(result,prices[j]-prices[i]);
        //     }
        // }
        // return result;

        //简化一下循环,打擂台法.
        //记录当前看到的最小值,每次循环都更新一下最小值
        // int min = prices[0];
        // int res = 0;
        // for(int i = 1;i<len;i++){
        //     res = Math.max(res,prices[i]-min);
        //     min = Math.min(min,prices[i]);
        // }
        // return res;

        //使用动态规划
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i = 1;i<len;i++){
            dp[i][0]= Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[len-1][0];


    }
}
