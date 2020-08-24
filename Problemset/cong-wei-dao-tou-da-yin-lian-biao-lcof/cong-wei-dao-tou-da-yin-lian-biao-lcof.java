
// @Title: 从尾到头打印链表 (从尾到头打印链表 LCOF)
// @Author: 15218859676
// @Date: 2020-08-21 11:00:43
// @Runtime: 0 ms
// @Memory: 40.3 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        //方法1.使用栈
        // Stack<Integer> stack = new Stack<Integer>();
        // while(head!=null){
        //     stack.push(head.val);
        //     head = head.next;
        // }
        // int lent = stack.size();
        //  int []result = new int[lent];
        //     for(int i = 0 ;i < lent;i++){
        //         result[i] = stack.pop();
        //      }
        // return result;

        //方法2.不使用栈，直接找出长度，从数组的后面开始填数字
        int len = 0;
        ListNode node = head;
        while(node!= null){
            node = node.next;
            len++;
        }
        int [] result = new int[len];
        for(int i = len-1;i>=0;i--){
            result[i] = head.val;
            head = head.next;
        }
        return result;
    }
}
