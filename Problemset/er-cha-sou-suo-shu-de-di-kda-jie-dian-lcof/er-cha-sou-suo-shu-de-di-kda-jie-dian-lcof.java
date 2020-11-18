
// @Title: 二叉搜索树的第k大节点 (二叉搜索树的第k大节点  LCOF)
// @Author: 15218859676
// @Date: 2020-11-17 15:39:36
// @Runtime: 0 ms
// @Memory: 38.3 MB

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

    int res = 0 ;
    int cnt = 0;
    public int kthLargest(TreeNode root, int k) {
        //其实可以不用全部节点都遍历，遍历到第k大的时候就可以停止了
        //根据二叉搜索树的特性，应该从右边开始遍历。
        helper(root,k);
        return res;
    }
    public void helper(TreeNode root ,int k){
        if(root == null){
            return;
        }
        if(root.right!=null){
            helper(root.right,k);
        }
        if(++cnt == k){
            res = root.val;
            return ;
        }
        if(root.left !=null){
            helper(root.left,k);
        }
    }
    // ArrayList<Integer> list = new ArrayList<>();
    // public int kthLargest(TreeNode root, int k) {
    //     //最简单的办法就是中序遍历，取序列的倒数第k个
    //     if(root == null){
    //         return -1;
    //     }
    //     inOrder(root);
    //     return list.get(list.size()-k);
        
    // }
    // public void inOrder(TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     inOrder(root.left);
    //     list.add(root.val);
    //     inOrder(root.right);
    // }
}
