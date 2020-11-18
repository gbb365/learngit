
// @Title: 从上到下打印二叉树 (从上到下打印二叉树 LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 13:59:25
// @Runtime: 1 ms
// @Memory: 38.5 MB

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
    public int[] levelOrder(TreeNode root) {
        /**
            二叉树的层序遍历，用一个辅助队列
            返回的是数组

        **/
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return new int[]{};
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            list.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        int[]result = new int[list.size()];
        for(int i = 0 ; i < list.size();i++){
            result[i] = list.get(i);
        }
        return result; 
        
    }
}
