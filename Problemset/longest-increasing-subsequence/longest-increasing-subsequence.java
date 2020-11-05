
// @Title: 最长上升子序列 (Longest Increasing Subsequence)
// @Author: 15218859676
// @Date: 2020-11-03 15:50:39
// @Runtime: 0 ms
// @Memory: 36.7 MB

class Solution {
    public int lengthOfLIS(int[] nums) {
        /**
        使用二分法.
        */
        int len = nums.length;
        if(len<2){
            return len;
        }
        int[] tail = new int[len];
        tail[0] = nums[0];
        int end = 0;
        for(int i = 1 ; i < len ; i++){
            //当前的比最长子序列最后一个还大,直接添加
            if(nums[i] > tail[end]){
                end++;
                tail[end] = nums[i];
                
            //否则,为tail数组找到一个合适的位置插入num 
            }else{
                int left = 0;
                int right = end;
                while( left < right){
                    int mid = left + (right - left)/2;
                    if(tail[mid]<nums[i]){
                        left = mid + 1;
                    }else{
                        right = mid;
                    }
                }     
                tail[left] = nums[i];   
            }
        }
        end++;
        return end;




        /**
            动态规划
        */
        /**
        int len = nums.length;
        if(len < 2 ){
            return len;
        }
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for(int i = 1 ; i < len; i++){
            for(int j = 0 ; j < i ;j++){
                if(nums[j]<nums[i]){
                    dp[i] =Math.max(dp[i],dp[j]+1); 
                }
            }
        }
        int res = 0;
        for(int i = 0 ; i < len ; i++){
            res = Math.max(res,dp[i]);
        }
        return res;
        */
        

    }
}
