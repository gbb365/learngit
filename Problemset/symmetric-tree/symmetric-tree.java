
// @Title: 对称二叉树 (Symmetric Tree)
// @Author: 15218859676
// @Date: 2020-11-08 20:25:11
// @Runtime: 0 ms
// @Memory: 36.4 MB

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
        /**判断二叉树是否镜像对称
           判断当前节点左右孩子的值是否相等，然后递归去左右孩子是否是对称的
        */
        if(root == null){
            return true;
        }
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1 == null || node2==null){
            return false;
        }
        return node1.val == node2.val && helper(node1.left,node2.right) && 
        helper(node1.right,node2.left);
    }
}
