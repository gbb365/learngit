
// @Title: 二叉树的最近公共祖先 (二叉树的最近公共祖先 LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 11:13:00
// @Runtime: 7 ms
// @Memory: 40 MB

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
        if(root == null || root == p|| root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right !=null){
            return root;
        }if(left == null){
            return right;
        }
        if(right ==null){
            return left;
        }
        return null;
    }
}
