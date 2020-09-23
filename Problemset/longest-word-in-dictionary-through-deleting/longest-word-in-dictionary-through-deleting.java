
// @Title: 通过删除字母匹配到字典里最长单词 (Longest Word in Dictionary through Deleting)
// @Author: 15218859676
// @Date: 2020-09-17 23:43:59
// @Runtime: 30 ms
// @Memory: 39.6 MB

class Solution {
    public String findLongestWord(String s, List<String> d) {
        //解题思路:分别将原来的串和字典中的串进行对比
        /*拿出每一个sstr在原来的串中，用两个指针逐个比对，相同，字典串指针+1
          当一个字典串比对完成时，需要更新str:sstr长度比str长的直接更新（第一次直接更），长度相同按照
          字典顺序
        */
        /*String str = "";
        for(String sstr : d){
            for(int i = 0, j = 0;i<s.length()&&j<sstr.length();i++){
                //移动字典串
                if(s.charAt(i) == sstr.charAt(j)) j++;
                if(j == sstr.length()){
                    if(sstr.length()> str.length()||(str.length() == sstr.length() 
                && str.compareTo(sstr)>0)){
                    str = sstr;
                }
                }
            //各种错误
            }
        }
        return str;
        */

        //换一种写法
        String str = "";
        for(String sstr : d){
            if(str.length()>sstr.length()||(str.length() == sstr.length()&& str.compareTo(sstr)<0)){
                continue;
            }
            if(subString(s,sstr)){
                str = sstr;
            }
        }
        return str;

    }
    public boolean subString(String str,String sstr){
        int i = 0,j = 0;
        while(i<str.length()&&j<sstr.length()){
            if(str.charAt(i) == sstr.charAt(j)){// 。。傻逼
                j++;
            }
            i++;
        }
        return j == sstr.length();
    }
}
