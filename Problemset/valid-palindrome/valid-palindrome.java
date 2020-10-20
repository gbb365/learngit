
// @Title: 验证回文串 (Valid Palindrome)
// @Author: 15218859676
// @Date: 2020-10-20 14:55:09
// @Runtime: 22 ms
// @Memory: 39.6 MB

class Solution {
    public boolean isPalindrome(String s) {
        /**
        验证回文串，只考虑字母和数字字符，可以忽略字母的大小写
        将所有的字符转成小写，去除所有非数字、字母的字符，转成数组后判断
        */
        String ss = s.toLowerCase().replaceAll("[^0-9a-z]","");
        char[] array = ss.toCharArray();
        int len  = array.length;
        for(int i = 0 ; i < len/2 ;i++){
            if(array[i]!=array[len-1-i]){
                return false;
            }
        }
        return true;
    }
}
