
// @Title: 二叉树的层序遍历 (Binary Tree Level Order Traversal)
// @Author: 15218859676
// @Date: 2020-11-15 10:31:35
// @Runtime: 1 ms
// @Memory: 38.8 MB

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
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> levelOrder(TreeNode root) {
        /**
            返回二叉树层序遍历的结果，每一层用一个list接收，最后返回一个大的list
        */
        level(root);
        return result;
    }
    public void level(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            while(size>0){
                TreeNode node = queue.remove();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                list.add(node.val);
                size--;
            }
            result.add(list);
            list = null;
        }
    }
}
