
// @Title: 二叉树的层次遍历 II (Binary Tree Level Order Traversal II)
// @Author: 15218859676
// @Date: 2020-11-17 14:54:49
// @Runtime: 1 ms
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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //返回自底向上的层序遍历
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> array = new ArrayList<>();
            int size = queue.size();
            while(size > 0){
                TreeNode node = queue.remove();
                array.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            list.add(array);
            array = null;
        }
        Collections.reverse(list);
        return list;
    }
}
