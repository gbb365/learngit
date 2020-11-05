
// @Title: 第一个错误的版本 (First Bad Version)
// @Author: 15218859676
// @Date: 2020-11-04 21:46:03
// @Runtime: 16 ms
// @Memory: 35.1 MB

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        /**
            错误版本之后的所有版本都是错误的。所以要找到第一个错误的版本。
            通过调用 isBdVersion(version) 来判断是否错误
        */  
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left) /2;
            boolean flag = isBadVersion(mid);
            if(!flag){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
