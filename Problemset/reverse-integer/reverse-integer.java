
// @Title: 整数反转 (Reverse Integer)
// @Author: 15218859676
// @Date: 2020-09-23 20:29:51
// @Runtime: 1 ms
// @Memory: 36.1 MB

class Solution {
    public int reverse(int x) {
        // int rev = 0 ; 整数溢出。只能返回0
        long rev = 0;//修改long类型，判断下转换之后是否超出整数的范围。最后再强制转换成int
        while (x != 0 ){
            int pop = x %10;
            x = x/10;
            rev = rev*10 + pop;
        }
        if(rev>Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int)rev;
    }
}
