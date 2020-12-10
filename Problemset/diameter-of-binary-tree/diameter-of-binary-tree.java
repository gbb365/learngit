
// @Title: 二叉树的直径 (Diameter of Binary Tree)
// @Author: 15218859676
// @Date: 2020-12-07 22:04:38
// @Runtime: 0 ms
// @Memory: 38.6 MB

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
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
        //可以返回左子树高度 + 右子树高度  x
        //二叉树的直径不一定过根节点的,需要搜索一遍所有子树
        //(例如root.left,root.right为根节点对应的直径),取最大值
        // return getHeight(root.left) + getHeight(root.right);
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }
    // public int getHeight(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     return Math.max(getHeight(root.left),getHeight(root.right))+1;
    // }
}
