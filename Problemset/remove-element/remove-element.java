
// @Title: 移除元素 (Remove Element)
// @Author: 15218859676
// @Date: 2020-09-29 09:17:01
// @Runtime: 0 ms
// @Memory: 37.7 MB

class Solution {
    public int removeElement(int[] nums, int val) {
        //可以使用两个头尾指针,从头开始,如果头=val,就交换到尾,如果尾=val,直接-1
        int i = 0 , j = nums.length-1;
        while(i<=j){
            if(nums[i] == val && nums[j]!=val){
                swap(nums,i++,j--);
            }else if(nums[i]==val && nums[j]==val){
                j--;
            }else{
                i++;
            }
        }
        return i;
    }
    public void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
