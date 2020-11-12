
// @Title: 完全二叉树的节点个数 (Count Complete Tree Nodes)
// @Author: 15218859676
// @Date: 2020-11-08 21:22:23
// @Runtime: 0 ms
// @Memory: 41.1 MB

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
    public int countNodes(TreeNode root) {

        /**
            解法2.求左右的高度，用完全二叉树的公式
        */
        if(root == null){
            return 0;
        }
        int h1 = 0;
        TreeNode node1 = root;
        //循环没跑起来
        // while(node1.left!=null){
        //     h1++;
        // }
        while(node1!=null){
            node1 = node1.left;
            h1++;
        }
        int h2 = 0 ;
        TreeNode node2 = root;
        while(node2 != null){
            node2 = node2.right;
            h2++;
        } 
        if(h1 == h2){
            return (1<<h1)-1;
        }else{
            return 1+ countNodes(root.left)+countNodes(root.right);
        }

        
        /**
        求完全二叉树节点的个数
        可以用层序遍历.遍历了所有的节点。时间复杂太高。没有利用完全二叉树的性质
       
        if(root == null){
            return 0;
        }
        int count = 0;
        Queue<TreeNode> queue = new ArrayDeque();
        queue.offer(root); 
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            count++;
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        return count;
         */
    }
}
