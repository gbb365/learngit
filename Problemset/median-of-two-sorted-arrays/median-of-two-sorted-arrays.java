
// @Title: 寻找两个正序数组的中位数 (Median of Two Sorted Arrays)
// @Author: 15218859676
// @Date: 2020-11-06 09:45:56
// @Runtime: 3 ms
// @Memory: 40.1 MB

class Solution {

    public int getKth(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int k ){
        int len1 = end1 - start1 + 1;
        int len2 = end2- start2 + 1;
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if(len1> len2){
            return getKth(nums2,start2,end2,nums1,start1,end1,k);
        }
        if(len1 == 0){
            return nums2[start2+k-1];
        }
        if(k == 1){
            return Math.min(nums1[start1],nums2[start2]);
        }
        //待排除的位置
        int i = start1 + Math.min(len1,k/2) - 1;
        int j = start2 + Math.min(len2,k/2) - 1;
        if(nums1[i]> nums2[j]){
            //排除nums2中j前面的，包括j
            return getKth(nums1,start1,end1,nums2,j+1,end2,k-(j-start2+1));
        }else{
            return getKth(nums1,i+1,end1,nums2,start2,end2,k-(i-start1+1));
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /**
            方法3.二分法 O(log(m+n))

        */
        int n = nums1.length;
        int m = nums2.length;
        //因为数组是从索引0开始的，因此我们在这里必须+1，即索引(k+1)的数，才是第k个数。
        //左中位数
        int left = (m + n + 1)/2;
        //右中位数
        int right = (m + n + 2)/2;
        //保持奇偶一致
        return (getKth(nums1,0,n-1,nums2,0,m-1,left)+getKth(nums1,0,n-1,nums2,0,m-1,right))*0.5;







        //方法2.不适用归并，直接在两个数组中找中位数
        /**
        int left =-1;
        int right=-1;
        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;
        int astart = 0;
        int bstart = 0;
        //无论是奇数还是偶数，都是遍历len/2+1次
        for(int i = 0 ;i <= len/2;i++){
            //用left记录当前的前一个数。处理长度是偶数的情况
            left = right;
            //这个逻辑处理写的不错啊，a > m ,直接记录nums2.
            //当num2越界了，就不用判断元素大小了，直接取nums1
            //a<m 且 b 没越界 ，才判断nums1 和nums2的大小
            if(astart < m && (bstart >= n || nums1[astart]< nums2[bstart])){
               right = nums1[astart++];
            }else{
                right = nums2[bstart++];
            }
        }
        //如果是偶数的，取两者之和/2
        if((len &1) ==0){
            return (left + right)/2.0;
        }
        //奇数直接返回中间的那个
        return right;
        */





        //方法1. 归并两个数组。找中位数...
        //垃圾佬解法。归并一开始还写错了。。。
        //时间复杂度不合要求，改用二分。
        /**
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1+len2];
        int k = 0;
        while(i< len1 && j < len2){
            if(nums1[i]<=nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
          
        }
        //这里要用while，一开始用了if。。。
        while(i < len1){
            arr[k++] = nums1[i++];
        }
        while(j< len2){
            arr[k++] = nums2[j++];
        }
        
        int length = len1+len2;
        if((length)%2==0){
            //这里计算会出现问题。默认是向下取整了
            return (arr[length/2]+arr[length/2-1])/2.0;
        }else{
            return arr[length/2];
        }
        */
    }
}
