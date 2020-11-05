
// @Title: 爱吃香蕉的珂珂 (Koko Eating Bananas)
// @Author: 15218859676
// @Date: 2020-11-04 22:30:33
// @Runtime: 10 ms
// @Memory: 39.8 MB

class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        /**
            爱吃香蕉的珂珂，不是很懂这个什么意思。

            返回她可以在H小时内吃掉所有香蕉的最小速度K..注意是找最小的k

            好像之前做过啊，找一个最小的数
            ------------------------------
            就是在最大和最小速度之间，求一个能满足H的最小速度
            当恰好能在H小时吃完还要去尝试更小的速度能不能吃完。

            每堆香蕉吃完的耗时 = 这堆香蕉的数量/每小时吃的数量
            只能使用向上取整。（余数成为一堆，不能舍去）
        */
        int maxValue = 1;
        for(int pile: piles){
            maxValue = Math.max(pile,maxValue);
        }
        int minValue = 1;
        while(minValue < maxValue){
            int mid = minValue + (maxValue - minValue)/2;
            //速度太小，超过了H,不满足要求，让左边的去mid的右边
            if(cal(mid,piles)> H){
                minValue = mid + 1;
            }else{
                //可能符合要求，但是还是要寻找一个更小的
                maxValue = mid;
            }
        }
        return minValue;
    }
    public int cal(int target, int[] piles){
        //计算吃完所需要的时间
        int sum = 0;
        for(int pile : piles){
            sum+=(pile + target-1 )/target;
        }
        return sum;
    }
}
