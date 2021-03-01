
// @Title: 实现 strStr() (Implement strStr())
// @Author: 15218859676
// @Date: 2021-01-11 20:39:06
// @Runtime: 6 ms
// @Memory: 36.9 MB

class Solution {
    public int strStr(String haystack, String needle) {
        //返回模式串在原串中第一次出现的位置
        //双指针匹配
        if(needle == ""){
            return 0;
        }
        int i = 0 ;
        int j = 0 ;
        
        while( i < haystack.length() && j < needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
        }
        if(j == needle.length()){
            return i - needle.length();
        }else{
            return -1;
        }
    }
}
