
// @Title: 二叉树的镜像 (二叉树的镜像  LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 11:23:40
// @Runtime: 0 ms
// @Memory: 35.8 MB

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
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode left = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(left);
        return root;
    }
}
