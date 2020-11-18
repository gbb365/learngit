
// @Title: 将有序数组转换为二叉搜索树 (Convert Sorted Array to Binary Search Tree)
// @Author: 15218859676
// @Date: 2020-11-13 09:32:31
// @Runtime: 0 ms
// @Memory: 38.3 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(len == 0 ){
            return null;
        }
        return merge(nums,0,len-1);
    }
    //选取节点时选择数组的中点作为根节点，以此来保证平衡性。
    public TreeNode merge(int[]nums,int left,int right){
        if(left> right){
            return null;
        }
        int mid = left+ (right - left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = merge(nums,left,mid -1);
        root.right = merge(nums,mid+1,right);
        return root;
    }
}
