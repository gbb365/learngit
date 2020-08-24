
// @Title: 反转链表 (Reverse Linked List)
// @Author: 15218859676
// @Date: 2020-08-17 13:30:40
// @Runtime: 0 ms
// @Memory: 40 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode pre = null;
        // ListNode tmp = null;
        // while(head !=null){
        //     tmp = head.next;
        //     head.next = pre;
        //     pre = head;
        //     head = tmp;
        // }
        // return pre;
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
