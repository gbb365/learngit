
// @Title: 二叉树的最近公共祖先 (Lowest Common Ancestor of a Binary Tree)
// @Author: 15218859676
// @Date: 2020-11-15 09:53:48
// @Runtime: 7 ms
// @Memory: 40.7 MB

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
            返回二叉树的最近公共祖先。上一题的返回二叉搜素树的最近公共祖先
            最近公共祖先的定义： 设节点 rootroot 为节点 p, qp,q 的某公共祖先，若其左子节点                   root.leftroot.left 和右子节点 root.rightroot.right 都不是 p,qp,q 的公共祖先，
            则称 rootroot 是 “最近的公共祖先” 。

            后序遍历，先知道左右子树的结果才能自己操作
            如果左右都非空，返回它们的公共祖先
            如果只存在一个，就返回存在的一个
            p,q都不存在，就返回空
        */
        if(root == null || p == root || q == root){
            return root;
        }
        //先去左子树中寻找p,q的公共祖先
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        //去右子树中找
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&& right !=null){
            return root;
        }else if(left!=null){
            return left;
        }
        return right;

    }
}
