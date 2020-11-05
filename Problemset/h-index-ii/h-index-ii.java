
// @Title: H 指数 II (H-Index II)
// @Author: 15218859676
// @Date: 2020-11-03 17:37:24
// @Runtime: 0 ms
// @Memory: 45.5 MB

class Solution {
    public int hIndex(int[] citations) {
        //数组是保证有序的.
        // 单调性 [i, len - 1] 一共有论文 len - 1 - i + 1 = len - i 篇
        // 找到最小的 i 使得 nums[i] >= len - i

        //h篇至少h次,比长度小的就不用考虑了 left = mid+1
        //比长度大,有可能是解,继续让right左移,看看有没有更小的mid
        int len = citations.length;
        if(len == 0  || citations[len-1]==0){
            return 0;
        }
        int left = 0;
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
