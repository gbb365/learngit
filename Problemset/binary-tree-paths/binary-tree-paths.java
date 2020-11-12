
// @Title: 二叉树的所有路径 (Binary Tree Paths)
// @Author: 15218859676
// @Date: 2020-11-10 14:25:50
// @Runtime: 12 ms
// @Memory: 38.7 MB

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
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        //方法1.回溯
        if(root == null){
            return res;
        }
        binaryTreePaths(root,new String());
        return res;
    }
    public void binaryTreePaths(TreeNode node, String s){
        if(node == null){
            return;
        }
        s += node.val;
        //可以把这个做成一个else放到下面,先加了"->"再递归
        if(node.left !=null || node.right!=null){
            s += "->";
        }
        
        if(node.left == null &&node.right == null){
            res.add(s);
        }
        binaryTreePaths(node.left,s);
        binaryTreePaths(node.right,s);
        s = s.substring(0,s.length()-1);
       
    }
}
