
// @Title: 二叉搜索树中第K小的元素 (Kth Smallest Element in a BST)
// @Author: 15218859676
// @Date: 2020-11-13 10:38:02
// @Runtime: 1 ms
// @Memory: 38.4 MB

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

    public int kthSmallest(TreeNode root, int k) {
        int num = 0 ;
        int res = -1;
        Stack<TreeNode> stack = new Stack();
        TreeNode cur = root ;
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            num++;
            if(num == k){
                res = cur.val;
                break;
            }
            cur = cur.right;
        }
        return res;
    }
    // int num = 0 ;
    // int res = 0;
    // //不用完全遍历，到达k的时候直接返回就行了
    // public int kthSmallest(TreeNode root, int k) {
    //     inorder(root,k);
    //     return res;
    // }
    // public void inorder(TreeNode root, int k){
    //     if(root == null){
    //         return ;
    //     }
    //     inorder(root.left,k );
    //     num++;
    //     if(num == k){
    //         res = root.val;
    //         return;
    //     }
    //     inorder(root.right, k );
    // }
    // List<Integer> list = new ArrayList<Integer>();
    
    // public int kthSmallest(TreeNode root, int k) {
        
    //     /**
    //         返回二叉搜索树中的第k小元素
    //         思路：中序遍历加入数组，返回nums[k-1]
    //     */
    //     if(root == null){
    //         return 0;
    //     }
    //     //又是不先调用就返回结果
    //     inorder(root);
    //     return list.get(k-1);
    // }
    // public void inorder(TreeNode root){
    //     if(root == null ){
    //         return ;
    //     }
    //     inorder(root.left);
    //     list.add(root.val);
    //     inorder(root.right);
    // }
}
