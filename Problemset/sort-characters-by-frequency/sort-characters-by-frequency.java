
// @Title: 根据字符出现频率排序 (Sort Characters By Frequency)
// @Author: 15218859676
// @Date: 2020-11-26 15:31:51
// @Runtime: 15 ms
// @Memory: 39.6 MB


class Solution {
    public String frequencySort(String s) {
        if(s.length()<2){
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder ss = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxheap = new PriorityQueue((o1,o2)->map.get(o2)-map.get(o1));
        maxheap.addAll(map.keySet());
        while(!maxheap.isEmpty()){
            char key = maxheap.poll();
            int value = map.get(key);
            for(int i = 0 ; i < value; i++){
                ss.append(key);
            }
        }
        return ss.toString();
//        char[] cc = s.toCharArray();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(char c : cc ){
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//        Map<Character,Integer> temp = new HashMap<>(map);
//        StringBuilder ss = new StringBuilder();
//        for(int i = 0 ; i < s.length(); i++){
//            for(char c : temp.keySet()){
//                temp.put(c,temp.get(c)-1);
//                if(temp.get(c)==0){
//                    for(int j = 0 ; j < map.get(c);j++){
//                        ss.append(c);
//                    }
//                }
//            }
//        }
//        return ss.reverse().toString();
    }
}

