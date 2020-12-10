
// @Title: 数组中的逆序对 (数组中的逆序对  LCOF)
// @Author: 15218859676
// @Date: 2020-11-30 22:27:28
// @Runtime: 34 ms
// @Memory: 48.3 MB


class Solution {
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len < 2){
            return 0;
        }
        int[] temp = new int[len];
        return reversePairs(nums, 0, len - 1,temp);
    }
    public int reversePairs(int[]nums, int left ,int right, int[]temp){
        if(left == right){
            return 0;
        }
        int mid = left + (right - left) /2;
        int leftPairs = reversePairs(nums, left, mid, temp);
        int rightPairs = reversePairs(nums, mid + 1, right,temp);
        if (nums[mid] <= nums[mid + 1]){
            return leftPairs + rightPairs;
        }
        int crossPairs = merge(nums, left, mid, right, temp);
        return  leftPairs + rightPairs + crossPairs;

    }
    public int merge(int[]nums, int left, int mid , int right, int []temp){
        System.arraycopy(nums,left,temp,left,right -left +1);
//        for (int i = left; i <= right; i++) {
//            temp[i] = nums[i];
//        }
        int i = left;
        int j = mid +1;
        int count = 0;
        for(int k = left ; k <= right ;k++){
            if (i == mid +1){
                nums[k] = temp[j];
                j++;
            }else if ( j == right +1){
                nums[k] = temp[i];
                i++;
//            }else if(nums[i] <= nums[j]){
            }else if(temp[i] <= temp[j]){
                nums[k] = temp[i];
                i++;
            }else {
                nums[k] = temp[j];
                j++;
                count+=(mid - i +1);
            }
        }
        return count;
    }
}

