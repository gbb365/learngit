
// @Title: 字母异位词分组 (Group Anagrams)
// @Author: 15218859676
// @Date: 2020-12-14 21:11:05
// @Runtime: 16 ms
// @Memory: 41.9 MB

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> res = new ArrayList();
        if(len == 0 ){
            return res;
        }
        Map<String,List<String>> map = new HashMap();
        for(String str : strs){
            int[] counts = new int[26];
            //统计每个一个字符串出现的次数
            for(int i = 0 ; i < str.length() ; i++){
                counts[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < counts.length; i++){
                if(counts[i] != 0){
                    //将当前串中的字符和各自出现的次数组装成一个key
                    sb.append((char)('a'+i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList<List<String>>(map.values());



       /*
        //将字母异位词组合在一起
        int len = strs.length;
        List<List<String>> res = new ArrayList();
        if(len == 0){
            return res;
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            //将排序后的字符串做成一个唯一的键,字母异位词的键一定同
            String s = String.valueOf(c);
            //不包含就生成一个新的list
            if(!map.containsKey(s)){
                map.put(s,new ArrayList());
            }
            //将串添加到这个列表中
            map.get(s).add(str);
        }
        //返回map中所有的值
        return new ArrayList(map.values());
        */
    }
}
