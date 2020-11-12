
// @Title: 二叉树的中序遍历 (Binary Tree Inorder Traversal)
// @Author: 15218859676
// @Date: 2020-11-11 13:46:21
// @Runtime: 1 ms
// @Memory: 36.6 MB

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
        // inOrder(root);
        Stack<TreeNode> stack = new Stack();
        putAllLeft(root,stack);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            list.add(cur.val);
            putAllLeft(cur.right,stack);
        }
        return list;
    }
    public void putAllLeft(TreeNode node ,Stack stack){
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
    }
    // public void inOrder(TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     inOrder(root.left);
    //     list.add(root.val);
    //     inOrder(root.right);
    // }

    // public void inOrder(TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     //不断将左子树压栈。到末端后，弹出一个访问右节点
    //     Stack<TreeNode> stack = new Stack<TreeNode>();
    //     while(stack.size() >0 || root!=null){
    //         if(root!=null){
    //             stack.push(root);
    //             root = root.left;
    //         }else{
    //             TreeNode temp = stack.pop();
    //             list.add(temp.val);
    //             root = temp.right;
    //         }
    //     }
    // }
}
