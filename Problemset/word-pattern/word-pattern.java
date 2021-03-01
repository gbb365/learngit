
// @Title: 单词规律 (Word Pattern)
// @Author: 15218859676
// @Date: 2020-12-16 22:33:45
// @Runtime: 1 ms
// @Memory: 36.4 MB

class Solution {
    public boolean wordPattern(String pattern, String s) {
        //判断s是否和pattern有同样的双向连接对应规律
        //用map判断，存在key，但是value不同，返回false
        //没有key，但是有value，返回false
        //否则，添加到map中
        if(pattern == null || s == null){
            return false;
        }
        String []strs = s.split(" ");
        if(pattern.length() != strs.length){
            return false;
        }
        Map<Character,String> map = new HashMap<Character,String>();
        for(int i = 0 ; i < pattern.length(); i++){
            char temp = pattern.charAt(i);
            if(map.containsKey(temp)){
                if(!map.get(temp).equals(strs[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strs[i])){
                    return false;
                }
                map.put(temp, strs[i]);
            }
        }
        return true;

    }
}
