
// @Title: 左叶子之和 (Sum of Left Leaves)
// @Author: 15218859676
// @Date: 2020-11-09 17:20:27
// @Runtime: 1 ms
// @Memory: 36.4 MB

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
    public int sumOfLeftLeaves(TreeNode root) {
        /**
            非递归写法：如果root.left的左右都为空就把它累加，否则就添加到队列
            层序遍历
        */
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int sum = 0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null){
                if(node.left.left == null && node.left.right == null){
                sum+= node.left.val;
            }else{
                queue.offer(node.left);
            }

            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }

        return sum;

        /**
            返回所有左叶子之和。左叶子
            递归判读每一个节点的左孩子，累加节点值
        
        if(root==null){
            return 0;
        }
        //左右孩子都没有的才是叶子节点
        if(root.left !=null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        */
        

    }
}
