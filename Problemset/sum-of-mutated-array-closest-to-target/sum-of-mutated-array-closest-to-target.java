
// @Title: 转变数组后最接近目标值的数组和 (Sum of Mutated Array Closest to Target)
// @Author: 15218859676
// @Date: 2020-11-05 11:41:13
// @Runtime: 5 ms
// @Memory: 38.8 MB

class Solution {
    public int findBestValue(int[] arr, int target) {
        /**
            转变数组后，使得数组中元素的和最接近target，返回转变后的元素
            -------
            数组和最接近target：最接近表示两者之差的绝对值最小？？判断逻辑怎么处理
            //找到和比target大的最小值，然后再比较一次最小值和最小值-1，取小的即可
            题目是：将数组中所有大于value的值变成value后，数组的和，不是将全部都变成value;
            -------
            计算数组的数量，找到最大最小值，然后就在这个范围中不断夹逼比较target
        */
       Arrays.sort(arr);
       int left = 0;
       int right = arr[arr.length-1];
       while(left < right){
           int mid = left + (right - left)/2;
           int sum = getSum(arr,mid);
           //找到第一个大于target的。再往后的只会比前面的结果大，没必要再计算
           if(sum < target){
               left = mid + 1;
           }else{
               right = mid;
           }
       }
       //将当前的和前一个进行比较。后面的肯定比当前的大
       int sum1 = getSum(arr,left);
       int sum2 = getSum(arr,left -1);
       //这里有一个等号，因为value增大，但是求得的和可能是不变的，只要取前面的那个
       //[4,9,3] 10   结果取3和4的差值都是一样的，
       if(Math.abs(sum1 - target)>=Math.abs(sum2 - target)){
           return left - 1;
       }
       return left;
    }
    public int getSum(int[]arrs,int value){
        int sum = 0;
        for(int arr: arrs){
            sum += Math.min(arr,value);
        }
        return sum;
    }
}
