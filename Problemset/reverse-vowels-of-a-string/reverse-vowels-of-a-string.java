
// @Title: 反转字符串中的元音字母 (Reverse Vowels of a String)
// @Author: 15218859676
// @Date: 2020-09-16 22:12:06
// @Runtime: 7 ms
// @Memory: 39.4 MB

class Solution {

    private static final HashSet<Character> set = new HashSet<Character>(Arrays.asList(
        'a','e','i','o','u','A','E','I','O','U'
    ));
    public String reverseVowels(String s) {
        //方法1. 使用双指针，依次比较。如何判断是元音字母呢
            if (s == null) return s;
            char[]result = new char[s.length()];//字符数组
            int i = 0;
            int j = s.length()-1;
            while( i <= j){
                char x = s.charAt(i);
                char y = s.charAt(j);
                if(!set.contains(x)){
                    result[i++] = x;
                }else if(!set.contains(y)){
                    result[j--] = y;
                }else{
                    result[i++] = y;
                    result[j--] = x;
                }
            }
            return new String(result);
         }
    }
