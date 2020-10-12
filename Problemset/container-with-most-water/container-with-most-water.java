
// @Title: 盛最多水的容器 (Container With Most Water)
// @Author: 15218859676
// @Date: 2020-10-10 19:37:06
// @Runtime: 4 ms
// @Memory: 40.6 MB

class Solution {
    public int maxArea(int[] height) {
       

        //暴力.二次遍历.时间复杂度太高.
        // int len = height.length;
        // if(height == null || len<2){
        //     return 0;
        // }
        // int res = 0;
        // for(int i = 0 ;i<len-1;i++){
        //     for(int j = i+1;j<len;j++){
        //         res = Math.max(res,Math.min(height[i],height[j])*(j-i));
        //     }
        // }
        // return res;

        /**
            指针对撞法:使用两个指针,由于left+1或者right-1,底的长度都是不变的.
            为了保证有体积最大的可能,所以应该移动矮的,高的不动
        */
        int len = height.length;
        if(len<2){
            return 0;
        }
        int res = 0;
        int left = 0;
        int right = len-1;
        while(left<right){
            int min  = Math.min(height[left],height[right]);
            res = Math.max(res,min*(right - left));
            if(min == height[left]){
                left++;
            }else if(min == height[right]){
                right -- ;
            }
        }
        return res;

    }
}
