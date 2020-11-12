
// @Title: 二叉树的右视图 (Binary Tree Right Side View)
// @Author: 15218859676
// @Date: 2020-11-10 22:29:49
// @Runtime: 1 ms
// @Memory: 37.2 MB

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
    public List<Integer> rightSideView(TreeNode root) {
        //层序遍历，将每一层最右边的添加到list
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(i == size-1){
                    list.add(node.val);
                }
            }
            
        }
        return list;
    }
}
