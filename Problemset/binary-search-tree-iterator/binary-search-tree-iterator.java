
// @Title: 二叉搜索树迭代器 (Binary Search Tree Iterator)
// @Author: 15218859676
// @Date: 2020-11-10 20:23:10
// @Runtime: 23 ms
// @Memory: 43.7 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    
    Stack<TreeNode> stack;
    TreeNode cur ;
    //用二叉搜索树的根节点初始化迭代器
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        cur = root;
        while(cur !=null){
            stack.push(cur);
            cur = cur.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode cur = stack.pop();
        int value = cur.val;
        TreeNode temp = cur.right;
        while(temp!=null){
            stack.push(temp);
            temp = temp.left;
        }
        return value;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size()>0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
