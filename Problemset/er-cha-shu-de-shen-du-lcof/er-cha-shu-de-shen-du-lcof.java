
// @Title: 二叉树的深度 (二叉树的深度 LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 11:25:28
// @Runtime: 0 ms
// @Memory: 38.2 MB

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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
