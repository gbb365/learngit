
// @Title: 数组中的第K个最大元素 (Kth Largest Element in an Array)
// @Author: 15218859676
// @Date: 2020-10-22 17:09:43
// @Runtime: 9 ms
// @Memory: 38.4 MB


      /**
       * solution
       */
      class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int target = nums.length - k;
        while(true){
            int index = partation(nums,left,right);
            if(index == target){
                return nums[index];
            }else if(index > target){
                right = index - 1;
            }else {
                left = index+1;
            }
        }
    }

          /**
           *
           * @param nums
           * @param left
           * @param right
           * @return
           */
    private int partation(int[] nums, int left, int right) {
        //应该随机从数组中抽出一个数作为基准，否则有可能出现某些用例通过的时间很久
        int pivot = nums[left];
        int j = left;
        for(int i  = left + 1;i <= right; i++){
            //小于pivot的都被交换到前面，由于不小于的都跳过了，j的作用就是为了记录当前比pivot小的最后一个位置
            if(nums[i]<pivot){
                j++;
                swap(nums,j,i);
            }
        }
        // 在之前遍历的过程中，满足 [left + 1, j] < pivot，并且 (j, i] >= pivot
        // 交换以后 [left, j - 1] < pivot, nums[j] = pivot, [j + 1, right] >= pivot
        swap(nums,j,left);
        return j;
    }
    private void swap(int[] nums,int index1 ,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

      }

