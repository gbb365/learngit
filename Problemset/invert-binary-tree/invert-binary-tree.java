
// @Title: 翻转二叉树 (Invert Binary Tree)
// @Author: 15218859676
// @Date: 2020-10-26 17:03:58
// @Runtime: 0 ms
// @Memory: 35.6 MB

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
    public TreeNode invertTree(TreeNode root) {
        //翻转二叉树
        // if(root == null){
        //     return root;
        // }
        // TreeNode left = root.left;
        // root.left = invertTree(root.right);
        // root.right = invertTree(left);
        // return root;

        //先序
        if(root == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
        //后序
        // if(root == null){
        //     return root;
        // }
        // invertTree(root.left);
        // invertTree(root.right);
        // TreeNode temp = root.left;
        // root.left = root.right;
        // root.right = temp;
        // return root;
    }
}
