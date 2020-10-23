
// @Title: 二叉树的最大深度 (Maximum Depth of Binary Tree)
// @Author: 15218859676
// @Date: 2020-10-20 20:47:04
// @Runtime: 1 ms
// @Memory: 38 MB

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
    public int maxDepth(TreeNode root) {
        /**
            二叉树的最大深度
            可以使用递归吧,开玩笑吧。递归这么判题。。。
        */
        // if(root == null){
        //     return 0;
        // }
        // int res = Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        // return res;
        /**
            迭代法：广度优先，参考官方解法
            定义一个整型变量ans，然后每次分别遍历每一层节点，ans++

        */
        if(root == null ){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int ans  = 0 ;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                size--;
            }
            ans++;
        }
        return ans;
    }
}
