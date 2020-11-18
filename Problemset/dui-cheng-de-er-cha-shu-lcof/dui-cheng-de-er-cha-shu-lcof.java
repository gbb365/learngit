
// @Title: 对称的二叉树 (对称的二叉树  LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 11:36:39
// @Runtime: 0 ms
// @Memory: 36.7 MB

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode left,TreeNode right){
        if(left == null&& right == null){
            return true;
        }if(left == null || right == null){
            return false;
        }
        return left.val == right.val && helper(left.right,right.left)&&helper(left.left,right.right);
    }
}
