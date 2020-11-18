
// @Title: 二叉搜索树的最近公共祖先 (二叉搜索树的最近公共祖先 LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 10:57:25
// @Runtime: 7 ms
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
        if(root == null || p == root || q == root){
            return root;
        }
        if(p.val < root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p, q);
        }else if(p.val > root.val&& q.val> root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
}
