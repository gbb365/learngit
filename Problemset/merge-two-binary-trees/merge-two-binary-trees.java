
// @Title: 合并二叉树 (Merge Two Binary Trees)
// @Author: 15218859676
// @Date: 2020-10-26 17:17:40
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        /**
            合并二叉树:两个节点都不为空就相加作为合并的新值,否则不为null的直接作为新的二叉树节点
        */
        if(t1 == null && t2 == null){
            return null;
        }
        if(t1 == null) {
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        TreeNode root = new TreeNode(t1.val+t2.val);
        root.left = mergeTrees(t1.left,t2.left);
        root.right = mergeTrees(t1.right,t2.right);
        return root;
        
    }
}
