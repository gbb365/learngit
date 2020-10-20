
// @Title: 最长回文子串 (Longest Palindromic Substring)
// @Author: 15218859676
// @Date: 2020-10-19 22:02:06
// @Runtime: 144 ms
// @Memory: 38.1 MB

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2 ){
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        char[]ss = s.toCharArray();
        for( int i = 0 ;i < len - 1 ; i++){
            for( int j = i+1 ; j < len ; j++){
                if(j-i+1 > maxLen && isPalindrome(ss,i,j)){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    public static boolean isPalindrome(char[]s,int index1, int index2){
        while(index1<index2){
            if(s[index1]!=s[index2]){
                return false;
            }
            index1++;
            index2--;
        }
        return true;
    }
}
