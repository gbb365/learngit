
// @Title: x 的平方根 (Sqrt(x))
// @Author: 15218859676
// @Date: 2020-09-18 16:11:23
// @Runtime: 2 ms
// @Memory: 36 MB

class Solution {
    public int mySqrt(int x) {
        //一个数x的开方一定在0-x中，并且满足 int sqrt = x/sqrt
        if(x==1) return x;
        int low = 1,high = x;//low 从1开始
        while(low <= high){
            int mid = low + (high - low) / 2;
            int sqrt = x / mid;
            if(sqrt == mid) {
                return mid;
            }else if(sqrt < mid){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return high;
    }
}
