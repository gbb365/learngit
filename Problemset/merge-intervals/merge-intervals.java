
// @Title: 合并区间 (Merge Intervals)
// @Author: 15218859676
// @Date: 2020-11-19 15:54:41
// @Runtime: 10 ms
// @Memory: 40.8 MB

class Solution {
    public int[][] merge(int[][] intervals) {
        //按第一位排序，然后根据第二个比较是否有重叠
        int len = intervals.length;
        if(len < 2){
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(o->o[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for( int i = 1 ; i < len ; i++){
            int[] peek = list.get(list.size()-1);
            int[] cur = intervals[i];
            if(cur[0] > peek[1]){
                list.add(cur);
            }else{
                peek[1] = Math.max(cur[1],peek[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
