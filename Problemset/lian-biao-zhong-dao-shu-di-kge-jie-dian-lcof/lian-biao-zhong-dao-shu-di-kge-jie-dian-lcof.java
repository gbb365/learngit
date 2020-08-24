
// @Title: 链表中倒数第k个节点 (链表中倒数第k个节点 LCOF)
// @Author: 15218859676
// @Date: 2020-08-21 10:32:36
// @Runtime: 0 ms
// @Memory: 37.8 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null){
            return head;
        }
        while(k>0){
            fast = fast.next;
            k--;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
