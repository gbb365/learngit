
// @Title: 二叉树的最小深度 (Minimum Depth of Binary Tree)
// @Author: 15218859676
// @Date: 2020-11-09 16:17:05
// @Runtime: 9 ms
// @Memory: 59 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        /**
            找出二叉树的最小深度：从根节点到最近叶子节点的的最短路径上的节点数
        */
        if(root == null){
            return 0;
        }
        //针对有一个孩子节点为空的情况做出判断
        //不然如果有一个为空就直接返回1。不符合题目的根到最近叶子的要求
        if(root.left == null ||root.right == null){
            return Math.max(minDepth(root.left),minDepth(root.right))+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;


    }
}
