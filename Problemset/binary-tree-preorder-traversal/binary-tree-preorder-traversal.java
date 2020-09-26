
// @Title: 二叉树的前序遍历 (Binary Tree Preorder Traversal)
// @Author: 15218859676
// @Date: 2020-09-26 14:47:27
// @Runtime: 1 ms
// @Memory: 37.3 MB

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
    private List<Integer> list  = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
    //递归解法
    // public void preOrder(TreeNode root){
    //     if(root == null){
    //         return ;
    //     }
    //     list.add(root.val);
    //     preOrder(root.left);
    //     preOrder(root.right);
    // }
    //迭代法
    public void preOrder(TreeNode root){
        if (root == null){
            return ;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }if(node.left !=null){
                stack.push(node.left);
            }
        }
    }
    
}
