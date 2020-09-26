
// @Title: 回文数 (Palindrome Number)
// @Author: 15218859676
// @Date: 2020-09-25 10:32:55
// @Runtime: 10 ms
// @Memory: 38.6 MB

class Solution {
    public boolean isPalindrome(int x) {
        //想当于反转整数。但是不需要判断是否溢出。因为如果溢出了可肯定不相等，也不是int范围的回文数。
        //除10取余
        if(x < 0 ){
            return false;
        }
        int temp = x;
        int result = 0;
        while(temp!= 0){
            result = result*10 + temp%10;
            temp /= 10;
        }
        return result == x;
    }
}
