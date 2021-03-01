
// @Title: 丑数 II (Ugly Number II)
// @Author: 15218859676
// @Date: 2021-01-12 20:54:04
// @Runtime: 3 ms
// @Memory: 37.2 MB

class Solution {
    public int nthUglyNumber(int n) {
        //后面出现的丑数一定是前面出现的2、3、5倍
        //求第n个，关键是怎么让出现过的有序，用3个指针，每次用当前2、3、5倍中最小的那个更新列表
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1 ; i < n ; i++){
            int n2 = dp[a] * 2 , n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n - 1];
    }
}
