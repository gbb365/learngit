
// @Title: 无重叠区间 (Non-overlapping Intervals)
// @Author: 15218859676
// @Date: 2021-01-11 11:13:44
// @Runtime: 4 ms
// @Memory: 38.1 MB

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        if(len == 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int res = 0;
        int end = intervals[0][1];
        for(int i = 1 ; i < len ; i ++){
            if(intervals[i][0] < end){
                res ++;
            }else{
                end = intervals[i][1];
            }
        }
        return res;
    }
}
