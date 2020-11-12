
// @Title: 相同的树 (Same Tree)
// @Author: 15218859676
// @Date: 2020-11-09 16:38:24
// @Runtime: 0 ms
// @Memory: 36.1 MB

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /**
        判断两棵树是否是相同的树。结构相同，节点具有相同的值
        */
        if(p == null && q == null){
            return true;
        }else if(p == null && q !=null){
            return false;
        }else if(p!=null && q ==null){
            return false;
        }else{
            return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right); 
        }
    }
}
