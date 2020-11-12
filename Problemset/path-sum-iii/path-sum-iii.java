
// @Title: 路径总和 III (Path Sum III)
// @Author: 15218859676
// @Date: 2020-11-10 15:03:03
// @Runtime: 32 ms
// @Memory: 38.1 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        //双重递归
        if(root == null){
            return 0;
        }
        //包含根节点和不包含的都要算(这里是关键)
        return helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public int helper(TreeNode node ,int sum){
        int res = 0;
        if(node == null){
            return 0;
        }
        if(node.val == sum){
            res++;
        }
        res += helper(node.left,sum-node.val);
        res += helper(node.right,sum - node.val);
        return res;
    }
}
