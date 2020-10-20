
// @Title: 反转字符串 (Reverse String)
// @Author: 15218859676
// @Date: 2020-10-20 15:12:40
// @Runtime: 1 ms
// @Memory: 44.7 MB

class Solution {
    public void reverseString(char[] s) {
        /**
            原地反转字符串，只能使用O(1)的时间
            双指针，用一个临时变量做交换
        */
        int i = 0;
        int j = s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
