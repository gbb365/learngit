
// @Title: 寻找重复数 (Find the Duplicate Number)
// @Author: 15218859676
// @Date: 2020-11-04 11:56:11
// @Runtime: 3 ms
// @Memory: 38.3 MB

class Solution {
    public int findDuplicate(int[] nums) {
        /**
            返回数组中重复的数
            n+1个元素大小都在 1-n ，不能改变数组，不能用辅助空间，线性时间，可以重复多次

            使用二分（在给定范围的数字中）
            我们不要考虑数组,只需要考虑 数字都在 1 到 n 之间
            示例 1:
            arr = [1,3,4,2,2] ,数组长度n+1=5,所以 n = 4，此时数字在 1 — 4 之间

            mid = (1 + 5) / 2 = 3 arr小于等于的3有4个(1,2,2,3)，1到3中肯定有重复的值
            mid = (1 + 3) / 2 = 2 arr小于等于的2有3个(1,2,2)，1到2中肯定有重复的值
            mid = (1 + 2) / 2 = 1 arr小于等于的1有1个(1)，2到2中肯定有重复的值
            所以重复的数是 2 
            // 根据抽屉原理，小于 等于4 的数的个数如果严格大于 4 个，
            // 此时重复元素一定出现在 [1, 4] 区间里 
            // 根据抽屉原理，严格小于 4 的数的个数如果大于等于 4 个，
            // 此时重复元素一定出现在 [1, 3] 区间里

        */
        int len = nums.length;
        //数值在[1,n],一共由n+1个数
        int left = 1; 
        int right = len -1;
        
        while(left<right){
            //注意这里的mid指的是数值，不是下标或索引。
            int mid = (left+right)/2;
            int cnt = 0;
            //每次都统计数组中有多少个比中间数小的，找到重复的数出现的范围
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i]<=mid){
                    cnt+=1;
                }
            }
            if(cnt > mid){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;

    }
}
