
// @Title: 从上到下打印二叉树 III (从上到下打印二叉树 III LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 16:26:23
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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        /**
            按之字形打印二叉树，第一行由左到右，第二行由右到左，第三行由左到右
            如何控制出队的方向，用boolean变量？
            可以直接改变插入array的顺序，当然也可以改变入队列的顺序。
        */
        
         //层序遍历
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
       
        queue.add(root);
        
        while(!queue.isEmpty()){
            LinkedList<Integer> array = new LinkedList<>();
            int size = queue.size();
            while(size>0){
                TreeNode node = queue.poll();
                if(list.size()%2==0){
                    array.addLast(node.val);
                }else{
                    array.addFirst(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            list.add(array);     
        }  
        return list;
    }
}
