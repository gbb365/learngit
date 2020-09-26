
// @Title: 二叉树的中序遍历 (Binary Tree Inorder Traversal)
// @Author: 15218859676
// @Date: 2020-09-26 15:18:30
// @Runtime: 1 ms
// @Memory: 37 MB

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
    private List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }
    // public void inOrder(TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     inOrder(root.left);
    //     list.add(root.val);
    //     inOrder(root.right);
    // }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(stack.size() >0 || root!=null){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }else{
                TreeNode temp = stack.pop();
                list.add(temp.val);
                root = temp.right;
            }
        }
    }
}
