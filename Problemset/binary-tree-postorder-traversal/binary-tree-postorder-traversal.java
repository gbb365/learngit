
// @Title: 二叉树的后序遍历 (Binary Tree Postorder Traversal)
// @Author: 15218859676
// @Date: 2020-09-27 14:07:44
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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode node = root;
        while(node !=null || !stack.isEmpty()){
            if(node !=null){
                list.add(node.val);
                stack.push(node);
                node = node.right;
            }else{
                node = stack.pop();
                node = node.left;
            }
        }
        Collections.reverse(list);
        return list;
    }
}
