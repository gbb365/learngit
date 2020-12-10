
// @Title: 二进制求和 (Add Binary)
// @Author: 15218859676
// @Date: 2020-12-08 19:11:40
// @Runtime: 3 ms
// @Memory: 37.1 MB


class Solution {
    public String addBinary(String a, String b) {
        //给两个字符串，返回他们的二进制的和，逢二进一
       StringBuilder ans = new StringBuilder();
       int n = Math.max(a.length(),b.length());
       int carry = 0;
       for(int i = 0 ; i < n ; i++){
           carry += i < a.length()?(a.charAt(a.length() - 1 - i)-'0'):0;
           carry += i < b.length()?(b.charAt(b.length()- 1 - i)- '0'):0;
           ans.append((char)carry %2);
           carry /= 2;
       }
       if (carry > 0){
           ans.append('1');
       }
       ans.reverse();
       return ans.toString();
    }
}

