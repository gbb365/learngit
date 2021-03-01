
// @Title: 同构字符串 (Isomorphic Strings)
// @Author: 15218859676
// @Date: 2021-01-11 21:35:13
// @Runtime: 13 ms
// @Memory: 38.4 MB

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //判断字符串是否同构
        //同构:s按照映射关系替换得到t，不同字符不能映射同一个字符，相同只能映射同一个，可以映射本身
        int sLen = s.length();
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0 ; i < sLen ; i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }else{
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
