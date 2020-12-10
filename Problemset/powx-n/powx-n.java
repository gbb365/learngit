
// @Title: Pow(x, n) (Pow(x, n))
// @Author: 15218859676
// @Date: 2020-12-04 09:54:48
// @Runtime: 1 ms
// @Memory: 37.6 MB

class Solution {
    public double myPow(double x, int n) {
        //二进制分解
        long b = n ;
        if(b < 0 ){
            x = 1 / x;
            b = -b;
        }
        double res = 1.0;
        while(b > 0 ){
            if(b % 2 == 1){
                res *= x;
            }
            x *= x ;
            b >>=1;
        }
        return res;
    }
}
