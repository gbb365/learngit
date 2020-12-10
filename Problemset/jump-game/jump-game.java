
// @Title: 跳跃游戏 (Jump Game)
// @Author: 15218859676
// @Date: 2020-12-04 14:52:20
// @Runtime: 2 ms
// @Memory: 40.3 MB


class Solution {
    public boolean canJump(int[] nums) {
        //非负整数数组,数组元素代表跳的步长,判断是否能够到达最后一个位置
//        输入: [2,3,1,1,4]
//        输出: true
//        输入: [3,2,1,0,4]
//        输出: false
        //维护一个最大可达长度,遍历的过程中更新最大可达长度,如果遍历到最后i大于最大可达长度,返回false
        int rightMost = 0;
        for(int i = 0 ; i < nums.length ;i++){
            //i 超过rightmost表示不可跨越,不会更新rightmost
            if(i <= rightMost){
                rightMost = Math.max(rightMost,nums[i] + i);
            }
            if(rightMost >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
//    public boolean Jum(int[]nums){
//        int most = 0;
//        for(int i = 0 ; i < nums.length; i++){
//            if(i <= most){
//                most = Math.max(most,nums[i] + i);
//            }
//            if (most >= nums.length){
//                return true;
//            }
//        }
//        return false;
//    }
}

