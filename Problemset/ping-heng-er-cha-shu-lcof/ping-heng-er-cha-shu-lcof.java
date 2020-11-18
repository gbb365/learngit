
// @Title: 平衡二叉树 (平衡二叉树 LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 14:31:01
// @Runtime: 1 ms
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
    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);
        if(left == -1 || right == -1 || Math.abs(left - right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        //自底向上
        if(root == null){
            return true;
        }
        return helper(root) != -1;
    }


    //自顶向下,判断左右子树的高度是否是相差在1之内，递归判断树中的每一个节点
    //     if(root == null){
    //         return true;
    //     }

    //     return Math.abs(helper(root.left)-helper(root.right))<2&&isBalanced(root.left)&&isBalanced(root.right);
    // }
    // //比较左右子树的高度差是否小于等于1
    // public int helper(TreeNode node1){
    //     if(node1 == null){
    //         return 0;
    //     }
    //     int left = helper(node1.left);
    //     int right = helper(node1.right);
    //     return Math.max(left,right)+1;
    //}
}
