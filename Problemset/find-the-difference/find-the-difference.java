
// @Title: 找不同 (Find the Difference)
// @Author: 15218859676
// @Date: 2020-12-18 21:14:48
// @Runtime: 3 ms
// @Memory: 36.9 MB

class Solution {
    public char findTheDifference(String s, String t) {
        //t由s随机重排后再添加字母，在t中找出被添加的字母

        //方法三. 异或运算 x ^ 0 = x ; x ^ x = 0
        char ch = t.charAt(t.length() - 1);
        for(int i = 0 ; i < s.length();i++){
            ch ^= s.charAt(i);
            ch ^= t.charAt(i);
        }   
        return ch;


        //方法2.记录出现次数
        // int [] cnt = new int[26];
        // for(int i = 0 ; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     cnt[ch - 'a'] ++;
        // }
        // for(int i = 0 ; i < t.length(); i++){
        //     char ch = t.charAt(i);
        //     cnt[ch - 'a']--;
        //     if(cnt[ch - 'a'] < 0){
        //         return ch;
        //     }
        // }
        // return ' ';






        //方法1.将两个串重新排序，遍历，找到第一个不同的就可以了
        // if(s.length() == 0){
        //     return t.charAt(0);
        // }
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        
        // for(int i = 0 ; i < arr1.length; i++){
        //     if(arr1[i] != arr2[i]){
        //         return arr2[i];
        //     }
        // }
        // return arr2[arr2.length - 1];
    }
}
