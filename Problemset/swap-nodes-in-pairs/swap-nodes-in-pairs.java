
// @Title: 两两交换链表中的节点 (Swap Nodes in Pairs)
// @Author: 15218859676
// @Date: 2020-08-27 09:14:40
// @Runtime: 0 ms
// @Memory: 36.8 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        //方法1.类似链表反转的递归
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
