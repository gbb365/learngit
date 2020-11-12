
// @Title: 二叉搜索树的最近公共祖先 (Lowest Common Ancestor of a Binary Search Tree)
// @Author: 15218859676
// @Date: 2020-11-12 13:18:24
// @Runtime: 6 ms
// @Memory: 39.2 MB

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /**
        二叉搜索树的最近公共祖先
        要么就在同一边，那么最近公共祖先只能是其中之一，如果不在同一边，公共祖先只能是root
        */
        if(root == null || root == p || root == q){
            return root;
        }
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
