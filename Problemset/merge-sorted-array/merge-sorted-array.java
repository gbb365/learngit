
// @Title: 合并两个有序数组 (Merge Sorted Array)
// @Author: 15218859676
// @Date: 2020-09-17 20:44:05
// @Runtime: 0 ms
// @Memory: 39 MB

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //使用双指针，从后面开始遍历。否则会把nums1覆盖
        int index1 = m - 1;
        // int index2 = n - 2;
        int index2 = n - 1;
        int mergeIndex = m+n-1;
        while(index1 >= 0 || index2 >= 0){
            if(index1 < 0 ){
                nums1[mergeIndex--] = nums2[index2--];
            }else if(index2< 0){
                nums1[mergeIndex--] = nums1[index1--];
            }else if(nums1[index1]>nums2[index2]){
                nums1[mergeIndex--] = nums1[index1--];
            }else{
                nums1[mergeIndex--] = nums2[index2--];
            }
        }
    }
}
