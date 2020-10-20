
// @Title: 有序数组的平方 (Squares of a Sorted Array)
// @Author: 15218859676
// @Date: 2020-10-20 15:33:00
// @Runtime: 2 ms
// @Memory: 40.2 MB

class Solution {
    public int[] sortedSquares(int[] A) {
        /**
            给定非递减数组，返回有该数组中元素的平方排序后的数组
        */
        for(int i = 0 ;i<A.length;i++)
            A[i] = A[i]*A[i];
        
        Arrays.sort(A);
        return A;
    } 
}
