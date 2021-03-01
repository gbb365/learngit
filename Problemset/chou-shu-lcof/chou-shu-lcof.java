
// @Title: 丑数 (丑数 LCOF)
// @Author: 15218859676
// @Date: 2021-01-14 10:26:36
// @Runtime: 2 ms
// @Memory: 37.5 MB

class Solution {
    public int nthUglyNumber(int n) {
        //求从小到大的第n个丑数
        //只含有质因子2、3、5
        int [] dp = new int[n];
        dp[0] = 1;
        int a = 0 ,b = 0 ,c = 0;
        for(int i = 1; i < n ; i++){
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n -1];
    }
}
