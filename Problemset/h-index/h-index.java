
// @Title: H 指数 (H-Index)
// @Author: 15218859676
// @Date: 2020-11-03 17:40:03
// @Runtime: 1 ms
// @Memory: 36.4 MB

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        if(len == 0 || citations[len-1]==0){
            return 0;
        }
        int left = 0 ;
        int right = len - 1; 
        while(left < right){
            int mid = left +(right - left)/2;
            if(len - mid > citations[mid]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return len - left;
    }
}
