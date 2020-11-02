
// @Title: 搜索旋转排序数组 (Search in Rotated Sorted Array)
// @Author: 15218859676
// @Date: 2020-11-02 20:05:33
// @Runtime: 0 ms
// @Memory: 37.8 MB


      /**
       * 搜索旋转排序数组
       */
      class Solution {
          /**
           * 二分法，一次排序一半的数字
           * @param nums
           * @param target
           * @return
           */
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len==0){
            return  -1;
        }
        int left = 0;
        int right = len -1;
        //每次排除一半的数字,循环退出的时候一定会有left == right,因此最后要判断这个left时候是符合条件的
        while (left<right){
            //向上取整,避免可能出现死循环 mid = left --> lef = mid;
            int mid  = left + (right - left+1)/2;
            //后面这部分是有序的
            if (nums[mid]< nums[right]){
                //target出现在后半段,排除前面的一半
                if (nums[mid]<= target && target <= nums[right]){
                    left = mid;
                }else {
                    right = mid -1;
                }
                //前面的这部分是有序的
            }else {
                //取nums[mid-1]是为了形式上统一起来,左右边界的收缩一致
                if (nums[left]<=target && target <= nums[mid-1]){
                    right = mid-1;
                }else {
                    left = mid;
                }
            }
        }
        if (nums[left] == target){
            return left;
        }
        return -1;
    }
}

