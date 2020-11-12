
// @Title: 路径总和 II (Path Sum II)
// @Author: 15218859676
// @Date: 2020-11-09 20:34:07
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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return res;
        }
        pathSum(root,sum,new LinkedList<Integer>());
        return res;
    }
    public void pathSum(TreeNode node ,int sum,LinkedList<Integer>stack){
        if(node == null){
            return;
        }
        stack.addLast(node.val);
        if(node.left == null && node.right == null){
            if(node.val == sum){
                // list.add(list);
                // res.add(stack);
                res.add(new ArrayList(stack));
            }
        }
        pathSum(node.left,sum - node.val,stack);
        pathSum(node.right,sum - node.val,stack);
        //每次处理完一个左或者右节点,递归结束后都会把它清除
        stack.removeLast();
    }
}
