
// @Title: 最后一个单词的长度 (Length of Last Word)
// @Author: 15218859676
// @Date: 2020-10-20 14:31:23
// @Runtime: 0 ms
// @Memory: 36.3 MB

class Solution {
    public int lengthOfLastWord(String s) {

      /**用split转成数组再判断
       String[] ans = s.split(" ");
       if(ans == null || ans.length == 0) return 0;
       int len = ans.length;
       return ans[len-1].length();
       */

       /**
        方法二.从后面开始遍历。遇到空格就跳过。否则用start记录这个位置，再次遍历到空格
        说明这就是最后一个字符串了。返回两个指针之间的距离。
       */
       int end = s.length() - 1;
       while(end>= 0 && s.charAt(end) == ' ') end--;
       if(end < 0 ){
           return 0;
       }
       int start = end;
       while(start >= 0 && s.charAt(start) !=' ') start--;
       return end - start;
    }
}
