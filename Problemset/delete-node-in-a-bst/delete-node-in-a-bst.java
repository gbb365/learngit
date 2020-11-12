
// @Title: 删除二叉搜索树中的节点 (Delete Node in a BST)
// @Author: 15218859676
// @Date: 2020-11-12 11:07:21
// @Runtime: 0 ms
// @Memory: 39 MB

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
    public TreeNode deleteNode(TreeNode root, int key) {
        /**
            如果key比root.val小就取左边，大就取右边递归
            如果相等，就先找到右子树的最小节点（最左边的），用它代替根，然后删除找个最小的
            删除一个节点后要用左子树最右的代替，或者右子树中最左的代替
        */
        if(root == null){
            return root;
        }
        if(key>root.val){
            root.right = deleteNode(root.right,key);
            return root;
        }
        if(key<root.val){
            root.left = deleteNode(root.left,key);
            return root;
        }else{
            if(root.left == null){
                TreeNode new_root = root.right;
                root.right = null;
                return new_root;
            }
            if(root.right == null){
                TreeNode new_root = root.left;
                root.left = null;
                return new_root;
            }
            TreeNode new_root = new TreeNode(min(root.right).val);
            new_root.left = root.left;
            new_root.right = removeMin(root.right);
            root.left = null;
            root.right = null;
            return new_root;
        }

    }
    public TreeNode min(TreeNode node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }
    public TreeNode removeMin(TreeNode node){
        if(node.left == null){
            TreeNode rightNode = node.right;
            node.right = null;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }
}
