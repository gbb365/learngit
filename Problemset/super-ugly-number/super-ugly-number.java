
// @Title: 超级丑数 (Super Ugly Number)
// @Author: 15218859676
// @Date: 2021-01-12 21:56:10
// @Runtime: 20 ms
// @Memory: 36 MB

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        //返回第n个超级丑数
        //超级丑数：所有质因数都在给出的质数列表中
        //3指针拓展到k:为每个质因数建立一个指针，然后再这几个质因数运算的结果中，找出个最小的，然后匹配这个数是由哪个质因数算出来的，把它的指针值+1。
        int[] dp = new int[n];
        dp[0] = 1;
        int pLen = primes.length;
        int[] index = new int[pLen];
        for(int i = 1 ; i < n ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < pLen; j++){
                //选择最小的
                min = Math.min(min, dp[index[j]] * primes[j]);
                dp[i] =min;
            }
            //更新指针
            for(int j = 0 ; j < pLen; j++){
                if(min == dp[index[j]] * primes[j]){
                    index[j]++;
                }
            }
        }
        return dp[n - 1];
    }
}
