
// @Title: 找到字符串中所有字母异位词 (Find All Anagrams in a String)
// @Author: 15218859676
// @Date: 2020-11-24 21:42:24
// @Runtime: 25 ms
// @Memory: 39.7 MB

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //储存需要返回的结果集
        List<Integer> list = new ArrayList<Integer>();
        //输入异常处理
        if(s.length() < p.length()){
            return list;
        }
        //map统计模式串中字符的频数
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //初始化两个指针
        int begin = 0;
        int end = 0;
        //维护map的长度，检查是否与目标串匹配
        int count = map.size();
        char temp;
        //在开头的位置循环
        while(end < s.length()){
            temp = s.charAt(end);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)-1);
                if(map.get(temp) == 0){
                    count--;
                }
            }
            end++;
            //count==0，表示可能找到一组符合的结果。增加begin指针以使其再次开始比较
            while(count == 0){
                temp = s.charAt(begin);
                if(map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                    if(map.get(temp)>0){
                        count++;
                    }
                }
                //长度符合，找到了
                if(end - begin == p.length()){
                    list.add(begin);
                }
                begin++;
            }
        }
        return list;
    }
}
