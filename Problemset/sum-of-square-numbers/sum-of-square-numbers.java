
// @Title: 平方数之和 (Sum of Square Numbers)
// @Author: 15218859676
// @Date: 2020-09-16 21:25:01
// @Runtime: 3 ms
// @Memory: 35.5 MB

class Solution {
    public boolean judgeSquareSum(int c) {

        //方法1. 双指针，使用右指针剪枝叶加速
        if(c<0) return false;
        int i = 0;
        int j = (int)Math.sqrt(c);
        while(i<=j){//这里没有等号都不行
            int sum = i*i+j*j;
            if(sum == c) return true;
            else if(sum < c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
