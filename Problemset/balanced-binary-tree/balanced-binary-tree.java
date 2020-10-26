
// @Title: 平衡二叉树 (Balanced Binary Tree)
// @Author: 15218859676
// @Date: 2020-10-26 16:30:09
// @Runtime: 1 ms
// @Memory: 38.4 MB

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
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
    /**
        /**
            判断是否是平衡树(每个子树的高度差的绝对值不超过1)
            自顶向下,判断某个节点的左右子树高度是否大于1,然后递归判断这个节点的左右子树
            时间复杂度比较高,需要判断整个树的所有节点.
        
        if(root == null){
            return true;
        }
        //判断这个节点左右的高度差
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            return false;
        }
        //递归判断左右子树所有的节点
        return isBalanced(root.left)&&isBalanced(root.right);
        
    }
    //求每个子树的高度
    public int getHeight(TreeNode node){
        if(node == null){
            return 0 ;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left,right)+1;
    }
    */
    //方法2.自底向上,访问一个节点的时候先递归判断其左右子树是否是平衡的.
    height(root);
    return result;

    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        //每次先递归去判断该节点的左右子树是否是平衡的,如果不平衡了可以把标记设置为false
        int left = height(node.left);
        int right = height(node.right);
        if(Math.abs(left-right)>1){
            result = false;
        }
        return Math.max(left,right)+1;
    }
    
}
