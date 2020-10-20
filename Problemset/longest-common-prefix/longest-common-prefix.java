
// @Title: 最长公共前缀 (Longest Common Prefix)
// @Author: 15218859676
// @Date: 2020-10-19 09:39:16
// @Runtime: 1 ms
// @Memory: 36.2 MB

class Solution {
    public String longestCommonPrefix(String[] strs) {
        /**
            用第一个作为基准，依次和数组中的其他元素两两进行比对
            比对的过程是，分别从两个字串中从头开始比较，下标的字符不相等了
            就跳出循环。用String.substring(i，j)进行截取,更新ans的值[i,j)
            如果ans的值在更新中变成了"",那么后续的比较无需进行，不可能存在公共子串
        */
        if(strs.length == 0 ){
            return "";
        }
            String ans = strs[0];
            for(int i =  1 ; i < strs.length;i++){
                int j = 0;
                for(; j<ans.length() && j< strs[i].length();j++){
                    if(strs[i].charAt(j)!=ans.charAt(j)){
                        break;
                    }
                }
                ans = strs[i].substring(0,j);
                if(ans.equals("")){
                    return "";
                }
            }
       
        return ans;
    }
}
