
// @Title: 求根到叶子节点数字之和 (Sum Root to Leaf Numbers)
// @Author: 15218859676
// @Date: 2020-11-09 22:53:40
// @Runtime: 0 ms
// @Memory: 35.8 MB

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
     /**
     * 计算从根到叶子节点的路径上所有数字的和
     * 和路径和2类似，求出所有的路径组合后，再遍历每个list累计数字就可以了吧
     * @param root
     * @return
     */
    // List<List<Integer>> res = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        //方法2.使用cumsum的概念
        return helper(root,0);
    }
    public int helper(TreeNode node ,int i ){
        if(node == null ){
            return 0;
        }
        int temp = i*10+node.val;
        if(node.left == null&& node.right==null){
            return temp;
        }
        return helper(node.left,temp)+helper(node.right,temp);
    }

//方法1.回溯找到所有的路径,转成字符串再计算
//         if(root == null){
//             return 0;
//         }
//         int sum = 0;
//         //傻逼吧.这个放到前面都是没有东西的...
// //        for(List<Integer> link : res){
// //            String s = "";
// //            for (int i : link){
// //                s+=i;
// //            }
// //            sum+=Integer.parseInt(s);
// //        }
//         sumNumbers(root, new LinkedList<Integer>());
//         for(List<Integer> link : res){
//             String s = "";
//             for (int i : link){
//                 s+=i;
//             }
//             sum+=Integer.parseInt(s);
//         }
//         return sum;
//     }
//     public void sumNumbers(TreeNode node,LinkedList<Integer> stack){
//         if(node == null){
//             return;
//         }
//         stack.add(node.val);
//         if(node.left == null && node.right == null){
//             res.add(new ArrayList<>(stack));
//         }
//         sumNumbers(node.left,stack);
//         sumNumbers(node.right,stack);
//         stack.removeLast();
//     }
   
}
