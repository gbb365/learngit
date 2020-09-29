
// @Title: 合并排序的数组 (Sorted Merge LCCI)
// @Author: 15218859676
// @Date: 2020-09-28 21:19:38
// @Runtime: 0 ms
// @Memory: 38.9 MB

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        
        //A的末尾有最后的缓冲空间容纳B,只能从后面开始比较,否则会把原来的内容覆盖
        //用j做循环条件,因为j比i小.遍历完B了说明已经排好了
        int len = m+n-1;
        int i = m - 1;
        int j = n -1;
        while(j>=0){
            if(i<0||B[j]>=A[i]){
                A[len] = B[j--];
            }else{
                A[len] = A[i--];
            }
            len--;
        }
    }
}
