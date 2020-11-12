
// @Title: 验证二叉搜索树 (Validate Binary Search Tree)
// @Author: 15218859676
// @Date: 2020-11-12 14:16:37
// @Runtime: 6 ms
// @Memory: 38.4 MB

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
    public boolean isValidBST(TreeNode root) {
        /**
            结点的左子树只包含小于当前结点的数；
            结点的右子树只包含大于当前结点的数；
            所有左子树和右子树自身必须也是二叉搜索树
        */
        if(root == null){
            return true;
        }
        return dfs(root.left,root.val,true)&&dfs(root.right,root.val,false)&&
        isValidBST(root.left)&&isValidBST(root.right);

    }
    public boolean dfs(TreeNode node,int val,boolean isLeft){
        if(node == null){
            return true;
        }
        if(isLeft){
            return node.val< val && dfs(node.left,val,isLeft)&&dfs(node.right,val,isLeft);
        }else{
            return node.val> val && dfs(node.left,val,isLeft)&&dfs(node.right,val,isLeft);
        }
    }
        //错误，没有考虑到节点的范围。
        // if(root == null|| (root.left == null && root.right==null)){
        //     return true;
        // }else if(root.left == null){
        //     return root.val < root.right.val && isValidBST(root.right);
        // }else if(root.right == null){
        //     return root.left.val< root.val && isValidBST(root.left);
        // }else {
        //     return (root.left.val<root.val) && root.right.val > root.val && isValidBST(root.left)&&
        // isValidBST(root.right);
        // }
        
    
}
