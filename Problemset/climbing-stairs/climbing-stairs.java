
// @Title: 爬楼梯 (Climbing Stairs)
// @Author: 15218859676
// @Date: 2020-10-13 17:32:42
// @Runtime: 0 ms
// @Memory: 35.4 MB

class Solution {
    public int climbStairs(int n) {
        //是动态规划吧
        //到达n阶的方法数等与前n-1阶的次数+1
        //初始状态，n=0 的时候次数肯定是0 ,n=1是1
        //怎么列状态转移方程呢
        // int []dp = new int[n];
        // dp[0] = 0;
        // dp[1] = 1;
        // for(int i =3 ;i<n;i++){
        //     dp[i] = 
        // }
        // return dp[i];

        //第n个台阶只能从第n-1或者n-2个上来。到第n-1个台阶的走法 + 第n-2个台阶的走法 = 到         //第n个台阶的走法，已经知道了第1个和第2个台阶的走法，一路加上去。
        while(n<=2) return n;
        int i1 = 1;
        int i2 = 2;
        for(int i = 3;i<=n;i++){
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}
